package boa_bankingapplication;

/**
 * @Author Name: Chad Stevens
 * @astev5
 * @Project Name: Bank of Alexandria
 * @Date: July 22, 2021
 * @Description: Simple Banking Application
 */
/**
 * @Summary Application will first display a welcome message to the user with
 * his/her name. Then it will display five options to the user: check balance,
 * deposit, withdraw, check previous transaction, and exit. Based on user
 * choice, the corresponding functionality will be executed.
 */

//Import Java Math class
import static java.lang.Math.*;

import java.util.Scanner;

public class BankAccount {

    private double bal;
    private double prevTrans;
    private String custName;
    private String acctNum;

    //Constructor for BankAccount Class
    //Variable cname and cid will come from user input
    public BankAccount(String cname, String anum) {
        cname = custName;
        anum = acctNum;
    }

    /**
     * Constructor - Initializes default values of 0
     */
    public BankAccount() {
        this("0", "0");
    }  
    
    /**
     * Method @deposit: Method to calculate new balance after a deposit
     *
     * @param amt
     */
    public void deposit(double amt) {
        if (amt != 0) {
            bal = bal + amt;
            prevTrans = amt;
        }
    }  

    /**
     * Method @withdraw: Method to calculate new balance after a withdrawal
     *
     * @param amt
     */
    public void withdraw(double amt) {
        if (amt != 0) {
            bal = bal - amt;
            prevTrans = -amt;   //Note amount is negative
        }
    }

    /**
     * Method @getPrevTrans: Method to retrieve previous transaction amount
     */
    public void getPrevTrans() {
        if (prevTrans > 0) {
            System.out.printf("Deposited: $%f.2\n", +prevTrans);
        } else if (prevTrans < 0) {
            System.out.printf("Withdrawn: $%f.2\n", +abs(prevTrans));
            //Math.abs returns the absolute value            
        } else {
            System.out.println("No transaction occurred\n");
        }
    }

    /**
     * Method @displayMenu: Display main menu for user
     */
    public void displayMenu() {

        String option;

        //Create scanner object
        Scanner sc = new Scanner(System.in);

        System.out.printf("Welcome %s\n", custName);
        System.out.printf("Your account number is %s\n\n", acctNum);
        System.out.print("A. Check Balance\n");
        System.out.print("B. Deposit\n");
        System.out.print("C. Withdraw\n");
        System.out.print("D. Previous Transaction\n");
        System.out.print("E. Exit\n\n");

        do {

            System.out.print("***********************************\n");
            System.out.print("Please make a selection: \n");
            option = sc.nextLine();
            
            switch(option){
                
                case "A":
                    System.out.print("***********************************\n");
                    System.out.printf("Your current balance is: %f.2\n", bal);
                    break;
                    
                case "B":
                    System.out.print("***********************************\n");                    
                    System.out.print("How much would like to deposit: \n");
                    int amt1 = sc.nextInt();
                    deposit(amt1);
                    break;

                case "C":
                    System.out.print("***********************************\n");                    
                    System.out.print("How much would like to withdraw: \n");
                    int amt2 = sc.nextInt();
                    deposit(amt2);
                    break;

                case "D":
                    System.out.print("***********************************\n");                    
                    System.out.print("The amount of your last transaction was: "
                            + "\n");
                    getPrevTrans();
                    break;
                    
                case "E":
                    System.out.print("***********************************\n");                    
                    break;
                    
                default:
                    System.out.print("Invalid selection. Please try again.");                    
            }

        } while (option.equalsIgnoreCase("E"));
        
        System.out.print("Thank you for using the Bank of Alexandria banking "
                + "application.\nHave an amazing day!\n");

    }
}
