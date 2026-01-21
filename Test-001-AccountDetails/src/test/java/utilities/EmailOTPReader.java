package utilities;

	import java.util.Properties;
	import javax.mail.*;

	public class EmailOTPReader {

	    public static String getOTP(String email, String appPassword) throws Exception {

	        Properties props = new Properties();
	        props.put("mail.store.protocol", "imaps");

	        Session session = Session.getInstance(props);
	        Store store = session.getStore("imaps");
	        store.connect("imap.gmail.com", email, appPassword);

	        Folder inbox = store.getFolder("INBOX");
	        inbox.open(Folder.READ_ONLY);

	        // Read latest email
	        Message message = inbox.getMessage(inbox.getMessageCount());
	        Object content = message.getContent();

	        String body = content.toString();

	        // Extract 6-digit OTP
	        return body.replaceAll("\\D+", "").substring(0, 6);
	        
	        
	    }
	}