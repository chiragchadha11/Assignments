package july29_assignment_string;

public class ReverseString
{
    public String revString(String str)
    {
        String rev="";
        int length = str.length();
        for (int i=length-1; i>=0; i--)
        {
            rev=rev+str.charAt(i);
        }
        return rev;
    }
}
