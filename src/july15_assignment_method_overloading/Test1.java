package july15_assignment_method_overloading;

public class Test1
{
    void display(int a)
    {
        System.out.println("First method: " + a);
    }
    void display(int... a)
    {
        for(int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println();

    }

    public static void main(String[] args)
    {
        Test1 ob = new Test1();
        ob.display();
        ob.display(6);
        ob.display(3,4,5,6,9);

    }
}
