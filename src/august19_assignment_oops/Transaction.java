package august19_assignment_oops;

public final class Transaction
{
    public final static String monthlyInterestCalculator(String amount,String interestRate)
    {
        Double amount1 = Double.valueOf(amount);
        Double interestRate1 = Double.valueOf(interestRate);
        Double monthlyInstallment1 = (amount1*(interestRate1/100))/12;
        String monthlyInstallment = monthlyInstallment1.toString();
        return monthlyInstallment;
    }
}
