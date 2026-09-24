import java.util.Scanner;

public class MidtermAct1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int clothingChoice, brandChoice, quantity, tender, bill, change , ContinueProgram = 1;
        int price = 0;

        while (ContinueProgram == 1) {
            
            System.out.println("\n==============================\n");
           // System.out.println("\n==============================\n");    
            System.out.println("Choose your Option of Clothes\n");
            System.out.println("[1] T-Shirt");
            System.out.println("[2] Pants");
            System.out.println("\n==============================\n");
            System.out.print("Select Clothing Type: ");
        // Binabasa ng nextLine() ang text at ginagawa itong buong numero ng parseInt().
        clothingChoice = Integer.parseInt(scan.nextLine());

        if (clothingChoice == 1) {

            System.out.println("\n==============================");
            System.out.println("\n[1] Adidas - Php 600.00");
            System.out.println("[2] Nike - Php 700.00");
            System.out.println("[3] Uniqlo - Php 800.00");
            System.out.println("\n==============================");
            System.out.print("\nSelect Brand: ");
            // Ginagawang integer ang brand choice na inilagay ng user.
            brandChoice = Integer.parseInt(scan.nextLine());
            System.out.println("\n==============================\n");

            if (brandChoice == 1) {
                price = 600;
            } else if (brandChoice == 2) {
                price = 700;
            } else if (brandChoice == 3) {
                price = 800;
            } else {
                System.out.println("\n==============================");
                System.out.println("Invalid Input");
                scan.close();
                return;
            }
        } else if (clothingChoice == 2) {
            System.out.println("\n[1] Levi's - Php 850.00");
            System.out.println("[2] Wrangler - Php 950.00");
            System.out.println("[3] GAP - Php 1200.00");
            System.out.println("\n==============================\n");
            System.out.print("Select Brand: ");
            // Ginagawang integer ang brand choice na inilagay ng user.
            brandChoice = Integer.parseInt(scan.nextLine());

            if (brandChoice == 1) {
                price = 850;
            } else if (brandChoice == 2) {
                price = 950;
            } else if (brandChoice == 3) {
                price = 1200;
            } else {
                System.out.println("\n==============================");
                System.out.println("Invalid Input");
                scan.close();
                return;
            }
        } else {
            System.out.println("Invalid Clothing Type");
            scan.close();
            return;
        }

        System.out.print("Enter Quantity: ");
    // Ginagawang integer ang quantity na inilagay ng user.
        quantity = Integer.parseInt(scan.nextLine());
        System.out.println("\n==============================\n");

        bill = price * quantity;
        System.out.println("\nTotal Bill: Php " + bill + ".00");

        System.out.print("Enter Tender Amount: Php ");
    // Ginagawang integer ang tender o bayad na inilagay ng user.
        tender = Integer.parseInt(scan.nextLine());
        System.out.println("\n==============================\n");

        if (tender < bill) {
            System.out.println("Insufficient amount. Please provide enough money.");
            scan.close();
            return;
        }

        change = tender - bill;
        System.out.println("Change: Php " + change + ".00");

    System.out.println("\n==============================\n");    
    System.out.println("Do you want to continue?\n");
    System.out.println("[1] Yes");
    System.out.println("[2] No");
    System.out.println("\n==============================\n");
    System.out.print("Select: ");
    ContinueProgram = Integer.parseInt(scan.nextLine());
    }

    scan.close();
    }
}

