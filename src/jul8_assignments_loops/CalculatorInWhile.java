package jul8_assignments_loops;

import java.util.Scanner;

/*
simple calculator using while loop
 */
public class CalculatorInWhile
{
    public static void main(String[] args)
    {
        int first_number, second_number;
        char operator;
        String cus_reply;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Simple Calculator");
        do {
            System.out.print("Enter your first number: ");
            if (sc.hasNextInt())
            {
                first_number = sc.nextInt();
                System.out.print("Enter your second number: ");
                if (sc.hasNextInt())
                {
                    second_number = sc.nextInt();
                    System.out.print("Enter the operator (+,-,*,/,%): ");
                    operator = sc.next().charAt(0);
                    switch (operator)
                    {
                        case '+':
                            System.out.println("Result is : " + (first_number + second_number));
                            break;
                        case '-':
                            System.out.println("Result is : " + (first_number - second_number));
                            break;
                        case '*':
                            System.out.println("Result is : " + (first_number * second_number));
                            break;
                        case '/':
                            System.out.println("Result is : " + (first_number / second_number));
                            break;
                        case '%':
                            System.out.println("Result is : " + (first_number % second_number));
                            break;
                        default:
                            System.out.println("Please enter a valid operator");
                            break;



                    }

                }
                else
                {
                    System.out.println("Please enter a valid number");
                }
            }
            else
            {
                System.out.println("please enter a valid number");
            }
            System.out.print("Do you want to continue? : Press y or Y for yes and any other key to exit: ");
            cus_reply=sc.next();
        }while (cus_reply.equals("y")||cus_reply.equals("Y"));

    }


}
