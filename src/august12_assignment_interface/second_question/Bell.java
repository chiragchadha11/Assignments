package august12_assignment_interface.second_question;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Bell implements NotificationSender,SMSNotification
{
    String phoneNo;

    LocalDate ld = LocalDate.now();
    LocalTime lt = LocalTime.now();
    String localTime = lt.format(DateTimeFormatter.ofPattern("HH:mm:ss"));


    @Override
    public void sendNotification()
    {
        System.out.println("Notification sent to Phone No: " + phoneNo + " on: " + ld + " at: " + localTime + " hrs");
    }


    @Override
    public String setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
        notificationSent();
        return phoneNo;
    }

    @Override
    public void notificationSent()
    {
        sendNotification();
    }
}
