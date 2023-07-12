package july11_assignment_lms;

import java.util.Scanner;

/*
4. Write a Java program to display n terms of natural numbers and their sum.
 */
public class NaturalNumberSumDoWhile
{
    public static void main(String[] args)
    {
        System.out.println("Sum of n terms natural numbers using do while loop");
        int limit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to display natural numbers: ");
        if (sc.hasNextInt())
        {
            limit = sc.nextInt();
            int number=1;
            int sum=0;
            do
            {
                System.out.print(number + " ");
                sum +=number;
                number++;

            }
            while (number!=limit+1);
            System.out.println("\nSum of "+ limit + " natural numbers is : " + sum);
        }

    }
}
