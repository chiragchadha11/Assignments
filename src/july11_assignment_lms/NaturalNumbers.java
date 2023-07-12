package july11_assignment_lms;
/*
3. Write a Java program to display the first 10 natural numbers.

 */
public class NaturalNumbers
{
    public static void main(String[] args)
    {
        System.out.println("========================using while loop================================");

        int natural_numbers=1;
        while (natural_numbers!=11)
        {
            System.out.print(natural_numbers + " ");
            natural_numbers++;
        }

        System.out.println("\n===================using do while loop==========================");

        natural_numbers=1;
        do
        {
            System.out.print(natural_numbers + " ");
            natural_numbers++;
        }while (natural_numbers!=11);

        System.out.println("\n======================using for loop=============================");

        for (int i=1; i<=10; i++)
        {
            System.out.print(i+" ");
        }



    }


}
