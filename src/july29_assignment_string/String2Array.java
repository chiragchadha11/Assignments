package july29_assignment_string;

public class String2Array
{
    String str;
    String2Array(String str)
    {
        this.str=str;
        string2Array();
    }
    public void string2Array()
    {
        char[] arr = str.toCharArray();
        for (int i=0; i<arr.length; i++)
        {
            System.out.println("char at index ["+i+"] is: " + arr[i]);
        }
    }
}
