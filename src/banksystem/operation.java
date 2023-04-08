/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

import java.util.Random;

/**
 *
 * @author Arwa Albariqi & Shatha Alzahrany
 */
public class operation extends Account implements operationInterface {

    private double amount; // Amount
    private int numOfDeposits; // Number of deposits
    private int numOfWithdraws; // Number of withdraws

    CheckAccount check = new CheckAccount();

    /**
     * Defult Counstrctor
     */
    public operation() {
        super();
    }

    /**
     * Counstrctor
     *
     * @param AccountNum
     * @param Password
     */
    public operation(long AccountNum, String Password) {
        super(AccountNum, Password);
    }

    /**
     * Get the number of deposits
     *
     * @return the number if deposits
     */
    public int getNumOfDeposits() {
        return numOfDeposits;
    }

    /**
     * Set the number of deposits
     *
     * @param numOfDeposits
     */
    public void setNumOfDeposits(int numOfDeposits) {
        this.numOfDeposits = numOfDeposits;
    }

    /**
     * Get the number of withdraws
     *
     * @return the number if withdraws
     */
    public int getNumOfWithdraws() {
        return numOfWithdraws;
    }

    /**
     * Set the number of withdraws
     *
     * @param numOfWithdraws
     */
    public void setNumOfWithdraws(int numOfWithdraws) {
        this.numOfWithdraws = numOfWithdraws;
    }

    /**
     * Get the amount
     *
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Set the amount
     *
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * It will take an amount from the user And add it to the balance It will
     * print if the process is completed
     *
     * @param amount to deposit
     */
    @Override
    public void deposit(double amount) {
        super.balance += amount;
        numOfDeposits++;
        Random r = new Random();
        Transaction c = new Transaction(r.nextInt(), super.getAccountNum(), amount, "deposit", super.balance);
        check.addTransaction(c);
        System.out.println("deposit completed and transaction stored");
    }

    /**
     * A check on the amount entered by the user through Exception handling If
     * the process is correct, the amount will be withdrawn from balance It will
     * print if the process is completed
     *
     * @param amount to withdraw
     */
    @Override
    public void withdraw(double amount) {
        boolean error = false;
        do {
            try {
                if (balance == 0.0) {
                    throw new ArithmeticException("withdrawal cannot complete \nyour balance is zero");
                }
            } catch (ArithmeticException E) {
                System.out.println("The following error occurred: " + E.getMessage());
                break;
            }
            super.balance = balance;

            try {
                System.out.println("\nplease enter amount to withdraw again \nyour balance = " + balance);
                amount = sc.nextDouble();
                error = false;
                if (balance < amount && balance > 0.0) {
                    throw new ArithmeticException("Amount exceeds balance");
                } else if (amount == 0.0) {
                    throw new ArithmeticException("Invalid amount ");
                }
            } catch (ArithmeticException ex) {
                System.out.println("The following error occurred: " + ex.getMessage());
                error = true;
            }
        } while (error == true);
        super.balance -= amount;
        numOfWithdraws++;
        Random r = new Random();
        Transaction c = new Transaction(r.nextInt(), super.getAccountNum(), amount, "withdraw", super.balance);
        check.addTransaction(c);
        System.out.println("withdraw completed and transaction stored");
    }

    /**
     * Transfer the amount entered by the user to another account And checks
     * before if the amount entered greater than his balance or not
     *
     * @param amount to transfer
     * @param accountfrom the account that will make the transfer
     * @param accountto the account that will receive the transfer
     */
    @Override
    public void transfer(double amount, Account accountfrom, Account accountto) {

        if (accountfrom.balance < amount) {

            System.out.println(" fail  ");

        } else {
            accountfrom.balance -= amount;
            accountto.balance += amount;
            System.out.println("Transfer Done");

        }

    }

    /**
     * toString() method
     *
     * @return number of deposits & number of withdraws
     */
    @Override
    public String toString() {
        return "numOfDeposits=" + numOfDeposits + ", numOfWithdraws=" + numOfWithdraws;
    }
}
