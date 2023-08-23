package august19_assignment_oops;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SavingsAccount extends BankAccount implements Serializable
{
    private String interestRate;
    private String overDraftLimit;
    public SavingsAccount()
    {

    }

    public SavingsAccount(String accountNumber,String accountHolderName, String balance)
    {
        super(accountNumber,accountHolderName,balance);
    }

    public SavingsAccount(String interestRate, String overDraftLimit) {
        super();

        this.interestRate = interestRate;
        this.overDraftLimit = overDraftLimit;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(String overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void logTransaction()
    {
        System.out.println("Account Number: " + getAccountNumber() + " has balance: $" +getBalance());

    }

    @Override
    public void getTransactionHistory(int value,String amount)
    {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        String localtime = lt.format(DateTimeFormatter.ofPattern("HH:mm:ss"));


        if (value==0)
        {
            System.out.println("Amount of $" + amount + " deposited in Account number: " + getAccountNumber() + " on " + ld + " at "+ localtime + " hrs");
            logTransaction();

        }
        else if (value==1)
        {
            System.out.println("Amount of $" + amount + " withdrawn from Account number: " + getAccountNumber() + " on " + ld + " at "+ localtime + " hrs");
            logTransaction();
        }


    }

    public void deposit(String amount)
    {
        Double balance = Double.valueOf(getBalance());
        Double amount1 = Double.valueOf(amount);
        Double updatedBalance = balance+amount1;
        String newBalance = updatedBalance.toString();
        setBalance(newBalance);
    }


    public void withdrawal(String amount)
    {

        //String updatedBalance =null;
        Double oldBalance = Double.valueOf(getBalance());
        Double amountReq = Double.valueOf(amount);
        try
        {
            if (oldBalance<amountReq)
            {
                throw new InsufficientBalanceException("Insufficient Account Balance \n Transaction cancelled");
            }
            else
            {
                Double newBalance = oldBalance-amountReq;
                String updatedBalance = newBalance.toString();
                setBalance(updatedBalance);
                int i =1;
                getTransactionHistory(i,amount);




            }
        }
        catch (InsufficientBalanceException e)
        {
            e.printStackTrace();
        }
    }

    public void performTransaction()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the transaction you want to perform: \n 1. for deposit and \n 2. for withdrawal ");
        System.out.print("Enter here: ");
        int i = sc.nextInt();
        if (i==1)
        {
            System.out.print("Enter the amount you want to deposit: ");
            String depositAmount = sc.next();
            deposit(depositAmount);
            int j = 0;
            getTransactionHistory(j,depositAmount);
        }
        else if (i==2)
        {
            System.out.print("Enter the amount you want to withdraw: ");
            String withdrawAmount = sc.next();
            withdrawal(withdrawAmount);


        }
    }

}
