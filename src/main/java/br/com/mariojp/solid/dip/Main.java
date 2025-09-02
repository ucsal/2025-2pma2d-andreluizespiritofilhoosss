package br.com.mariojp.solid.dip;

public class Main {
    public static void main(String[] args) {
        User user = new User("Andre", "andre@email.com");

        MailSender sender;
        if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
            sender = new NoopMailSender();
        } else {
            sender = new SmtpMailSender(new SmtpClient());
        }

        EmailNotifier notifier = new EmailNotifier(sender);
        notifier.welcome(user);
    }
}
