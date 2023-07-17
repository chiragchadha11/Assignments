package july11_assignment_lms;
/*
8. Write a Java program that displays the sum of n odd natural numbers using for loop.
 */
import java.util.Scanner;

public class SumOfNOddNo {

    String user_reply = null;
    int number;
        Scanner sc = new Scanner(System.in);

        public int userNumber()
        {
            System.out.print("Enter the number upto which you want to have sum of odd numbers: ");
            if (sc.hasNextInt()) {

                number = sc.nextInt();

            }
            else
            {
                System.err.println("Please enter a valid integer value");
                System.exit(0);
            }
            return number;
        }
        public void sumOfOddNo()
        {
            number = userNumber();
            int sum = 0;
            for (int i = 0; i <= number; i++) {
                if (i % 2 != 0)
                {
                    sum += i;
                }

            }
            System.out.println("Sum of upto " + number + " odd numbers is " + sum);
            repeat();

        }
        public void repeat()
        {
            System.out.print("Do you want to continue? if yes press 'y' or 'Y' and press any other key to exit: ");
            if (sc.hasNext())
            {
                user_reply=sc.next();
                if (user_reply.equals("y")||user_reply.equals("Y"))
                {
                    sumOfOddNo();
                }
                else
                {
                    System.exit(0);
                }
            }
            else
            {
                System.err.println("Please enter a valid entry");
                System.exit(0);
            }
        }


    }

