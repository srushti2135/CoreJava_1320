package AbstractAndInterface;

public class NotificationMain {
	
	public static void main(String args[]) {
		
		Notification n=new EmailNotification();
		n.sendMessage();
		Notification n1=new SMSNotification();
		n1.sendMessage();
		Notification n2=new WhatsAppNotification();
		n2.sendMessage();
		
	}

}
