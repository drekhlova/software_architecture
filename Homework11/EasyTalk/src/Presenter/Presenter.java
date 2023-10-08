package Presenter;

import javax.swing.text.View;

import Model.Chat;
import Model.Model;
import Model.User;

public class Presenter {
    private Model model;
    private View view;
    
    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    
    public void startApp() {
        // Логика начального экрана приложения
    }
    
    public void registerUser(String username, String phoneNumber, String password) {
        // Логика регистрации нового пользователя
    }
    
    public void loginUser(String phoneNumber, String password) {
        // Логика входа пользователя
    }
    
    public void openChat(Chat chat) {
        // Логика открытия чата
    }
    
    public void createChat(User contact) {
        // Логика создания нового чата
    }
    
    public void editUserProfile(String newUsername, String description) {
        // Логика редактирования профиля пользователя
    }

}