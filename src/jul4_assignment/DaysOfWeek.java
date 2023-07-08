package jul4_assignment;

import java.util.Scanner;

public class DaysOfWeek
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number from 1 to 7 : ");
        if(sc.hasNextInt())
        {
            int user_input = sc.nextInt();
            if (user_input == 1)
            {
                System.out.println("Sunday");
            } else if (user_input==2)
            {
                System.out.println("Monday");
            } else if (user_input==3)
            {
                System.out.println("Tuesday");

            } else if (user_input==4)
            {
                System.out.println("Wednesday");

            } else if (user_input==5)
            {
                System.out.println("Thursday");

            } else if (user_input==6)
            {
                System.out.println("Friday");

            } else if (user_input==7)
            {
                System.out.println("Saturday");

            }
            else
            {
                System.out.println("Please enter number between 1 and 7");
            }
        }
        else
        {
            System.out.println("invalid entry");
        }


    }
}
