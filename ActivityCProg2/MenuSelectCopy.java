import java.util.Scanner;
public class MenuSelectCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectMenu , selectMeal;
        int continueProgram = 1;
        int quantity;
        int price = 0;
        while (continueProgram == 1) {
    
    System.out.println("======= Menu ni Aling Oliver =======");
    System.out.println("\n[1] Breakfast");
    System.out.println("[2] Lunch");
    System.out.println("[3] Dinner");
    System.out.println("\n==============================\n");
    System.out.println("\nSelect Menu: ");
    selectMenu = scanner.nextLine();
    price = 0;
    if (selectMenu.equals("1")) 
    {
        System.out.println("\n[1] Pancake             - Php 30.00");
        System.out.println("[2] Tapsilog            - Php 40.00");
        System.out.println("[3] Chixilog            - Php 50.00");
        System.out.println("\n==============================\n");
        System.out.println("\nSelect Meal: ");
        selectMeal = scanner.nextLine();
        if (selectMeal.equals("1")) {
            price = 30;
            System.out.println("\nPrice is 30.00");
        } 
        else if (selectMeal.equals("2")) {
            price = 40;
            System.out.println("\nPrice is 40.00");
        } 
        else if (selectMeal.equals("3")) {
            price = 50;
            System.out.println("\nPrice is 50.00");
        } 
        else {
            System.out.println("\n==============================\n");
           System.out.println("\nInvalid Input");
            continue;
        }
    }
        else if (selectMenu.equals("2")) 
        {
        System.out.println("[1] Fried Chicken       - Php 60.00");
        System.out.println("[2] Porkchop            - Php 70.00");
            System.out.println("\n==============================\n");
        System.out.print("\nSelect Meal: ");
        selectMeal = scanner.nextLine();
               if (selectMeal.equals("1")) 
               {
            price = 60;
                   System.out.println("\nPrice is 60.00");
               }
               else if (selectMeal.equals("2"))
               {
            price = 70;
                   System.out.println("\nPrice is 70.00");
               }
        else {
                   System.out.println("\n==============================\n");
                   System.out.println("\nInvalid Input");
            continue;
             }
        }
     else if (selectMenu.equals("3")) 
     {
        System.out.println("[1] Adobo        - Php 80.00");
        System.out.println("[2] Sinigang     - Php 90.00");
        System.out.println("[3] Papaitan     - Php 100.00");
        System.out.println("\n==============================\n");
        System.out.println("\n1Select Meal: ");
        selectMeal = scanner.nextLine();
        if (selectMeal.equals("1")) {
            price = 80;
            System.out.println("\nPrice is 80.00");
        } else if (selectMeal.equals("2")) {
            price = 90;
            System.out.println("\nPrice is 90.00");
        } else if (selectMeal.equals("3")) {
            price = 100;
            System.out.println("\nPrice is 100.00");
        } 
    else {
         System.out.println("\n==============================\n");
         System.out.println("\nInvalid Input");
            continue;
        }
    }
     else {
        System.out.println("\n==============================\n");
        System.out.println("\nInvalid Input");
        continue;
    }
    
    System.out.println("\nInput Quantity: ");
    quantity = scanner.nextInt();
    System.out.println("\nTotal Price: " + (quantity * price));
    System.out.println("Do you want to continue?");
    System.out.println("[1] Yes");
    System.out.println("[2] No");
    System.out.print("Select: ");
    continueProgram = scanner.nextInt();
    scanner.nextLine();
}
scanner.close();
}
}
