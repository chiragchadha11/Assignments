package august26_assignment.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
● List<String> strList = Arrays.asList("Pragra", "", "Software", "", "Java",
"Spring", “ ”, “Shell”);
1. Return the number of empty strings
2. Return the string length more than 4
3. Return the number of string which starts with S
4. Remove all the empty strings from the list
5. Create a list with string more than 2 character
6. Convert String to uppercase and join them using coma
 */
public class Problem1
{
    public static void main(String[] args)
    {

        List<String> strList = Arrays.asList("Pragra", "", "Software", "", "Java", "Spring","","Shell");
        System.out.println("Number of empty Strings are: " +strList.stream().filter(e -> e.isEmpty()).count());
        System.out.println("Strings with length more than 4 is: " + strList.stream().filter(e -> e.length() > 4).collect(Collectors.toList()));
        System.out.println("Strings which starts with 'S' are: " + strList.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList()));
        System.out.println("Strings after removing all the empty strings: " + strList.stream().filter(e -> !e.isEmpty()).collect(Collectors.toList()));
        List<String> strList2 = new ArrayList<>();
        strList2.add("Learn");
        strList2.add("java");
        System.out.println(strList2);
        System.out.println(strList2.stream().map(e -> e.toUpperCase()).collect(Collectors.toList()));

    }
}
