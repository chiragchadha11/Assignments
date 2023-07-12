package july11_assignment_lms;
/*
8. Write a Java program that displays the sum of n odd natural numbers using for loop.
 */
import java.util.Scanner;

public class SumOfNOddNo
{
    public static void main(String[] args)
    {
        String user_reply ="y";
        do
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number upto which you want to have sum of odd numbers: ");
            if(sc.hasNextInt())
            {
                int sum=0;
                int number=sc.nextInt();
                for(int i=0; i<=number; i++)
                {
                    if(i%2!=0)
                    {
                        sum+=i;
                    }

                }
                System.out.println("Sum of upto " + number + " odd numbers is " + sum);
                System.out.print("Do you want to continue? Press 'y' or 'Y' for yes or press any key to exit: ");
                user_reply=sc.next();


            }

            else
            {
                System.out.println("Please enter a valid number");
                //System.exit(0);
            }



        }
        while (user_reply.equals("y")||user_reply.equals("Y"));


    }

}
