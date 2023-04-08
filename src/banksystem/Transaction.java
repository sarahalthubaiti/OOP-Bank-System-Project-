/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;
/**
 *
 * @author Sarah Althubaiti
 */
public class Transaction {

    private int transactionNum; // Transaction number 
    private long accountNumber; // Account number
    private double transactionAmount; // Transaction amount
    private String transactionType; // Transaction type
    private double balanceAfterTransaction; // Balance after transaction
    
    /**
     * Defult Counstrctor
     */
        public Transaction() {
    }
        
    /**
     * Counstrctor
     * @param transactionNum
     * @param accountNumber
     * @param transactionAmount
     * @param transactionType
     * @param balanceAfterTransaction
     */
        public Transaction(int transactionNum, long accountNumber, double transactionAmount, String transactionType, double balanceAfterTransaction) {
        this.transactionNum = transactionNum;
        this.accountNumber = accountNumber;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }
    
    /**
     * Get the transaction number
     * @return Transaction number
     */
    public int getTransactionNum() {
        return transactionNum;
    }

    /**
     * Set the transaction number
     * @param transactionNum
     */
    public void setTransactionNum(int transactionNum) {
        this.transactionNum = transactionNum;
    }

    /**
     * Get the account number
     * @return account number
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Set the account number
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Get the transaction amount
     * @return Transaction amount
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Set the Transaction amount
     * @param transactionAmount
     */
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * Get the Transaction type 
     * @return Transaction type
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Set the Transaction type
     * @param transactionType
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Get the balance after Transaction 
     * @return the balance after transaction 
     */
    public double getBalanceAfterTransaction() {
        return balanceAfterTransaction;
    }

    /**
     * Set the balance after Transaction 
     * @param balanceAfterTransaction
     */
    public void setBalanceAfterTransaction(double balanceAfterTransaction) {
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    /**
     * toString() method
     * @return transaction number and account number
     * and transaction amount and transaction type
     * and the balance after transaction
     */
    @Override
    public String toString() {
        return "Transaction{" + "transactionNum=" + transactionNum + ", accountNumber=" + accountNumber + ", transactionAmount=" + transactionAmount + ", transactionType=" + transactionType + ", balanceAfterTransaction=" + balanceAfterTransaction + '}';
    }
    



    
}