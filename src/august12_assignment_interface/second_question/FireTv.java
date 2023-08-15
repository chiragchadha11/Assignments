package august12_assignment_interface.second_question;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FireTv implements NotificationSender, PushNotification
{
    private String deviceId;
    LocalDate ld = LocalDate.now();

    LocalTime lt = LocalTime.now();

    String localTime = lt.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    @Override
    public void sendNotification()
    {
                System.out.println("Notification sent to Amazon FireTv with device ID: " + deviceId + " on: " + ld + " at: " + localTime + " hrs");

    }

    @Override
    public void setDevice(String deviceId)
    {
        this.deviceId = deviceId;
        notificationSent();
    }

    @Override
    public void notificationSent()
    {
        sendNotification();
    }
}
