package mail;

public class Email {

    private final String address;
    private final String subject;
    private final String content;
    private boolean sent;

    public Email(String address, String subject, String content) {
        this.address = address;
        this.subject = subject;
        this.content = content;
        sent = false;
    }

    public String getAddress() {
        return address;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}
