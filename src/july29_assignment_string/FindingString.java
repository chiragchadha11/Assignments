package july29_assignment_string;

public class FindingString
{
    public void findStringPreMethod(String str,char alphabet)
    {
        int i = str.indexOf(alphabet);
        if (i >=0)
        {
            System.out.println("The alphabet " + alphabet + " is present in " + str + " at [" + i + "] index position");

        }
        else
        {
            System.out.println("The alphabet " + alphabet + " is not present in " + str);
        }
    }
    public void findString(String str,char alphabet)
    {
        char[] arr = str.toCharArray();
        boolean status = false;
        for (int i=0; i<arr.length; i++)
        {

            if (arr[i] == alphabet)
            {
                System.out.println("The alphabet " + alphabet + " is present in " + str + " at ["+ i +"] index position");
                status = true;
            }

        }
        if (!status)
        {
                System.out.println("The alphabet " + alphabet + " is not present in " + str);

        }
    }

    public void findString3(String str, char alphabet) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == alphabet) {
                System.out.println("The alphabet " + alphabet + " is present in " + str + " at [" + i + "] index position");


            }
        }
    }
}
