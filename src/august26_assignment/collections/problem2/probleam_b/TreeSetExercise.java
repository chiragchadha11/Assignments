package august26_assignment.collections.problem2.probleam_b;
/*
Problem B: Smallest and largest number in array
 */
public class TreeSetExercise
{
    public static void main(String[] args)
    {
        int[] numbers ={1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};
        int max = 1;
        for (int i=0; i<numbers.length; i++)
        {
            if (numbers[i]>max)
            {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number is: " + max);
        int min = 1;
        for (int i=0; i<numbers.length; i++)
        {
            if (numbers[i]<min)
            {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number is: " + min);
    }
}
