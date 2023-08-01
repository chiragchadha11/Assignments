package july29_assignment_constructors;

public class Main
{
    public static void main(String[] args)
    {
        Calculator cal = new Calculator(11, 2);
        System.out.println("Addition: " + cal.add());
        System.out.println("Subtraction: " + cal.subtract());
        System.out.println("Multiplication: " + cal.multiply());
        System.out.println("Division: " + cal.divide());


    }
}
