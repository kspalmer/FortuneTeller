package imageSupport;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Utility class for sending emails
 * @author Alex Fortier
 *
 */
public class SendEmail {

	/**
	 * Function to actually create the email and send it using a GMail account
	 * Must change username and password to desired to work
	 * @param text body of the message you'd like to send
	 * @return true if message was sent successfully
	 */
	public static boolean send(String text) {
		
		final String username = "acfortier@gmail.com";
		final String password = "password";
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("feedback@fortunetellerapp.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("afortier@bu.edu"));
			message.setSubject("Feedback for FortuneTeller");
			message.setText(text);

			Transport.send(message);

			return true;
			
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}
}
