package july29_assignment_string;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("--------------------------WAP to reverse a string----------------------------");
        ReverseString rv = new ReverseString();
        System.out.println("Reversing String: "+ rv.revString("pragra"));

        System.out.println("-------------------WAP to concat 2 String-----------------------------------");

        StringConcat sc = new StringConcat();
        System.out.println(sc.concatString("hello", " java"));

        System.out.println("------------------WAP to convert String 2 array----------------------------");
        String2Array sa = new String2Array("pragra");

        System.out.println("-------------------WAP to find the alphabet in string------------------------");
        FindingString fs = new FindingString();
        fs.findString("pragra", 'a');
        fs.findStringPreMethod("pragra", 'a');
        fs.findString3("pragra", 'a');


    }
}
