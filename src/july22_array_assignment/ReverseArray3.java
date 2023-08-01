package july22_array_assignment;

public class ReverseArray3
{
    public static void main(String[] args)
    {
        int[] arr = {11,22,33,44,55,66};
        int temp;
        for (int i=0; i<arr.length-1; i++)
        {

            temp=arr[(arr.length-1)-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;
            if (arr[i]==arr[arr.length/2])
            {
                temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
                break;
            } else if (arr[i]==arr[arr.length-1-i])
            {
                break;
                
            }


        }
        for(int arr2:arr)
        {
            System.out.print(arr2 + " ");
        }

    }
}
