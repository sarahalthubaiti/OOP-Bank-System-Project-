/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

/**
 *
 * @author Reema Sindi
 */
public interface operationInterface {
    
    /**
     * operation class will implement the method for deposits operations  
     * @param amount to deposit
     */
    public void deposit (double amount); 
    
    /**
     * operation class will implement the method for withdraw operations
     * @param amount to withdraw
     */
    public void withdraw (double amount);
    
    /**
     * operation class will implement the method for transfer operations
     * @param amount to transfer
     * @param accountfrom the account that will make the transfer
     * @param accountto the account that will receive the transfer
     */
    public void transfer(double amount, Account accountfrom,Account accountto);
}





