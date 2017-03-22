package net.tutorial.utilities;

import java.util.Map;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioService {
	private String twilioNumber = ""; 
	
	public TwilioService() {
		twilioNumber = System.getenv("TWILIO_NUMBER");
		EnvVariables env = new EnvVariables();
		Map<String, String> creds = env.getCredentials("user-provided");
		Twilio.init(creds.get("accountSID"), creds.get("authToken"));
	}

	public String sendMessage(String msg, String recipient) {
		Message message = Message.creator(new PhoneNumber("+" + recipient), new PhoneNumber(twilioNumber), msg).create();
		return message.getSid();
	}

}
