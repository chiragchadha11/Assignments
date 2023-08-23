package august19_assignment_oops;

public class Main
{

    public static void main(String[] args)
    {
        //savings account transactions
        SavingsAccount sb = new SavingsAccount("1001000001", "derek","500");
        System.out.println(sb.getBalance());
        sb.performTransaction();
        String newAccountNumber = BankAccount.generateAccountNumber(sb.getAccountNumber());

        //chequing account transactions
        ChequingAccount cb = new ChequingAccount(newAccountNumber,"Danial","1100","0.2","500");
        cb.performTransaction();

        //calculating monthly installment
        System.out.println("monthly installment is: $" + Transaction.monthlyInterestCalculator("1000", "5"));


    }

}
