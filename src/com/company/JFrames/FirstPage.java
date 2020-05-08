package com.company.JFrames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JFrame {
    private JLabel labelWelcome, labelLets;
    private JButton buttonGo;
    private Image img;

    public FirstPage() {
        setTitle("Welcome to Premier League");
        setBounds(400, 150, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        labelWelcome = new JLabel("WELCOME TO PREMIER LEAGUE");
        labelWelcome.setFont(new Font("Srift", Font.PLAIN, 35));
        labelWelcome.setBounds(100, 50, 600, 60);
        add(labelWelcome);

        labelLets = new JLabel("Let's do your fantasy squad");
        labelLets.setFont(new Font("Srift", Font.PLAIN, 20));
        labelLets.setBounds(200,150,500,30);
        add(labelLets);

        buttonGo = new JButton(" GO! ");
        buttonGo.setBounds(500,400,100,20);
        add(buttonGo);

        setBackground(Color.WHITE);

        buttonGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

                RegistrationPage registrationPage = new RegistrationPage();
                registrationPage.setVisible(true);

            }
        });

    }
}
