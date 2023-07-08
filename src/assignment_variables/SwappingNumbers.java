package assignment_variables;
/*
-> Swapping 2 numbers without using 3rd variables
 */
public class SwappingNumbers
{
   public static void main(String[] args)
   {
      int a = 11, b = 22;

      System.out.println("a before swapping : " + a);
      System.out.println("b before swapping : " + b);
      System.out.println("===========================");
      a = a+b;
      b = a-b;
      a = a-b;
      System.out.println("a after swapping : " + a);
      System.out.println("b after swapping : " + b);

   }

}
