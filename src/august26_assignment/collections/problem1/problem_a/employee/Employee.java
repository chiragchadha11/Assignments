package august26_assignment.collections.problem1.problem_a.employee;

public class Employee
{
    public String name;
    public int age;
    public String country;

    public Employee(String name, int age, String country)
    {
        this.name = name;
        this.age = age;
        this.country = country;

    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
