package august26_assignment.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
● List<Integer> numbers = Arrays.asList(9,5,34,56,2,6, 10, 3, 4,3, 6, 7, 3, 4);
1. Create list of square of all distinct numbers
2. Get Count, min , max, sum and average for numbers
 */
public class Problem2
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(9,5,34,56,2,6, 10, 3, 4,3, 6, 7, 3, 4);
        System.out.println("Square of all the distinct numbers are: " +numbers.stream().distinct().map(e -> e * e).collect(Collectors.toList()));
        System.out.println("Count of all the numbers are: " + numbers.stream().count());
        System.out.println("Minimum of all the numbers is: " + Collections.min(numbers));
        System.out.println("Minimum of all the number using stream is: "+ numbers.stream().min(Integer::compare).get());
        System.out.println("Maximum of all the number using stream is: " + numbers.stream().max(Integer::compare).get());
        System.out.println("Maximum of all the numbers is: " + Collections.max(numbers));
        System.out.println("Sum of all the numbers is: " + numbers.stream().reduce(0, (a, b) -> a + b));
        System.out.println(numbers.stream().reduce(0, (a, b) -> Math.toIntExact(a + b / numbers.stream().count())));
        //OptionalDouble average = numbers.stream().mapToInt(e->e).average();
        System.out.println(numbers.stream().mapToDouble(e -> e).average().getAsDouble());

    }
}
