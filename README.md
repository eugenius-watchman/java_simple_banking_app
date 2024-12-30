Banking Application

This Java program simulates a basic banking application where users can manage their account transactions, including checking their balance, making deposits, withdrawing funds, and viewing their transaction history.
Features

    User Input for Full Name and Random Customer ID
        Users are prompted to enter their full name upon starting the application.
        A unique customer ID is generated using a random UUID.

    Menu Options
        A. Check Balance: Displays the current account balance.
        B. Deposit: Allows the user to deposit a specified amount into their account.
        C. Withdrawal: Allows the user to withdraw a specified amount from their account.
        D. Previous Transactions: Displays the last transaction made (deposit or withdrawal).
        E. Exit: Exits the application.

    Transaction History
        Tracks the most recent deposit or withdrawal.

    Dynamic Welcome Message
        Displays the user's full name and unique customer ID upon starting the application.

How to Use

    Compile and run the program using any Java compiler (e.g., javac and java commands).
    Enter your full name when prompted.
    Interact with the menu by entering the corresponding letter for the desired operation.
    Follow the instructions for deposits, withdrawals, or checking balances.
    Exit the program by choosing option E.

Sample Output

Please enter your full name:  
John Doe  
Welcome John Doe  
Your ID is a1b2  

A. Check Balance  
B. Deposit  
C. Withdrawal  
D. Previous transactions  
Exit  

*******************************************  
Please enter an option.  
*******************************************  
B  
************************  
Enter amount to deposit.  
************************  
100  

************************  
Please enter an option.  
*******************************************  
A  
************************  
Balance is 100.0  
************************  
Thanks for using our services. :)  

Code Highlights

    Random Customer ID Generation:
    Utilises java.util.UUID to generate a unique identifier for each customer.

    Simple and Intuitive Menu:
    The program uses a Scanner to accept user input and a do-while loop to keep the menu running until the user exits.

    Robust Transaction Handling:
    Includes checks to prevent invalid transactions, such as depositing or withdrawing zero amounts.

Dependencies

    Java Development Kit (JDK): Ensure you have JDK 8 or higher installed.

Future Enhancements

    Add functionality to save transaction history persistently.
    Implement a graphical user interface (GUI) for a more user-friendly experience.
    Introduce authentication using a PIN or password for enhanced security.

Author

Eugene
