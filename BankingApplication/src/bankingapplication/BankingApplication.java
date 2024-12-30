/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapplication;

import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author eugene
 */
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        BankAccount obj1 = new BankAccount("XYZ", "3423334");
//        obj1.showMenu();
        Scanner scanner = new Scanner(System.in);

        // Accept full name from user 
        System.out.println("Please enter your full name: ");
        String fullname = scanner.nextLine();   
        
        // Generate random number
        String customerId = UUID.randomUUID().toString().substring(0, 4);
        
        // create a new BankAccount Instance
        BankAccount obj1 = new BankAccount(fullname, customerId);
        obj1.showMenu();
        
        scanner.close();
    }
    
}

class BankAccount{
    double balance;
    double previousTransaction;// amt withdrawn or deposited
    String customerName;
    String customerId;
    
    // constructor
    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    
    }
    
    
    void deposit(double amount){
        if(amount != 0){
           balance = balance + amount;
           previousTransaction = amount; // what amount is deposited or withdrawn
        }
    }
    
    void withdrawal(double amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    
    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: "+ previousTransaction);
        }else if(previousTransaction < 0){
            System.out.println("Withdrwal made: "+ Math.abs(previousTransaction));
        }else{
            System.out.println("No transation detected.");
        }
    }
    
    void showMenu(){
        char option = '\0'; // single quotes denotes defining a single character
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome "+ customerName);
        System.out.println("Your ID is "+ customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdrawal");
        System.out.println("D. Previous transactions");
        System.out.println("Exit");
        
        do{
            System.out.println("*******************************************");
            System.out.println("Please enter an option.");
            System.out.println("*******************************************");
            option = scanner.next().charAt(0); // user entering an option here
            System.out.println("\n");
            
            switch(option){
                case 'A':
                    System.out.println("************************");
                    System.out.println("Balance is "+ balance);
                    System.out.println("************************");
                    System.out.println("\n");
                    break;
                    
                case 'B':
                    System.out.println("************************");
                    System.out.println("Enter amount to deposit.");
                    System.out.println("************************");
                    double amount = scanner.nextDouble();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                    
                case 'C':
                    System.out.println("************************");
                    System.out.println("Enter amount to withdraw.");
                    System.out.println("************************");
                    double amount2 = scanner.nextDouble();
                    withdrawal(amount2);
                    System.out.println("\n");
                    break;
                    
                case 'D':
                    System.out.println("************************");
                    getPreviousTransaction();
                    System.out.println("************************");
                    System.out.println("\n");
                    break;
                    
                case 'E':
                    System.out.println("************************************");
                    break;
                    
                default:
                    System.out.println("Invalid Option! Please enter a valid option...");
            }
        }while(option != 'E');
        
        System.out.println("Thanks for using our services. :)");
    }
}