
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author Shimaa
 */
public class Account extends newAccount {
    
  Scanner sc = new Scanner(System.in);
    protected long AccountNum; // Account number
    protected String Password; // Password 
    protected double balance; // Account balance
  
    /**
     * Defult Counstrctor
     */
     public Account() {

    }


    /**
     * Counstrctor
     * @param AccountNum
     * @param Password
     */
     public Account(long AccountNum, String Password ) {
        this.AccountNum = AccountNum;
        this.Password = Password;
        this.balance=0.0;
    }

    /**
     * Get the account number
     * @return the account number 
     */
    public long getAccountNum() {
        return AccountNum;
    }

    /**
     * Set the account number 
     * @param AccountNum
     */
    public void setAccountNum(long AccountNum) {
        this.AccountNum = AccountNum;
    }
/**
     * Get the password
     * @return the password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * Set the password
     * @param Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
 /**
     * Get the balance
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Set the balance
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
     /**
     * Create an account
     * @param AccountNum
     * @param Password
     */
    @Override
    public void createAccount(long AccountNum, String Password) {
        Account newaccount = new Account(AccountNum, Password);
    }
     
    /**
     * Log in function
     * @param account Array of Account Type
     * @return flag to know the account number found or not
     */
    @Override
    public String enter(Account account[]) {
        String flag = "false";
        System.out.println("please enter your bank Account number");
        long accountNumber = sc.nextLong();
        for (int i = 0; i < account.length; i++) {
            if (account[i].AccountNum != accountNumber) {
                 flag = "true";
                System.out.println("unregistered account, please register first! ");
                System.out.println("----------------------------");
                break;
            } else {
                int adress = i;
                for (int j = 0; j < account.length; j++) {
                    System.out.println("please enter your password");
                    String password = sc.next();
                    if (account[adress].Password.equals(password)) {
                        break;
                    }
                    else{
                       System.out.println("wrong password please try again ");
                       System.out.println("----------------------------");
                    }
                }
                break;
            }
        }
        return flag;
    } 
    /**
     * Check on account number 
     * @param a
     * @return true if it's equals, false if it's not 
     */
    @Override
    public boolean equals(Object a) {
        Account acNo = (Account) a;

        return (acNo.AccountNum == this.AccountNum);

    }
   /**
    * toString() method
    * @return account number and password and  balance 
    */
    @Override
    public String toString() {
        return "Account{" + ", AccountNum=" + AccountNum + ", Password=" + Password + ", balance=" + balance + '}';
    }
}