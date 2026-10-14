import java.util.Scanner;

public class PreFinalsAct2
{
    private static int readMilitaryTime(Scanner scan, String prompt)
    {
        while (true)
        {
            System.out.print(prompt);
            String input = scan.nextLine().trim();

            if (input.matches("\\d{4}"))
            {
                int time = Integer.parseInt(input);
                int hours = time / 100;
                int minutes = time % 100;

                if (hours <= 23 && minutes <= 59)
                {
                    return hours * 60 + minutes;
                }
            }

            System.out.println("\n==============================\n");
            System.out.println("INVALID TIME INPUT!!! \n\nPLEASE ENTER A TIME FROM 0000 TO 2359.");
            System.out.println("\n==============================\n");
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String name, position;
        int ratePerHour, totalHoursWorked = 0;
        int grossPay, sssDeduction = 300, pagibigDeduction = 200, philhealthDeduction = 100;
        int totalDeduction, netPay, ContinueProgram = 1;
        String[] days  = {"Monday" , "Tuesday" , "Wednesday" , "Thursday", "Friday"};


        while (ContinueProgram == 1)
        {
        totalHoursWorked = 0;

        String[] tInStrings = new String[5];
        String[] tOutStrings = new String [5];
        int [] dHoursArray = new int [5];

        System.out.println("\n==============================\n");
        System.out.print("Enter your Name: ");
        name = scan.nextLine();

        System.out.println("\n==============================\n");
        System.out.println("Position Choices\n");
        System.out.println("1. IT Head");
        System.out.println("2. Teacher");
        System.out.println("3. Janitor");
        System.out.println("\n==============================");
      /*   System.out.print("Enter your Position Choice: ");
        int positionChoice = scan.nextInt();
       // System.out.println("\n=======================================\n");
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
        }*/
            int positionChoice;

                while (true)
                {
                    System.out.print("\nEnter your Position Choice: ");
                    positionChoice = scan.nextInt();

                           if (positionChoice == 1)
                           {
                            position = "IT Head";
                            ratePerHour = 140;
                            break;
                           }
                           else if (positionChoice == 2)
                           {
                            position = "Teacher";
                            ratePerHour = 120;
                            break;
                           }
                           else if (positionChoice == 3)
                           {
                            position = "Janitor";
                            ratePerHour = 100;
                            break;
                           }
                           else
                           {

                            System.out.print("\n==============================\n");
                            System.out.println("\nINVALID INPUT!!! \n\nPLEASE CHOOSE BETWEEN: 1, 2, OR 3.");
                            System.out.print("\n==============================\n");
                           }
                }

        scan.nextLine();

        for (int i = 0; i < days.length; i++)

        {

            String cday = days[i];

            System.out.print("\n==============================\n\n");
            int timeIn = readMilitaryTime(scan, "Enter your Time IN for " + cday + " (HHMM): ");
            System.out.print("\n==============================\n\n");
            int timeOut = readMilitaryTime(scan, "Enter your Time OUT for " + cday + " (HHMM): ");
            System.out.print("\n==============================");

            tInStrings[i] = String.format("%02d:%02d", timeIn / 60, timeIn % 60);
            tOutStrings[i] = String.format("%02d:%02d", timeOut / 60, timeOut % 60);

            if (timeOut < timeIn)
            {
                timeOut += 24 * 60;
            }

            int dailyMinutesWorked = timeOut - timeIn - 60;
            dHoursArray[i] = dailyMinutesWorked / 60;
            totalHoursWorked += dHoursArray[i];
            System.out.println("\n\nDay " + cday + " hour/s worked: " + dHoursArray[i]);

        }
        // --- DISPLAY TIME LOG TABLE ---
            System.out.println("\n\n==================================================");
            System.out.println("               WEEKLY TIME LOG SUMMARY            ");
            System.out.println("==================================================");
            System.out.printf("%-12s | %-10s | %-11s | %-13s%n", "Day", "Time In", "Time Out", "Hours Worked");
            System.out.println("--------------------------------------------------");
            for (int i = 0; i < days.length; i++) {
                System.out.printf("%-12s | %-10s | %-11s | %-13d%n", days[i], tInStrings[i], tOutStrings[i], dHoursArray[i]);
            }
            System.out.println("==================================================\n");

        grossPay = totalHoursWorked * ratePerHour;

        // System.out.print("Enter SSS Deduction: ");
        // sssDeduction = scan.nextInt();
        // System.out.print("Enter Pag-IBIG Deduction: ");
        // pagibigDeduction = scan.nextInt();
        // System.out.print("Enter PhilHealth Deduction: ");
      //  philhealthDeduction = scan.nextInt();
        totalDeduction = sssDeduction + pagibigDeduction + philhealthDeduction;
        netPay = grossPay - totalDeduction;

        System.out.println("\n==============================\n");
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("SSS Deduction: " + sssDeduction);
        System.out.println("Pag-IBIG Deduction: " + pagibigDeduction);
        System.out.println("PhilHealth Deduction: " + philhealthDeduction);
        System.out.println("Total Deductions: " + totalDeduction);
        System.out.println("\n---------------------------------------\n");
        System.out.println("Net Pay: " + netPay);
        System.out.println("\n==============================\n");

        System.out.print("Enter 1 to process another employee or 0 to exit: ");
        ContinueProgram = scan.nextInt();
        scan.nextLine();
        }

        scan.close();

    }

}
