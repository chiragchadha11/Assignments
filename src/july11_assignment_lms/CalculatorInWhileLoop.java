package july11_assignment_lms;
/*
simple calculator using while loop
 */
import java.util.Scanner;

public class CalculatorInWhileLoop {

    int first_number, second_number;
    Scanner sc = new Scanner(System.in);
    char operator;
    String cus_reply;

    public int setFirstNumbers() {
        System.out.print("Enter first number: ");
        if (sc.hasNextInt())
        {
            first_number = sc.nextInt();
        }
        else
        {
            System.err.println("Invalid integer value");
            System.exit(0);
        }

        return first_number;
    }

    public int setSecondNumber()
    {
        System.out.print("Enter second number: ");
        if (sc.hasNextInt())
        {
            second_number = sc.nextInt();
        }
        else
        {
            System.err.println("Invalid integer value");
            System.exit(0);
        }
        return second_number;
    }
    public char setOperator()
    {
        System.out.print("Please enter the operation you want to apply('+','-','*','/','%'): ");
        if (sc.hasNext())
        {
            operator = sc.next().charAt(0);
        }
        else
        {
            System.err.println("Invalid operator entered");
            System.exit(0);
        }
        return operator;
    }
    public void calculator()
    {
        first_number = setFirstNumbers();
        second_number = setSecondNumber();
        switch (setOperator())
        {
            case '+':
                System.out.println("Sum: " + first_number + " + " + second_number + " = " + (first_number+second_number));
                break;
            case '-':
                System.out.println("Subtraction: " + first_number + " - " + second_number + " = " + (first_number-second_number));
                break;
            case '*':
                System.out.println("Multiplication: " + first_number + " * " + second_number + " = " + (first_number*second_number));
                break;
            case '/':
                System.out.println("Division: " + first_number + " / " + second_number + " = " + (first_number/second_number));
                break;
            case '%':
                System.out.println("Modulus: " + first_number + " % " + second_number + " = " + (first_number%second_number));
                break;
            default:
                System.out.println("Please enter a valid operator");
                break;
        }
        repeatCalculation();
    }

    public void repeatCalculation()
    {
        System.out.print("Do you want to continue?, for yes type 'y' or 'Y' or press any other key to exit: ");
        if (sc.hasNext())
        {
            cus_reply=sc.next();
        }
        else
        {
            System.out.println("Please enter valid option");
        }
        if (cus_reply.equals("y")||cus_reply.equals("Y"))
        {
            calculator();
        }
        else
        {
            System.exit(0);
        }
    }
}
