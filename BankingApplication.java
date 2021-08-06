package boa_bankingapplication;

/**
 * @Author Name: Chad Stevens
 * @astev5
 * @Project Name: Bank of Alexandria
 * @Date: July 22, 2021
 * @Description: Simple Banking Application
 */

/**
 * @Summary
 * Application will first display a welcome message to the user with his/her
 * name. Then it will display five options to the user: check balance, deposit,
 * withdraw, check previous transaction, and exit. Based on user choice, the
 * corresponding functionality will be executed.
 */

import java.util.Scanner;

public class BankingApplication {


    public static void main(String[] args) {

        //Create an object of the Scanner
        Scanner sc = new Scanner(System.in);

        //Declarations
        //String repeat;         //used to run again
        String cname;       //customer name
        String anum;            //customer id

        System.out.print("\nWelcome to Bank of Alexandria!\nPlease enter your "
                + "full name as it appears on your account: \n");
        cname = sc.nextLine();
        System.out.print("Please enter your account number: \n");
        anum = sc.nextLine();
        //sc.nextLine();
        
        //Instantiate BankAccount subclass
        BankAccount acct = new BankAccount(cname, anum);

        //Display menu
        acct.displayMenu();
        
    }
    
}

