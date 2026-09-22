import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramLauncher 
{

    private static final String JAVA_HOME = System.getProperty("java.home");
    private static final String JAVA_COMMAND = JAVA_HOME + File.separator + "bin" + File.separator + "java";
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int choice;

        do 
        {
            System.out.println("\n==========================================");
            System.out.println("\nChoose a school activity:");
            System.out.println("\n1. Biodata");
            System.out.println("\n2. Calculator");
            System.out.println("\n3. Relational Operators");
            System.out.println("\n4. Menu Select");
            System.out.println("\n5. Menu Select Copy");
            System.out.println("\n6. Midterm Activity 1");
            System.out.println("\n7. Midterm Activity 2");
            System.out.println("\n8. Exit");
            System.out.println("\n==========================================");
            System.out.print("\nEnter your choice: ");
            

            choice = readChoice();
            System.out.println("\n==========================================");

            switch (choice)
            {
                case 1:
                    runProgram("Biodata.java");
                    break;
                case 2:
                    runProgram("Calculator.java");
                    break;
                case 3:
                    runProgram("RelationalOperators.java");
                    break;
                case 4:
                    runProgram("MenuSelect.java");
                    break;
                case 5:
                    runProgram("MenuSelectCopy.java");
                    break;
                case 6:
                    runProgram("MidtermAct1.java");
                    break;
                case 7:
                    runProgram("MidtermAct2.java");
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } 
        while (choice != 8);
    }

    private static int readChoice()
    {
        while (!INPUT.hasNextInt()) 
        {
            System.out.println("Please enter a number.");
            INPUT.next();
            System.out.print("Enter your choice: ");
        }
        return INPUT.nextInt();
    }

    private static void runProgram(String fileName) 
    {
        try

        {
            Process process = new ProcessBuilder(JAVA_COMMAND, fileName)
                    .inheritIO()
                    .start();
            process.waitFor();
        } 
        
        catch (IOException exception) 

        {
            System.out.println("Could not start " + fileName + ": " + exception.getMessage());
        } 

        catch (InterruptedException exception) 

        {
            Thread.currentThread().interrupt();
            System.out.println("The program was interrupted.");
        }
    }
}
