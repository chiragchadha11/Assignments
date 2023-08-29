package august26_assignment.collections.problem1.problem_b.main;

import august26_assignment.collections.problem1.problem_b.employee.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee("Alex", 23, "USA"));
        list1.add(new Employee("Dave",34,"India"));
        list1.add(new Employee("Carl",21,"USA"));
        list1.add(new Employee("Joe",56,"Russia"));
        list1.add(new Employee("Amit",64,"China"));
        list1.add(new Employee("Ryan",19,"Brazil"));

        List<Employee> list2 = new ArrayList<>();
        Iterator<Employee> itr = list1.listIterator();
        while(itr.hasNext())
        {
            Employee ee = itr.next();
            String country = ee.country;
            if (ee.country.equals("USA"))
            {
                itr.remove();
            }
            else
            {
                list2.add(ee);
            }
        }

        System.out.println("All the Employees which are not from USA are: " + list2);
    }
}
