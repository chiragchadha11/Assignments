package jul4_assignment;

import java.util.Scanner;

public class NumberChecking
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if(sc.hasNextInt())
        {
            int number = sc.nextInt();
            if(number>=0)
            {
                System.out.println(number + " is a positive number");
            }
            else
            {
                System.out.println(number + " is a negative number");
            }
        }
        else
        {
            System.out.println("Please enter a valid integer number");
        }

    }
}
