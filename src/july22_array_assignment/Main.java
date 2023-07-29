package july22_array_assignment;

public class Main
{
    public static void main(String[] args)
    {
        //to sort an array of String
        ArrayStringSorting ob1 = new ArrayStringSorting();
        ob1.sortArray(new String[]{"amit","derek","chirag","danial","deepak"});
        System.out.println("\n===============================");

        //to find minimum element in an array
        ArrayMinElement ob2 = new ArrayMinElement();
        System.out.println("The minimum element out of the array is: " + ob2.minElement(new int[]{11, 22, 33, 44, 55, 66, 99, 78, 88, 66,9}));
        System.out.println("================================");

        //to find the largest element in an array
        ArrayMaxElement ob3 = new ArrayMaxElement();
        System.out.println("The maximum element out of the array is: " + ob3.maxElement(new int[]{11,22,66,44,99,33,44,88,66}));
        System.out.println("====================================");

        //for search element in an array
        SearchArrayElement ob4 = new SearchArrayElement();
        ob4.elementSearch(0,new int[]{44,66,3,9,99,88,33,11});
        System.out.println("====================================");

        //for reversing an array
        ReverseArray ob5 = new ReverseArray();
        int[] rev=ob5.reverseArray(new int[]{2,3,4,5,8,9,11});
        for(int r:rev)
        {
            System.out.print(r+" ");
        }
        System.out.println("\n=======================================");

        //for reversing an array using another method
        ArrayRev2 ob6 = new ArrayRev2();
        ob6.revArray(new int[]{1,2,3,4,5,6,});

    }
}
