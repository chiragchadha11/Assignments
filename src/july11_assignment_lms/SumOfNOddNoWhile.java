package july11_assignment_lms;
/*
8. Write a Java program that displays the sum of n odd natural numbers using while loop.
 */
import java.util.Scanner;

public class SumOfNOddNoWhile
{
    public static void main(String[] args)
    {
        String user_input = "y";
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number upto which sum of odd number is required: ");
            if(sc.hasNextInt())
            {
                int number=sc.nextInt();
                int counter=1, sum=0;
                while(counter!=number+1)
                {
                    if(counter%2!=0)
                    {
                        sum+=counter;
                    }
                    counter++;
                }
                System.out.println("Sum of upto " + number + " odd numbers is " + sum);
                System.out.print("Do you want to continue? Press 'y' or 'Y' for yes or press any key to exit: ");
                user_input=sc.next();

            }
            else
            {
                System.out.println("Please enter a valid number");
                //System.exit(0);
            }


        }while (user_input.equals("y")||user_input.equals("Y"));

    }
}
