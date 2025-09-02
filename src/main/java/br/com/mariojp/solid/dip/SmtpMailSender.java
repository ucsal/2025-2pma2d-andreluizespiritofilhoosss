package br.com.mariojp.solid.dip;

public class SmtpMailSender implements MailSender {
    private final SmtpClient smtp;


    public SmtpMailSender() {
        this.smtp = new SmtpClient();
    }


    public SmtpMailSender(SmtpClient smtp) {
        this.smtp = smtp;
    }

    @Override
    public void send(String to, String subject, String body) {
        smtp.send(to, subject, body);
    }
}
