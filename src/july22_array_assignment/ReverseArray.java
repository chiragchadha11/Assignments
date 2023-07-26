package july22_array_assignment;

public class ReverseArray
{
    public int[] reverseArray(int[] arr)
    {
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            temp=arr[(arr.length-1)-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;
            //System.out.println(temp);
            if(arr[i]==arr[arr.length-1-i])
            {
                break;
            }
            else if(arr[i]==arr[(arr.length/2)])
            {
                temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
                break;
            }
        }
        return arr;
    }
}
