package july22_array_assignment;

public class SearchArrayElement
{
    public void elementSearch(int element, int[]arr )
    {
        boolean status=false;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==element)
            {
                System.out.println(element + " is present in the array at index position of arr["+i+"]");
                status=true;
            }

        }
        if (!status)
        {
            System.out.println(element + " is not present in the array");
        }

    }
}
