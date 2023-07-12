package july11_assignment_lms;
/*
6.Write a Java program to display the cube of the given number up to an integer.
 */
import java.util.Scanner;

public class Cube
{
    public static void main(String[] args)
    {
        String user_input="y";
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number of which you want a cube: ");
            if(sc.hasNextInt())
            {
                long user_no = sc.nextInt();
                long cube = user_no*user_no*user_no;
                if (cube<Integer.MAX_VALUE)
                {
                    System.out.println("Cube of " + user_no + " is: " + cube);
                }
                else if (cube>Integer.MAX_VALUE)
                {
                    System.out.println("Value exceeds max integer value");
                }
                System.out.print("Do you want to continue? Press 'y' or 'Y' to continue or any other key to exit: ");

                user_input=sc.next();
            }
            else
            {
                System.out.println("Please enter a valid integer number");
            }



        }while (user_input.equals("y")||user_input.equals("Y"));

    }
}
