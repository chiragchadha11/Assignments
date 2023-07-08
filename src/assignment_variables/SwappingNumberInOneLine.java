package assignment_variables;
/*
swapping 2 numbers in one statement
it can be done in one line using binary bitwise operator

 */
public class SwappingNumberInOneLine
{
    public static void main(String[] args)
    {
        int x = 12;
        int y =25;
        x = x^y^(y=x);
        System.out.println("x and y after swapping are  X : " + x + " y : " + y);
    }
}
