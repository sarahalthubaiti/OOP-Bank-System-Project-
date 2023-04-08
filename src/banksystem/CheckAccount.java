/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Sarah Althubaiti
 */
 public class CheckAccount  { 
     
    /**
     * ArrayList from Transaction class 
     */
    private static ArrayList<Transaction> TransactionList = new ArrayList<>();
    private static int TransactionsCount; // Transaction count  
    static Date date = new Date();

    /**
     * Defult Counstrctor
     */
        public CheckAccount() {
    }

    /**
     * Get the Transaction count 
     * @return the transaction count
     */
    public static int getTransactionsCount() {
        return TransactionsCount;
    }

    /**
     * Set the Transaction count 
     * @param TransactionsCount
     */
    public static void setTransactionsCount(int TransactionsCount) {
        CheckAccount.TransactionsCount = TransactionsCount;
    }
  
    /**
     * This will add object from Transaction class to TransactionList 
     * and print the date 
     * @param t
     */
    public void addTransaction(Transaction t) {
        TransactionList.add(t);
        TransactionsCount++;
        System.out.println(date);
        
    }

    /**
     * This method will add object from Account class 
     * and print the ArrayList TransactionList and the date
     * @param a
     */
    public static void showTransactions(Account a) {
        System.out.println("Transactions for this Account Number " +"("+ a.AccountNum+"):");
        for (Transaction t : TransactionList) {
            if (t.getAccountNumber() == a.AccountNum) {
                System.out.println(t.getTransactionNum() + "-" + t.getTransactionType() + "-" + t.getTransactionAmount() + "-" + t.getBalanceAfterTransaction());
                System.out.println(date);
                
            }
        }
    }

    /**
     * toString() method
     * @return TransactionsCount
     */
    @Override
    public String toString() {
        return "Number of Transaction for this Account is("+TransactionsCount+")";
    }
}