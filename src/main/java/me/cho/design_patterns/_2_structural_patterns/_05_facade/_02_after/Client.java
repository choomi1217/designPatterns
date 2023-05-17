package me.cho.design_patterns._2_structural_patterns._05_facade._02_after;

public class Client {
    public static void main(String[] args) {
        String from = "tom@tom.com";
        String to = "jerry@jerry.com";
        String subject = "subject";
        String text = "text";
        String host = "127.0.0.1";

        EmailMessage emailMessage = new EmailMessage(from,to,subject,text);
        EmailSettings emailSettings = new EmailSettings(host);
        EmailSender emailSender = new EmailSender(emailSettings);

        emailSender.sendEmail(emailMessage);
    }
}
