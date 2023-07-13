package git_assignment;

import java.util.Scanner;

/*
WAP to find the greater of three numbers. We have to take the numbers from user
1. We can update the code and fix the bugs in the code e.g. in a case of all the numbers are equal, 2 numbers are same...etc
2. We can work by making separate branches keeping the original code in main or master branch, making changes in the code
    by making the feature branch by the own name (feature_yourname) and one develop name branch where we can merge the code after fixing the bugs
3. We can introduce loop for the code to ask user if it want to continue or not.
 */
public class GreaterOfThreeNo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        if (sc.hasNextInt())
        {
            int no1 = sc.nextInt();
            System.out.print("Enter second number: ");
            if (sc.hasNextInt())
            {
                int no2 = sc.nextInt();
                System.out.print("Enter third number: ");
                if (sc.hasNextInt())
                {
                    int no3 = sc.nextInt();
                    if (no1>no2)
                    {
                        if (no1>no3)
                        {
                            System.out.println(no1 + " is the greatest number");
                        }
                        else
                        {
                            System.out.println(no3 + " is the greatest number");
                        }
                    }
                    else if (no2>no3)
                    {
                        System.out.println(no2 + " is the greatest number");

                    }
                    else
                    {
                        System.out.println(no3 + " is the greatest number");
                    }
                }
            }
        }

    }
}
