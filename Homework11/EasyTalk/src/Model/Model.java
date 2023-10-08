package Model;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private String username;
    private String phoneNumber;
    private String password;
    private List<Chat> chats;
    private List<User> contacts;
    // Другие данные о пользователе, чатах и контактах

    // Конструктор
    public Model(String username, String phoneNumber, String password) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.chats = new ArrayList<>();
        this.contacts = new ArrayList<>();
        // Инициализация списков чатов и контактов
    }

    // Геттеры и сеттеры для доступа к полям
    // Методы для управления чатами
    public void addChat(Chat chat) {
        chats.add(chat);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

    public List<User> getContacts() {
        return contacts;
    }

    public void setContacts(List<User> contacts) {
        this.contacts = contacts;
    }

    public void removeChat(Chat chat) {
        chats.remove(chat);
    }

    public List<Chat> getChats() {
        return chats;
    }
}