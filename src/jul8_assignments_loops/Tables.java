package jul8_assignments_loops;
/*
table printing using do while loop
 */
import java.util.Scanner;

public class Tables
{
    public static void main(String[] args)
    {
        String user_reply;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Welcome to the Maths table");
            System.out.print("Please enter the number of which table is required: ");
            if (sc.hasNextInt())
            {
                int table = sc.nextInt();
                int counter = 1;
                while (counter!=11)
                {
                    System.out.println(table + " * " + counter + " = " + (table*counter));
                    counter++;
                }
            }
            System.out.println("Do you want to print another table? If yes press any y or Y and for no press any key");
             user_reply = sc.next();
            System.out.println("=======================================================");
        }
        while (user_reply.equals("y")||user_reply.equals("Y"));


    }
}
