package august19_assignment_oops;

import java.io.Serializable;

public abstract class BankAccount implements TransactionLog, Serializable
{
    private String accountNumber;
    private String accountHolderName;
    private String balance;

    public BankAccount()
    {

    }
    BankAccount(String accountNumber,String accountHolderName, String balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }


    public final static String generateAccountNumber(String accountNumber)
    {
       int accNo1 = Integer.valueOf(accountNumber);
       int accNo2 = accNo1+1;
       String newAccNo = Integer.valueOf(accNo2).toString();
       return newAccNo;
    }

    public void performTransaction()
    {
        System.out.println("Balance updated");
    }

}
