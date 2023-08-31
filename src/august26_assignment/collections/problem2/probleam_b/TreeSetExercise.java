package august26_assignment.collections.problem2.probleam_b;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Integer> numList = Arrays.asList(1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56);
        System.out.println("Maximum number through lamba expression is: " +numList.stream().sorted().skip(23).collect(Collectors.toList()));

        int min = 1;
        for (int i=0; i<numbers.length; i++)
        {
            if (numbers[i]<min)
            {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Minimum number through lamba expression is: " +numList.stream().sorted().limit(1).collect(Collectors.toList()));
    }
}
