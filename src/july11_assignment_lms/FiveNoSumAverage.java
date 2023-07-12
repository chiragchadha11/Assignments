package july11_assignment_lms;
/*
5. Write a program in Java to input 5 numbers from the keyboard and find their sum and average .
using for loop
*/
import java.util.Scanner;

public class FiveNoSumAverage
{
    public static void main(String[] args)
    {
        String user_input;
        do
        {
            Scanner sc = new Scanner(System.in);
            int i=1, user_no=0, sum=0;
            for(System.out.println("Enter 5 numbers of your choice\nCAUTION: System exit on invalid entry");  i<=5; i++)
            {
                System.out.print("Enter number " + i + ": ");
                if(sc.hasNextInt())
                {
                    user_no=sc.nextInt();
                    sum+=user_no;

                }
                else
                {
                    System.out.println("Please enter valid number");
                    System.exit(0);
                }
            }

            System.out.println("Sum of the five numbers is " + sum + " and average is " + (sum / 5));

            System.out.print("Do you want to continue? Press 'y' or 'Y' for yes and press any key to exit: ");
            user_input=sc.next();
            System.out.println("=====================================");
        }
        while (user_input.equals("y")||user_input.equals("Y"));
    }
}
