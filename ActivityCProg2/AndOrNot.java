import java.util.Scanner;

public class AndOrNot
{
    public static void main(String[] args)
    {
        Scanner sner = new Scanner(System.in);

        System.out.print("ENTER YOUR AGE : ");
        int ageBracket = sner.nextInt();

        if (ageBracket >= 0 && ageBracket <= 17)
        {
            System.out.println("You are a TEEN ! ");
        }
        else if (ageBracket >= 18 && ageBracket <= 59)
        {
            System.out.println("You are an ADULT ! ");
        }
        else if (ageBracket >= 60)
        {
            System.out.println("You are a SENIOR ! ");
        }
        else
        {
            System.out.println("Invalid age.");
        }

        sner.close();
    }
}
