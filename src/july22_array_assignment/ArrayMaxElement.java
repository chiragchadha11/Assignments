package july22_array_assignment;

public class ArrayMaxElement
{
        int maxElement(int[] arr)
        {
            int max=arr[0];
            for (int i=1; i<arr.length; i++)
            {
                if (arr[i]>max)
                {
                    max=arr[i];
                }
            }
            return max;
        }

}
