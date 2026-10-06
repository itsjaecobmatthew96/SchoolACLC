import java.util.Scanner;
import java.util.Random; 

public class MidtermAct3withReceipt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random(); 
        
        int pin = 121211;
        int inputPin;
        int continueProgram = 1;
        double withdraw, deposit; 
        double balance = 0.0;     
        
        long randomAccNum = 1000000000L + (long)(random.nextDouble() * 9000000000L);
        String accNumStr = String.valueOf(randomAccNum);
        String maskedAccNum = "******" + accNumStr.substring(6); 

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
                System.out.println(" [1] WITHDRAW \n");
                System.out.println(" [2] DEPOSIT  \n");
                System.out.println(" [3] CHECK BALANCE ");
                System.out.println("\n==============================\n");
                System.out.print("SELECT TRANSACTION: ");
                int transactionChoice = scan.nextInt();
                
                boolean validTransaction = false; 

                if (transactionChoice == 1) {
                    System.out.println("\n==============================");
                    System.out.println("\nCurrent balance : " + String.format("%.2f", balance));
                    System.out.println("\n==============================\n");
                    System.out.print("ENTER AMOUNT TO WITHDRAW: ");
                    withdraw = scan.nextDouble(); 

                    if (withdraw > balance) {
                        System.out.println("\n==============================\n");
                        System.out.println("INSUFFICIENT BALANCE.");
                        System.out.println("\n==============================\n");
                    } 
                    else {
                        balance -= withdraw;
                        System.out.println("\n==============================\n");
                        System.out.println("WITHDRAW SUCCESSFUL. \n\nNEW BALANCE: " + String.format("%.2f", balance));
                        System.out.println("\n==============================\n");
                        validTransaction = true; 
                    }
                } else if (transactionChoice == 2) {
                    System.out.println("\n==============================\n");
                    System.out.print("ENTER AMOUNT TO DEPOSIT: ");
                    deposit = scan.nextDouble(); 
                    balance += deposit;
                    System.out.println("\n==============================\n");
                    System.out.println("DEPOSIT SUCCESSFUL!!. \n\nNEW BALANCE: " + String.format("%.2f", balance));
                    System.out.println("\n==============================\n");
                    validTransaction = true; 
                } else if (transactionChoice == 3) {
                    System.out.println("\n==============================\n");
                    System.out.println("CURRENT BALANCE: " + String.format("%.2f", balance));
                    System.out.println("\n==============================\n");
                    validTransaction = true; 
                } else {
                    System.out.println("INVALID TRANSACTION CHOICE.");
                }

                if (validTransaction) {
                    System.out.println("DO YOU WANT TO PRINT A RECEIPT? \n");
                    System.out.println(" YES");
                    System.out.println(" \n NO");
                    System.out.println("\n==============================\n");
                    System.out.print("ENTER YOUR CHOICE: ");
                    int printChoice = scan.nextInt();

                    if (printChoice == 1) {
                        System.out.println("\n==============================\n");
                        System.out.println("       --- TRANSACTION RECEIPT ---     ");
                        System.out.println("       ATM NI ALING OLIVER             ");
                        System.out.println("       ACCOUNT NO: " + maskedAccNum); 
                        System.out.println("       STATUS    : APPROVED            ");
                        System.out.println("---------------------------------------");
                        System.out.println("       AVAILABLE BALANCE: PHP " + String.format("%.2f", balance));
                        System.out.println("---------------------------------------");
                        System.out.println("       THANK YOU FOR BANKING WITH US!  ");
                        System.out.println("\n==============================\n");
                    }
                }

                System.out.println("DO YOU WANT TO DO ANOTHER TRANSACTION? \n");
                System.out.println(" YES");
                System.out.println(" \n NO");
                System.out.println("\n==============================\n");
                System.out.print("ENTER YOUR CHOICE: ");
                continueProgram = scan.nextInt();
                
                // Triggers exit message if user chooses 2 (NO)
                if (continueProgram != 1) {
                    System.out.println("\n==============================\n");
                    System.out.println("THANK YOU FOR BANKING WITH US! ");
                    System.out.println("\n==============================\n");
                }
                
            } while (continueProgram == 1);
        }

        scan.close();
    }
}
