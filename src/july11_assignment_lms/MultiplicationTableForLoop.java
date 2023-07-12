package july11_assignment_lms;
/*
7. Write a Java program to display the multiplication table of a given integer using for loop.
 */
import java.util.Scanner;

public class MultiplicationTableForLoop
{
    public static void main(String[] args)
    {
        String user_input="y";
       do
       {
           Scanner sc = new Scanner(System.in);
           System.out.print("Please provide the number of which multiplication table is required: ");
           if (sc.hasNextInt())
           {
               int table = sc.nextInt();
               for (int i=1; i<=10; i++)
               {
                   System.out.println(table + " * " + i + " = " + (table*i));
               }
               System.out.print("Do you want to continue? type 'y' or 'Y' for yes or press any other key to exit: ");
               user_input=sc.next();
           }
           else
           {
               System.out.println("Please provide valid integer");
           }

           System.out.println("===================================================================================");


       }
       while (user_input.equals("y")||user_input.equals("Y"));

    }
}
