package Model;
import java.util.List;

public class Chat {
    private String chatName;
    private List<Message> messages;
    private List<Model> participants;

    // Конструктор
    public Chat(String chatName) {
        this.chatName = chatName;
        // Инициализация списков сообщений и участников чата
    }

    // Геттеры и сеттеры для доступа к полям

    // Методы для управления сообщениями
    public void addMessage(Message message) {
        messages.add(message);
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void setParticipants(List<Model> participants) {
        this.participants = participants;
    }

    public void removeMessage(Message message) {
        messages.remove(message);
    }

    public List<Message> getMessages() {
        return messages;
    }

    // Методы для управления участниками чата
    public void addParticipant(Model user) {
        participants.add(user);
    }

    public void removeParticipant(Model user) {
        participants.remove(user);
    }

    public List<Model> getParticipants() {
        return participants;
    }
}