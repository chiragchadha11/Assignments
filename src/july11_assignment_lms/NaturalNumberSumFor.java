package july11_assignment_lms;

import java.util.Scanner;

/*
4. Write a Java program to display n terms of natural numbers and their sum.
problem with this code
 */
public class NaturalNumberSumFor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to display natural numbers: ");
        if (sc.hasNextInt())
        {
            int limit = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <=limit; i++)
            {
                //System.out.println("hello");
                System.out.print(i + " ");
                sum+=i;
            }
            System.out.println("\nSum of " + limit + " natural numbers is " + sum );
        }
    }
}
