package jul4_assignment;

import java.util.Scanner;

public class EvenOddNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if(sc.hasNextInt())
        {
            int number = sc.nextInt();
            if(number%2==0)
            {
                System.out.println( number  + " is an even number");
            }
            else
            {
                System.out.println( number + " is an odd number");
            }
        }
        else
        {
            System.out.println("Please enter a valid number");
        }
    }
}
