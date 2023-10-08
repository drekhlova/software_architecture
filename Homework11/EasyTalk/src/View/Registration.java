package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import Model.Model;

public class Registration extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public Registration() {
        setTitle("Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JButton registerButton = new JButton("Sign up");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(registerButton, BorderLayout.EAST);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Создание объекта класса для сохранения данных
                Model messengerModel = new Model();

                // Вызов метода сохранения данных
                messengerModel.registerUser(username, password);

                openAuthenticationPage();
            }
        });

        add(panel);
        pack();
        setVisible(true);
    }

    private void openAuthenticationPage() {
        // Закрыть текущее окно регистрации и открыть окно аутентификации
        dispose();
        Authentication authenticationView = new Authentication();
        authenticationView.setVisible(true);
    }

}