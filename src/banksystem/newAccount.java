/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

/**
 *
 * @author Manal Alsulami 
 */
public abstract class newAccount {
     
    
     long AccountNum; // Account number
     String Password; // Password
     double balance; // Balance
    
    /**
     * Create an account
     * @param AccountNum 
     * @param Password
     */
    public abstract void createAccount(long AccountNum,String Password);
    
    /**
     * Log in function
     * @param account Array of Account Type
     * @return flag to know the account number found or not
     */
    public abstract String enter(Account account[]); 
    
    /**
     * toString method
     * @return Account number and Password and balance
     */
     @Override
    public abstract String toString(); 
    

}
    
    

