import java.util.Scanner


public class Main 
{
    public static void main (String[]args){


    Scanner sner = new Scanner (System.in);



    static void HiHi
    System.out.print("HiHi");
    
    }
}


            int positionChoice;

while (true) {
    System.out.print("\nEnter your Position Choice: ");
    positionChoice = scan.nextInt();

    if (positionChoice == 1) {
        position = "IT Head";
        ratePerHour = 140;
        break;

    } else if (positionChoice == 2) {
        position = "Teacher";
        ratePerHour = 120;
        break;

    } else if (positionChoice == 3) {
        position = "Janitor";
        ratePerHour = 100;
        break;

    } else {
        System.out.print("\n=======================================\n");
        System.out.println("\nINVALID INPUT!!! \n\nPLEASE CHOOSE BETWEEN: 1, 2, OR 3.");
        System.out.print("\n=======================================\n");
    }
}