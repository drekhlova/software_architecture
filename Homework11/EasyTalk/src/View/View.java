package View;

import java.util.List;

import Model.Chat;
import Model.Message;
import Model.User;

public interface View {
    // Отображение формы регистрации нового пользователя
    void showRegistrationForm();
    
    // Отображение формы входа
    void showLoginForm();
    
    // Отображение списка чатов
    void showChatList(List<Chat> chats);
    
    // Отображение списка контактов
    void showContactList(List<User> contacts);
    
    // Отображение содержимого конкретного чата
    void showChat(Chat chat);
    
    // Отображение профиля пользователя
    void showUserProfile(User user);
    
    // Отображение экрана настроек
    void showSettings();
    
    // Отображение сообщений в чате
    void showMessages(List<Message> messages);
    
    // Отображение ошибки (например, неправильные учетные данные)
    void showError(String message);
    
}
