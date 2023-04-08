/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

/**
 *
 * @author blue sugar
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        operation a1 = new operation();
        operation a2 = new operation(1, "aa");
        operation a3 = new operation(2, "bb");

        Account[] a = new operation[3];
        a[0] = a1; //user object
        a[1] = a2;
        a[2] = a3;
        System.out.println("Welcome to our Banking System");
        System.out.println("----------------------------");

        char option2;
        do {
            System.out.println("Choose an option : \n1-Create a new account\n2-Sign in\n3-Exit ");
            System.out.println("Enter your option (one digit) : ");
            option2 = sc.next().charAt(0);
            System.out.println();

            switch (option2) {

                case '1':
                    System.out.println("Please enter your bank Account number");
                    long AccountNum = sc.nextLong();
                    a1.setAccountNum(AccountNum);
                    System.out.println("Please enter your password");
                    String password = sc.next();
                    a1.setPassword(password);

                    a1.createAccount(AccountNum, password);

                    char option3;
                    do {
                        System.out.println("Do you want to add a balance? \n choose 1 or 2 \n 1. yes \n 2. no");
                        option3 = sc.next().charAt(0);
                        switch (option3) {
                            case '1':
                                System.out.println("Please enter your balance ");
                                double balance = sc.nextDouble();
                                a1.setBalance(balance);
                                System.out.println("The account has been created. ");
                                System.out.println("----------------------------");
                                break;

                            default:
                                if (option3 == '2') {
                                    System.out.println("The account has been created. ");
                                    System.out.println("----------------------------");
                                    break;
                                } else {
                                    System.out.println("There is no option like that... the options are : yes , no ");
                                    System.out.println("----------------------------");
                                }
                        }
                    } while (option3 != '1' && option3 != '2');
                    break; //to stop creating accounts

                case '2':
                    String flag = a1.enter(a);
                    if (flag.equals("true")) {
                        break;
                    } else {
                        char option;

                        System.out.println("----------------------------");
                        System.out.println("Welcome to your Bank Account ");
                        System.out.println("----------------------------");

                        do {
                            System.out.println("Here is the operations menu\nA. Check balance\nB. Deposit\nC. Withdraw \nD. Transfer\nE. Exit\nEnter your option from the menu : ");
                            option = sc.next().charAt(0);
                            System.out.println();

                            switch (option) {

                                case 'A':
                                    System.out.println("Balance is : " + a1.getBalance());
                                    CheckAccount.showTransactions(a1);
                                    System.out.println("Number of Transaction for this Account is(" + CheckAccount.getTransactionsCount() + ")");
                                    System.out.println(a1.toString());
                                    System.out.println("----------------------------");
                                    break;

                                case 'B':
                                    System.out.println("Enter your amount to deposit : ");
                                    double amount = sc.nextDouble();
                                    a1.deposit(amount);
                                    System.out.println("----------------------------");
                                    break;
                                case 'C':
                                    System.out.println("Enter your amount to withdraw : ");
                                    amount = sc.nextDouble();
                                    a1.withdraw(amount);
                                    System.out.println("----------------------------");
                                    break;

                                case 'D':
                                    String flag2 = "false";
                                    System.out.println("(you have to choose between account numbers registerd in our bank to complete) \n Account numbers \n - (" + a[1].getAccountNum() + ")\n - (" + a[2].getAccountNum() + ")");
                                    System.out.println(" Please enter account number to transfer : ");
                                    long AccountNumto = sc.nextLong();
                                    System.out.println("Enter your amount to transfer : ");
                                    double amount33 = sc.nextDouble();
                                    for (int i = 0; i < a.length; i++) {
                                        if (a[i].AccountNum == AccountNumto) {
                                            flag2 = "true";
                                            a1.transfer(amount33, a1, a[i]);
                                            //System.out.println("Balance of the account that will receive the transfer: " + a[i].getBalance());//for be sure it works
                                            System.out.println("----------------------------");
                                        }
                                    }
                                    if (flag2.equals("false")) {
                                        System.out.println(" Sorry this account number is not found and transfer canceled");
                                        System.out.println("----------------------------");
                                    }
                                    break;

                                default:
                                    if (option == 'E') {
                                        System.out.println("Thank you for using our survices ! <3");
                                        System.out.println("----------------------------");
                                        break;
                                    } else {
                                        System.out.println(" Invalid option !! , please enter again.  ");
                                        System.out.println("----------------------------");
                                    }
                            }
                        } while (option != 'E');
                        break;
                    }
                //end of inner loop

                default:
                    if (option2 == '3') {
                        System.out.println("Thank you for using our survices ! <3");
                        break;
                    } else {
                        System.out.println(" Invalid option !! , please enter again.  ");
                        System.out.println("----------------------------");
                    }
            }

        } while (option2 != '3');
    }
}
