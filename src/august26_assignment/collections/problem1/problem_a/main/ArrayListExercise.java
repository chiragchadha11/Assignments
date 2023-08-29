package august26_assignment.collections.problem1.problem_a.main;
/*
Problem A: Find employees aged over 50
 */
import august26_assignment.collections.problem1.problem_a.employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExercise
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


        //System.out.println(list1);

        ListIterator<Employee> itr = list1.listIterator();
        List<Employee> list2 = new ArrayList<>();
        while (itr.hasNext())
        {
            Employee ee = itr.next();
            int i = ee.age;
            if (i>50)
            {
                list2.add(ee);
            }
            else
            {
                itr.remove();
            }
        }
        System.out.println("Employees with age more than 50 are: " + list2);




    }

}
