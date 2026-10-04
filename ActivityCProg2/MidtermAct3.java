import java.util.Scanner;

public class MidtermAct3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin = 121211;
        int inputPin;
        int continueProgram = 1;
        double withdraw, deposit; 
        double balance = 0.0;     

        System.out.println("\n==============================\n");
        System.out.print("ENTER YOUR 6 DIGITS PIN: ");
        inputPin = scan.nextInt();

        while (inputPin != pin) {
            System.out.println("\n==============================\n");
            System.out.println("INVALID PIN!!!");
            System.out.println("\n==============================\n");
            System.out.print("ENTER YOUR 6 DIGITS PIN AGAIN : ");
            inputPin = scan.nextInt();
        }

        if (inputPin == pin) {
            do {
                System.out.println("\n==============================\n");
                System.out.println("~~~ATM NI ALING OLIVER~~~\n");
                System.out.println(" WITHDRAW");
                System.out.println(" DEPOSIT");
                System.out.println(" CHECK BALANCE");
                System.out.println("\n==============================\n");
                System.out.print("SELECT TRANSACTION : ");
                int transactionChoice = scan.nextInt();

                if (transactionChoice == 1) {
                    System.out.println("\n==============================");
                    // Formatted to 2 decimal places
                    System.out.println("\nCURRENT BALANCE : " + String.format("%.2f", balance));
                    System.out.println("\n==============================\n");
                    System.out.print("ENTER AMOUNT TO WITHDRAW : ");
                    withdraw = scan.nextDouble(); 

                    if (withdraw > balance) {
                        System.out.println("\n==============================\n");
                        System.out.println("INSUFFICIENT BALANCE!!! ");
                        System.out.println("\n==============================\n");
                    } 
                    else {
                        balance -= withdraw;
                        System.out.println("\n==============================\n");
                        // Formatted to 2 decimal places
                        System.out.println("WITHDRAW SUCCESSFUL!! \n\n==============================\n\n NEW BALANCE: " + String.format("%.2f", balance));
                        System.out.println("\n==============================\n");
                    }
                } else if (transactionChoice == 2) {
                    System.out.println("\n==============================\n");
                    System.out.print("ENTER AMOUNT TO DEPOSIT : ");
                    deposit = scan.nextDouble(); 
                    balance += deposit;
                    System.out.println("\n==============================\n");
                    // Formatted to 2 decimal places
                    System.out.println("DEPOSIT SUCCESSFUL!!. \n\nNew balance: " + String.format("%.2f", balance));
                    System.out.println("\n==============================\n");
                } else if (transactionChoice == 3) {
                    System.out.println("\n==============================\n");
                    // Formatted to 2 decimal places
                    System.out.println("CURRENT BALANCE : " + String.format("%.2f", balance));
                    System.out.println("\n==============================\n");
                } else {
                    System.out.println("INVALID TRANSACTION CHOICE!!! ");
                }

                System.out.println("DO YOU WANT TO DO ANOTHER TRANSACTION? \n");
                System.out.println(" YES");
                System.out.println("\n N0");
                System.out.println("\n==============================\n");
                System.out.print("ENTER YOUR CHOICE : ");
                continueProgram = scan.nextInt();
            } while (continueProgram == 1);
        }

        scan.close();
    }
}
