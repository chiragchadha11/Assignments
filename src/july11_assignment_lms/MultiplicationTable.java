package july11_assignment_lms;
/*
7. Write a Java program to display the multiplication table of a given integer using while loop.
 */

import java.util.Scanner;

public class MultiplicationTable
{
    Scanner sc = new Scanner(System.in);
    int table;
    String user_reply;

        public int getTableValue()
        {
            System.out.println("Welcome to the Maths table");
            System.out.print("Please enter the number of which table is required: ");
            if (sc.hasNextInt())
            {
                table = sc.nextInt();
            }
            else
            {
                System.out.println("Please provide valid integer value");
                System.exit(0);
            }
            return table;
        }
        public void mathTable()
        {
            table = getTableValue();
            int counter = 1;
            while (counter!=11)
            {
                System.out.println(table + " * " + counter + " = " + (table*counter));
                counter++;
            }
            System.out.println("===========================================================");

            repeat();
        }

        public void repeat()
        {
            System.out.print("Do you want to print another table? If yes press any y or Y and for no press any key: ");
            user_reply = sc.next();
            if (user_reply.equals("y")||user_reply.equals("Y"))
            {
                mathTable();
            }
            else
            {
                System.exit(0);
            }
        }


}
