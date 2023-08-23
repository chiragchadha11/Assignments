package august19_assignment_oops;

public class InsufficientBalanceException extends RuntimeException
{
    InsufficientBalanceException(String message)
    {
        super(message);
    }
}
