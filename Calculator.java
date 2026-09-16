
import java.util.Scanner;
    
public class Calculator {
       
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        int num1, num2 ;
        double result;
        
        System.out.println("\nEnter value of Num1: \n");
        num1 = input.nextInt();
        System.out.println("\nEnter Value of Num2: \n");
        num2 = input.nextInt();
        
        result = num1 + num2 ; 
        System.out.println("\nThe Sum is: " +result);
        
        result = num1 - num2 ;
        System.out.println("\nThe Difference is: " +result);
        
        result = num1 * num2 ;
        System.out.println("\nThe Product is: " +result);
        
        result = num1 / num2 ;
        System.out.println("\nThe Quotient is: " +result);
        
        result = num1 % num2 ;
        System.out.println("\nThe Modulus value: " +result);
        
        result++ ;
        System.out.println("\nThe Increment value is: " +result);
        
        result-- ;
        System.out.println("\nThe Decrement value is: " +result);
        input.close();
    }


}

