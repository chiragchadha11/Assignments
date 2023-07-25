package july22_array_assignment;

public class Main
{
    public static void main(String[] args)
    {
        ArrayStringSorting ob1 = new ArrayStringSorting();
        ob1.sortArray(new String[]{"amit","derek","chirag","danial","deepak"});
        ArrayMinElement ob2 = new ArrayMinElement();
        System.out.println("\nThe minimum element out of the array is: " + ob2.minElement(new int[]{11, 22, 33, 44, 55, 66, 99, 78, 88, 66,9}));
        ArrayMaxElement ob3 = new ArrayMaxElement();
        System.out.println("The maximum element out of the array is: " + ob3.maxElement(new int[]{11,22,66,44,99,33,44,88,66}));
    }
}
