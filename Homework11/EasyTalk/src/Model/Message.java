package Model;

public class Message {
    private String text;
    private String sender;

    // Конструктор
    public Message(String sender, String content) {
        this.text = text;
        this.sender = sender;
    }

    // Геттеры и сеттеры для доступа к полям   
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}