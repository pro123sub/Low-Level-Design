import java.util.Date;

public class Notification
{
    private String notificationId;
    private User recipient;
    private String message;
    private Date timestamp;
    private boolean isRead;

    public Notification(String notificationId, User recipient, String message, Date timestamp, boolean isRead)
    {
        this.notificationId = notificationId;
        this.recipient = recipient;
        this.message = message;
        this.timestamp = timestamp;
        this.isRead = isRead;
    }

    public String getNotificationId()
    {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
    public void markAsRead() {
        this.isRead = true;
    }

    public void sendNotification() {
        // Logic to send notification to user
    }
}
