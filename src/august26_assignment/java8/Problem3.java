package august26_assignment.java8;
/*
● In the below example, we have a List of Person objects.
1. We need to check if there is any person residing in a particular
country.
2. We need to get the first person on the list who belongs to a
particular country.
3. Count the number of person with age more than 30

 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3
{
    public static void main(String[] args)
    {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave",23,"India"));
        list.add(new Person("Joe",18,"USA"));
        list.add(new Person("Ryan",54,"Canada"));
        list.add(new Person("Iyan",5,"India"));
        list.add(new Person("Ray",63,"China"));

        System.out.println("All the Employees residing in India are: " +list.stream().filter(e -> e.country.equals("India")).collect(Collectors.toList()));
        System.out.println("First Employee residing in India is: " + list.stream().findFirst().filter(e -> e.country.equals("India")));
        System.out.println("First Employee residing in India using limit is: " + list.stream().filter(e -> e.country.equals("India")).limit(1).collect(Collectors.toList()));
        System.out.println("All the Employees with age more than 30 are: " + list.stream().filter(e -> e.age > 30).collect(Collectors.toList()));
    }
}
