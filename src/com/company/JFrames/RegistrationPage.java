package com.company.JFrames;

import com.company.Methods.Client;
import com.company.Methods.DBManager;
import com.company.Entity.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPage extends JFrame {
    private JLabel regisLabel, userNameLabel, passLabel, repeatPassLabel, errorLabel,errPassLabel;
    private JTextField userNameTextField, passTextField, repeatPassTextField;
    private JButton registerButton, loginButton;

    public RegistrationPage(){
        setTitle("Registration");
        setBounds(400,150,800,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        regisLabel = new JLabel("Registration");
        regisLabel.setFont(new Font("Srift", Font.PLAIN, 25));
        regisLabel.setBounds(250, 20, 300, 60);
        add(regisLabel);

        userNameLabel = new JLabel("User Name");
        userNameLabel.setFont(new Font("Srift", Font.PLAIN, 15));
        userNameLabel.setBounds(100,100,100,20);
        add(userNameLabel);

        userNameTextField = new JTextField();
        userNameTextField.setBounds(260,100,250,20);
        add(userNameTextField);

        passLabel = new JLabel("Password");
        passLabel.setFont(new Font("Srift",Font.PLAIN,15));
        passLabel.setBounds(100,140,100,20);
        add(passLabel);

        passTextField = new JTextField();
        passTextField.setBounds(260,140,250,20);
        add(passTextField);

        repeatPassLabel = new JLabel("Repeat Password");
        repeatPassLabel.setFont(new Font("Srift",Font.PLAIN,15));
        repeatPassLabel.setBounds(100,180,150,20);
        add(repeatPassLabel);

        repeatPassTextField = new JTextField();
        repeatPassTextField.setBounds(260,180,250,20);
        add(repeatPassTextField);

        registerButton = new JButton("Register");
        registerButton.setBounds(340,400,120,30);
        add(registerButton);

        loginButton = new JButton("Login");
        loginButton.setBounds(210,400,120,30);
        add(loginButton);

        errorLabel = new JLabel("A user with such an handle already exists");
        errorLabel.setBounds(520,100,250,20);
        add(errorLabel);
        errorLabel.setVisible(false);

        errPassLabel = new JLabel("Password mismatch");
        errPassLabel.setBounds(520,180,150,20);
        add(errPassLabel);
        errPassLabel.setVisible(false);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!passTextField.getText().equals(repeatPassTextField.getText())){
                    errPassLabel.setVisible(true);
                    return;
                }
                errPassLabel.setVisible(false);

                if (Client.dbManager.registrationForm(userNameTextField.getText())){
                    Client.dbManager.useradd(new User(userNameTextField.getText(),1,"null","null","null"),passTextField.getText());

                    setVisible(false);
                    LoginPage loginPage = new LoginPage();
                    loginPage.setVisible(true);
                }
                else{
                    errorLabel.setVisible(true);
                }

            }

        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
            }
        });

    }
}
