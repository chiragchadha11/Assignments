package july11_assignment_lms;
/*
2. WAP to check the alphabet is vowel or a consonant
 */
import java.util.Scanner;

public class AlphabetChecker
{

    public void alphabetChecker()
    {
        String user_input = "y";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the character you want to check: ");
            String pattern = "[a-z,A-Z]+";
            if (sc.hasNext(pattern)) {

                String input_char = sc.next();
                if (input_char.length() <= 1) {
                    if (input_char.equalsIgnoreCase("a") || input_char.equalsIgnoreCase("e") || input_char.equalsIgnoreCase("i") || input_char.equalsIgnoreCase("o") || input_char.equalsIgnoreCase("u")) {
                        System.out.println(input_char + " is a vowel");
                    } else {
                        System.out.println(input_char + " is a consonant");
                    }

                } else {
                    System.out.println("Please enter single charater");
                }
            } else {
                System.out.println("please enter a valid alphabet");
                continue;
            }

            System.out.print("Do you want to continue? Press 'Y'or 'y' for yes and any other key to exit: ");
            user_input = sc.next();

        }
        while (user_input.equals("y") || user_input.equals("Y"));
    }


}
