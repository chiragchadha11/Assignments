package july22_array_assignment;

public class ArrayMinElement
{
    int minElement(int[] arr)
    {
        int min = arr[0];
        for (int i=1; i<arr.length; i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}

