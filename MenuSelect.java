import java.util.Scanner;
public class MenuSelect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectMenu , selectMeal;
    
    System.out.println("======= Menu ni Aling Oliver =======");
    System.out.println("[1] Breakfast");
    System.out.println("[2] Lunch");
    System.out.println("[3] Dinner");
    System.out.println("Select Menu: ");
    selectMenu = scanner.nextLine();
    if (selectMenu.equals("1")) 
    {
        System.out.println("[1] Pancake             - Php 30.00");
        System.out.println("[2] Tapsilog            - Php 40.00");
        System.out.println("[3] Chixilog            - Php 50.00");
        System.out.println("Select Meal: ");
        selectMeal = scanner.nextLine();
        if (selectMeal.equals("1")) {
            System.out.println("Price is 30.00");
        } 
        else if (selectMeal.equals("2")) {
            System.out.println("Price is 40.00");
        } 
        else if (selectMeal.equals("3")) {
            System.out.println("Price is 50.00");
        } 
        else {
           System.out.println("Invalid Input");
        }
    }
        else if (selectMenu.equals("2")) 
        {
        System.out.println("[1] Fried Chicken       - Php 60.00");
        System.out.println("[2] Porkchop            - Php 70.00");
        System.out.print("Select Meal: ");
        selectMeal = scanner.nextLine();
               if (selectMeal.equals("1")) 
               {
                   System.out.println("Price is 60.00");
               }
               else if (selectMeal.equals("2"))
               {
                   System.out.println("Price is 70.00");
               }
         else {
          System.out.println("Invalid Input");
         }
        }
     else if (selectMenu.equals("3")) 
     {
        System.out.println("[1] Adobo        - Php 80.00");
        System.out.println("[2] Sinigang     - Php 90.00");
        System.out.println("[3] Papaitan     - Php 100.00");
        System.out.println("Select Meal: ");
        selectMeal = scanner.nextLine();
        if (selectMeal.equals("1")) {
            System.out.println("Price is 80.00");
        } else if (selectMeal.equals("2")) {
            System.out.println("Price is 90.00");
        } else if (selectMeal.equals("3")) {
            System.out.println("Price is 100.00");
        } 
    else {
         System.out.println("Invalid Input");
        }
    }
     else {
        System.out.println("Invalid Input");
    }
 scanner.close();
}
}
