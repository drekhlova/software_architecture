package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Model.Model;

public class Authentication extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public Authentication() {
        setTitle("Authentication");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Sign up");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Создание объекта класса для проверки данных аутентификации
                Model messengerModel = new Model();

                // Вызов метода проверки данных аутентификации
                if (messengerModel.checkCredentials(username, password)) {
                    openMessengerPage();
                } else {
                    JOptionPane.showMessageDialog(null, " Invalid username or password");
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegistrationPage();
            }
        });

        add(panel);
        pack();
        setVisible(true);
    }

    private void openRegistrationPage() {
        // Закрыть текущее окно аутентификации и открыть окно регистрации
        dispose();
        Registration registrationView = new Registration();
        registrationView.setVisible(true);
    }

    private void openMessengerPage() {
        // Закрыть текущее окно аутентификации и открыть страницу мессенджера
        dispose();
        View messengerView = new View();
        messengerView.setVisible(true);
    }

}