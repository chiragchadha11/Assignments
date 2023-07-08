package jul4_assignment;

import java.util.Scanner;

public class GreaterOf3Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        if (sc.hasNextInt())
        {
            int first_number = sc.nextInt();
            System.out.print("Enter second number : ");

            if (sc.hasNextInt()) {
                int second_number = sc.nextInt();
                System.out.print("Enter third number : ");

                if (sc.hasNextInt())
                {
                    int third_number = sc.nextInt();

                    if (first_number>second_number && first_number>third_number)
                    {
                        System.out.println(first_number + " is greater than " + second_number + " and " + third_number);
                    } else if (second_number >first_number && second_number>third_number)
                    {
                        System.out.println(second_number + " is greater than " + first_number + " and " + third_number);
                    }
                    else
                    {
                        System.out.println(third_number + " is greater than " + first_number + " and " + second_number);
                    }

                }
                else
                {
                    System.out.println("please enter a valid number");
                }
            }
            else
            {
                System.out.println("please enter a valid number");
            }
        }
        else
        {
            System.out.println("please enter a valid number ");
        }

    }
}
