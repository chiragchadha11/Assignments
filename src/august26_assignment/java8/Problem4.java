package august26_assignment.java8;
/*
In the given list below, print all the names in
1. upper case
2. Print the length of each word
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Dave");
        list.add("Joe");
        list.add("Ryan");
        list.add("Iyan");
        list.add("Ray");
        System.out.println("List in upper case are: " + list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList()));
        System.out.println("Length of each word in the List are: " +list.stream().map(e -> e.length()).collect(Collectors.toList()));
    }
}
