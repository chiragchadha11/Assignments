package jul8_assignments_loops;
/*
Customer care application using switch, nested switch, laddered if and nested if
 */
import java.util.Scanner;

public class CustomerCare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to E2E Telecommunications.....");
        System.out.print("Kindly select from the following options : \nPress 1 for E2E Mobile services, \nPress 2 for E2E Broadband services, \nPress 3 for E2E DTH services : ");
        if (sc.hasNextInt()) //validating input for integer values...
        {
            int customer_input = sc.nextInt(); //getting the input as integer from user and storing it into variable customer_input
            switch (customer_input)
            {
                case 1:
                    System.out.print("Welcome to E2E mobile services and please select one out of the following options : \npress 'b' for billing information, \npress 'r' for roaming related information, \npress 'm' for mobile data and \npress 'c' to get connected to customer care executive : ");
                    if (sc.hasNext())
                    {
                        char customer_mob_selection = sc.next().charAt(0);
                        switch (customer_mob_selection) //sub switching using char as scanner intake
                        {
                            case 'b':
                                System.out.print("Your billing cycle starts from 4th of every month: \nif your problem is resolved than press 1 or press 2 to exit: ");
                                if (sc.hasNextInt())
                                {
                                    int cus_billing_option = sc.nextInt();
                                    if (cus_billing_option == 1)
                                    {
                                        System.out.println("Thank you for choosing E2E communications...");
                                    }
                                    else if (cus_billing_option == 2)
                                    {
                                        System.exit(0); //this is used to terminate the current running program.
                                    }
                                }
                                else
                                {
                                    System.out.println("Please enter a valid integer value");
                                }
                                break;
                            case 'r':
                                System.out.println("Your roaming service by default are activated");
                                break;
                            case 'm':
                                System.out.println("5G service is currently activated on your number");
                                break;
                            case 'c':
                                System.out.println("Kindly stay connected you will be connected to next available customer care representative");
                                break;
                            default:
                                System.out.println("please select a valid option");
                                break;



                        }
                    }
                    else
                    {
                        System.err.println("Please enter a valid character");
                    }
                    break; //breaking the first switch case 1
                case 2: //case 2 for main switch
                    System.out.print("Welcome to E2E broadband services and please select one out of the following options: \n 1 for internet services \n 2 for landline phones: ");
                    if (sc.hasNextInt())
                    {
                        int customer_brd_inp = sc.nextInt(); //nested loop inside the switch statement
                        if (customer_brd_inp==1)
                        {
                            System.out.println("Welcome to the internet services");
                        }
                        else if (customer_brd_inp==2)
                        {
                            System.out.println("Welcome to the landlines phones");
                        }
                        else
                        {
                            System.out.println("please enter a valid option");
                        }
                    }
                    else
                    {
                        System.err.println("Please enter a valid integer value");
                    }
                    break; //breaking the second switch statement
                case 3: //case 3 of main switch
                    System.out.println("Welcome to the E2E DTH services and please select one out of the following services: \ntype 'package' to know your package,\ntype 'balance' to know your balance and\ntype 'exit' to exit : ");
                    if (sc.hasNext())
                    {
                        String dth_cus_options = sc.next(); //creating sub switch using String as the intake from the user
                        switch (dth_cus_options)
                        {
                            case "package":
                                System.out.println("you have platinum package");
                                break;
                            case "balance":
                                System.out.println("you have $499 balance");
                                break;
                            case "exit":
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Please enter a valid option");
                        }
                    }
                    else
                    {
                        System.err.println("Please enter a valid integer value");
                    }
                    break; //breaking the third switch case
                default:
                    System.out.println("Please choose a valid option"); //default for main switch
            }


        }
        else
        {
            System.err.println("Please enter the valid integer value");
        }
}
}
