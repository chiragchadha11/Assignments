package july22_array_assignment;

public class ArraySortingBubble
{
    public static void arrSort(int[] arr)
    {
        for (int round=0; round<arr.length; round++)
        {
            int temp;
            boolean status=false;
            for (int i=0; i<arr.length-1-round; i++)
            {
                if (arr[i] > arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    status=true;
                }

            }
            if (!status)
            {
                break;
            }
        }
        for (int a:arr)
        {
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {11,44,33,66,22,99,88};
        arrSort(arr);

    }
}
