package me.cho.design_patterns._2_structural_patterns._05_facade._01_before;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Client {

    public static void main(String[] args) {
        String to = "tom@tom.com";
        String from = "jerry@jerry.com";
        String host = "127.0.0.1";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setSubject("Test Mail");
            message.setText("Test Text");

            Transport.send(message);
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }

}
