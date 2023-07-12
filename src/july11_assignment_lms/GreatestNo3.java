package july11_assignment_lms;
/*
1. Write a Java program that takes three numbers from the user and prints the greatest number.

 */
import java.util.Scanner;

public class GreatestNo3
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

                    if (first_number>second_number)
                    {
                        if (first_number>third_number)
                        {
                            System.out.println(first_number + " is greatest");
                        }
                        else
                        {
                            System.out.println(third_number + " is greatest");
                        }
                    }
                    else if (second_number>first_number)
                    {
                        if (second_number>third_number)
                        {
                            System.out.println(second_number + " is greatest");
                        }
                        else
                        {
                            System.out.println(third_number + " is greatest");
                        }
                    }
                    else if (third_number>second_number)
                    {
                        if (third_number>first_number)
                        {
                            System.out.println(third_number + " is greatest");
                        }
                        else
                        {
                            System.out.println(first_number + " is greatest");
                        }
                    }
                    else if (first_number==second_number)
                    {
                        if (first_number==third_number)
                        {
                            System.out.println("All the numbers are equal");
                        }
                        else if (first_number>third_number)
                        {
                            System.out.println(first_number + " is greatest");

                        } else
                        {
                            System.out.println(third_number + " is greatest");
                        }

                    } else if (first_number==third_number)
                    {
                        if (first_number>second_number)
                        {
                            System.out.println(first_number + " is greatest");
                        }
                        else
                        {
                            System.out.println(second_number + " is greatest");
                        }

                    } else if (second_number==third_number)
                    {
                        if (second_number>first_number)
                        {
                            System.out.println(second_number + " is greatest");
                        }
                        else
                        {
                            System.out.println(first_number + " is greatest");
                        }

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
