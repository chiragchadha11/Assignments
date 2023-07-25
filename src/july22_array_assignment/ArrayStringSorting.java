package july22_array_assignment;

public class ArrayStringSorting
{
    public void sortArray(String[] arr)
    {
        for (int round=0; round<arr.length; round++)
        {
            String temp;
            boolean status = false;
            for (int i=0; i<arr.length-1; i++)
            {
                if (arr[i].compareTo(arr[i+1])>0)
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
        for (String str:arr)
        {
            System.out.print(str+" ");
        }
    }
}
