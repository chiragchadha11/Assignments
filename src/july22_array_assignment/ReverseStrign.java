package july22_array_assignment;

public class ReverseStrign
{
    public static void main(String[] args)
    {
        String name = "pragra";
        int length = name.length();
        String rev ="";
        for (int i=length-1; i>=0; i--)
        {
            //System.out.println(name.charAt(i));
            rev=rev+name.charAt(i);
        }
        //System.out.println();
        System.out.println(rev);

    }
}
