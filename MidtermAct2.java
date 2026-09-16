import java.util.Scanner;

public class MidtermAct2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name, position;
        int ratePerHour, totalHoursWorked = 0;
        int grossPay, sssDeduction = 300, pagibigDeduction = 200, philhealthDeduction = 100;
        int totalDeduction, netPay, ContinueProgram = 1;

        while (ContinueProgram == 1) {
            totalHoursWorked = 0;

        System.out.print("Enter your Name: ");
        name = scan.nextLine();

        System.out.println("Position Choices");
        System.out.println("1. IT Head");
        System.out.println("2. Teacher");
        System.out.println("3. Janitor");
        System.out.print("Enter your Position Choice: ");
        int positionChoice = scan.nextInt();

        if (positionChoice == 1) {
            position = "IT Head";
            ratePerHour = 140;
        } else if (positionChoice == 2) {
            position = "Teacher";
            ratePerHour = 120;
        } else if (positionChoice == 3) {
            position = "Janitor";
            ratePerHour = 100;
        } else {
            position = "Invalid";
            ratePerHour = 0;
            System.out.println("Invalid position choice.");
            return;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter your Time IN " + i + ": ");
            int timeIn = scan.nextInt();
            System.out.print("Enter your Time OUT " + i + ": ");
            int timeOut = scan.nextInt();

            totalHoursWorked = totalHoursWorked + ((timeOut - timeIn -100)/100);
            System.out.println("Day " + i + " hours worked: " + (timeOut - timeIn-100)/100);
        }

        grossPay = totalHoursWorked * ratePerHour;
        totalDeduction = sssDeduction + pagibigDeduction + philhealthDeduction;
        netPay = grossPay - totalDeduction;

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("SSS Deduction: " + sssDeduction);
        System.out.println("Pag-IBIG Deduction: " + pagibigDeduction);
        System.out.println("PhilHealth Deduction: " + philhealthDeduction);
        System.out.println("Total Deductions: " + totalDeduction);
        System.out.println("Net Pay: " + netPay);
        System.out.println("\n=======================================\n");

        System.out.print("Enter 1 to process another employee or 0 to exit: ");
        ContinueProgram = scan.nextInt();
        scan.nextLine();
        }
    }
}


