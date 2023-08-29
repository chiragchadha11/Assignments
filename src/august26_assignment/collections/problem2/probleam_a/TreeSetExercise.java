package august26_assignment.collections.problem2.probleam_a;
//Problem A: Numbers greater than 50
public class TreeSetExercise
{
    public static void main(String[] args)
    {
        int[] numbers ={1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};
        System.out.print("All the numbers greater than 50 are: ");
        for (int i=0; i<numbers.length; i++)
        {
            if (numbers[i]>50)
            {
                System.out.print(numbers[i]+" ");
            }
        }
    }
}
