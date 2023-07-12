package july11_assignment_lms;
/*
5. Write a program in Java to input 5 numbers from the keyboard and find their sum and average .
using while loop
*/
import java.util.Scanner;

public class FiveNoSumAverageWhile
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String user_input;
        int user_no,counter=1,sum=0;

        do
        {
            System.out.println("Enter 5 numbers to calculate the sum and average\nCAUTION: Invalid entry will exit the code");

            while(counter!=6)
            {
                System.out.print("Enter number " + counter + ": ");
                if(sc.hasNextInt())
                {
                    user_no=sc.nextInt();
                    sum+=user_no;
                    counter++;

                }
                else
                {
                    System.out.println("Please enter a valid number");
                    System.exit(0);
                }
            }
            System.out.println("Sum of 5 numbers is " + sum + " and average is " + (sum/5));
            System.out.print("Do you want to continue? Type 'y' or 'Y' for yes or press any key to exit: ");

            user_input=sc.next();
            counter=1;
            sum=0;
            System.out.println("====================================================");
        }
        while(user_input.equals("y")||user_input.equals("Y"));

    }
}
