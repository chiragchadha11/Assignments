package july22_array_assignment;

public class ArrayRev2
{
    public void revArray(int[] arr)
    {

        //int[] arr={1,2,3,4,5};
        int[] rev_arr = new int[arr.length];
        int count =0;
        for( int i=arr.length-1; i>=0; i--)
        {

            rev_arr[count] = arr[i];
            count++;

        }


        for(int rev:rev_arr)
        {
            System.out.print(rev+" ");
        }
    }
}
