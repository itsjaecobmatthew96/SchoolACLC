import 


public class dowhile 
{

        public static void main(String[] args)
        {
            Scanner sner = new Scanner(System.in);
            int ans ,num = 0 ;total = 0;



            do 
            {
                System.out.println("Enter a number: " );
                num=sner.nextInt();
                System.out.println("Do you want to enter a number again ? (1 for Yes, 0 for No): ");
                ans=sner.nextInt();
                total += num;

            }
            while(ans==1);
            System.out.println("The total is: " + total);
        }

    }