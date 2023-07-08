package jul4_assignment;

import java.util.Scanner;

public class DrivingLicense
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        if(sc.hasNextInt())
        {
            int age = sc.nextInt();

            if(age>=0 && age<16)
            {
                System.out.println("You are not eligible for driving");
            }
            else if(age>=16 && age<18)
            {
                System.out.println("You are eligible to apply for learner's license");
            }
            else if(age<0)
            {
                System.out.println("Please enter valid age");
            }
            else
            {
                System.out.println("You are eligible to apply for Driver's license");
            }

        }
        else
        {
            System.out.println("Please enter valid age");
        }
    }
}
