package jul4_assignment;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        if(sc.hasNextInt())
        {
            int year = sc.nextInt();
            if(year%4==0)
            {
                System.out.println( year + " is a leap year");
            }
            else
            {
                System.out.println( year + " is not a leap year");
            }
        }
        else
        {
            System.out.println("Please enter valid year");
        }
    }
}
