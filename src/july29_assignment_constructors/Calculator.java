package july29_assignment_constructors;

public class Calculator
{
    private double num1,num2;

    Calculator(double num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

     double add()
    {
        return num1+num2;
    }

    double subtract()
    {
        return num1-num2;
    }

    double multiply()
    {
        return num1*num2;
    }

    double divide()
    {
        return num1/num2;
    }


}
