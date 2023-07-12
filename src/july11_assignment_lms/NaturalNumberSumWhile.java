package july11_assignment_lms;
/*
4. Write a Java program to display n terms of natural numbers and their sum.
 */
import java.util.Scanner;

public class NaturalNumberSumWhile
{
    public static void main(String[] args)
    {
        System.out.println("Sum of n terms natural numbers using while loop");
        int limit=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to display natural numbers: ");
        if (sc.hasNextInt())
        {
            limit = sc.nextInt();
            int number = 1;
            int sum = 0;
            while (number!=limit+1)
            {
                System.out.print(number + " ");
                sum += number;
                number++;
            }

            System.out.println("\nSum of " + limit + " natural number is " + sum);
        }

    }
}
