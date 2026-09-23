import java.util.Scanner;

public class MIdtermAct3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin = 123456;
        int inputPin;
        int continueProgram = 1;
        int withdraw, deposit;
        int balance = 0;

        System.out.println("\n=======================================\n");
        System.out.print("Enter your Pin: ");
        inputPin = scan.nextInt();

        while (inputPin != pin) {
            System.out.println("\n=======================================\n");
            System.out.println("Invalid PIN.");
            System.out.println("\n=======================================\n");
            System.out.print("Enter your PIN: ");
            inputPin = scan.nextInt();
        }

        if (inputPin == pin) {
            do {
                System.out.println("\n=======================================\n");
                System.out.println("~~~ATM NI ALING OLIVER~~~\n");
                System.out.println("[1] Withdraw");
                System.out.println("[2] Deposit");
                System.out.println("[3] Check Balance");
                System.out.println("\n=======================================\n");
                System.out.print("Select Transaction: ");
                int transactionChoice = scan.nextInt();

                if (transactionChoice == 1) {
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = scan.nextInt();

                    if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } 
                    else {
                        balance -= withdraw;
                        System.out.println("Withdraw successful. \n\nNew balance: " + balance);
                    }
                } else if (transactionChoice == 2) {
                    System.out.print("Enter amount to deposit: ");
                     deposit = scan.nextInt();
                    balance += deposit;
                    System.out.println("Deposit successful. \n\nNew balance: " + balance);
                } else if (transactionChoice == 3) {
                    System.out.println("Current balance: " + balance);
                } else {
                    System.out.println("Invalid transaction choice.");
                }

                System.out.println("\nDo you want to do another transaction? (1 for Yes, 0 for No): ");
                continueProgram = scan.nextInt();
            } while (continueProgram == 1);
        }

        scan.close();
    }
}
