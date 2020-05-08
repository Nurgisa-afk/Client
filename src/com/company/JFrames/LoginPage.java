package com.company.JFrames;

import com.company.Methods.Client;
import com.company.Methods.DBManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class LoginPage extends JFrame {
    private JLabel labelUserName, labelPassword;
    private JTextField textFieldUserName, textFieldPassword;
    private JButton buttonSignIn;


    public LoginPage(){
        setTitle("Login page");
        setBounds(400, 150, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        labelUserName = new JLabel("User Name");
        labelUserName.setFont(new Font("Srift", Font.PLAIN, 15));
        labelUserName.setBounds(275,50,150,20);
        add(labelUserName);

        textFieldUserName = new JTextField();
        textFieldUserName.setBounds(275,80,250,30);
        add(textFieldUserName);

        labelPassword = new JLabel("Password");
        labelPassword.setFont(new Font("Srift", Font.PLAIN, 15));
        labelPassword.setBounds(275,140,150,20);
        add(labelPassword);

        textFieldPassword = new JTextField();
        textFieldPassword.setBounds(275,170,250,30);
        add(textFieldPassword);

        buttonSignIn = new JButton("Sign in");
        buttonSignIn.setFont(new Font("Srift", Font.PLAIN, 12));
        buttonSignIn.setBounds(500,400,150,40);
        add(buttonSignIn);


        buttonSignIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Client.dbManager.checkLoginForm(textFieldUserName.getText(), textFieldPassword.getText())) {

                    BufferedWriter bufferedWriter = null;
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter("UserID.txt"));
                        bufferedWriter.write(textFieldUserName.getText());
                        bufferedWriter.flush();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }


                setVisible(false);

                NurFrame nurFrame = new NurFrame();
                nurFrame.setVisible(true);

            }
        }
        });

    }
}
