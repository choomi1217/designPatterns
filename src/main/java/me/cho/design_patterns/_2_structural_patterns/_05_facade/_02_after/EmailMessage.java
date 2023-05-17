package me.cho.design_patterns._2_structural_patterns._05_facade._02_after;

public class EmailMessage {

    private String from;
    private String to;
    private String subject;
    private String text;

    public EmailMessage(String from, String to, String subject, String text) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }
}
