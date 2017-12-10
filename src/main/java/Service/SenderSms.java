package Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SenderSms {

	@Autowired
	SMSCSender sd;
	
	
	
	@Scheduled(cron="1 30 3 * * *")
	public void senderer() {

		String hourLeter = LocalDateTime.now().plusHours(1).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(String.format("Later: %s ", hourLeter));

//        sd.sendSms("380677256482", "Привет Юрий: " + hourLeter , 1, "", "", 0, "", "");
//        sd.getSmsCost("380677256482", "Вы успешно зарегистрированы!", 0, 0, "", "");
//        sd.getBalance();
      sd.sendSms("380503718360", "Привет: " + hourLeter , 1, "", "", 0, "", "");
      sd.getSmsCost("380503718360", "Test Heroku", 0, 0, "", "");
      sd.getBalance();

	}
}
