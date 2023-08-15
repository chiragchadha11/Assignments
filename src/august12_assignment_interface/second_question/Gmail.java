package august12_assignment_interface.second_question;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Gmail implements NotificationSender,EmailNotification
{

    String email;

    LocalDate ld = LocalDate.now();
    LocalTime lt = LocalTime.now();
    String localTime = lt.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    @Override
    public void setRecipient(String email)
    {
        this.email = email;
        notificationSent();
    }

    @Override
    public void notificationSent()
    {
        sendNotification();

    }

    @Override
    public void sendNotification()
    {
        System.out.println("Notification sent to email id: " + email + " on: " + ld + " at: " + localTime + " hrs");

    }
}
