package jul8_assignments_loops;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        System.out.println("============Fibonacci Series======================");
        System.out.println("=============with while loop=======================");
        int no1=0, no2=1;
        System.out.print(no1);
        while (no2<=100)
        {

            int temp=no1+no2;//adding the previous 2 numbers and storing in temp variable
            no1=no2; //passing value of no2 to no1
            no2=temp;//passing value of temp to no2
            System.out.print(" "+no2);
        }
        System.out.println("\n================with for loop===================");
        int i=0, no11=0,no22=1;

        for (System.out.print(no11);i<=10;i++)
        {
            int temp=no11+no22;
            no11=no22;
            no22=temp;
            System.out.print(" " +no22);
        }

        System.out.println("\n==================with do while loop=================");

        int no111=0, no222=1;

        System.out.print(no111);

        do
        {
            int temp=no111+no222;
            no111=no222;
            no222=temp;
            System.out.print(" " +no222);
        }
        while (no222<=100);


    }
}
