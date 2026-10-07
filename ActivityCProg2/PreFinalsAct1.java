import java.util.Scanner;

public class PreFinalsAct1 
{

    public static void main(String[] args) 
    {

        Scanner sner = new Scanner(System.in);

        String correctUsN = "admin";
        String correctPWord = "admin123";
        int tries = 3;

        while (tries > 0) 
            {

            System.out.println("====================\n"); // Fixed missing semicolon
            System.out.print("Enter Your Username : ");
            String usNinput = sner.nextLine(); // Fixed method and declared usNinput

            System.out.println("\n===================\n");
            System.out.print("Enter Your Password : ");
            String pWordinput = sner.nextLine(); // Fixed method and declared pWordinput

            boolean isusNC = usNinput.equals(correctUsN);
            boolean ispWordC = pWordinput.equals(correctPWord);

            System.out.println("\n==================\n");

            // Fixed boolean logic condition
                if (isusNC && ispWordC) 
                {

                    System.out.println("LOGIN SUCCESSFUL ! ");
                    break;
                    
                }
                else  
                {
                tries--;
                if (!isusNC && !ispWordC) 
                {

                    System.out.println("Invalid Username & Invalid Password !!! \n");
                
                }
                else if (!isusNC) 
                {

                    System.out.println("\nInvalid Username ! \n");
                
                }
                else 
                {

                    System.out.println("\nInvalid Password ! \n");
                
                }
                if (tries > 0) 
                {

                    System.out.println("Attempts Remaining: " + tries );
                    System.out.println(" ");
                
                } 
                else 
                {

                    System.out.println("======================");
                    System.out.println("\nAng BOBO MO NAMAN !!! \n");
                }
            }
        }

        sner.close(); // Moved outside the loop
    }
}