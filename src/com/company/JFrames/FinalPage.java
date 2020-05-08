package com.company.JFrames;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

public class FinalPage extends JFrame {

    public FinalPage() {
        setTitle("Final Page");
        setBounds(400, 150, 1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTextArea textArea;
        JButton button, button1;


        textArea = new JTextArea();
        textArea.setBorder(new TitledBorder(new EtchedBorder(),""));
        textArea.setFont(new Font("Serif", Font.BOLD, 17));
        textArea.setEditable(false);
        textArea.setBounds(150,50,900,500);
        add(textArea);
        textArea.setBackground(Color.gray);



        button = new JButton("Create new team");
        button.setBounds(400,600,150,30);
        add(button);

        button1 = new JButton("Change the squad");
        button1.setBounds(600,600,150,30);
        add(button1);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                NurFrame nurFrame = new NurFrame();
                nurFrame.setVisible(true);

            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                SecondFrame secondFrame = new SecondFrame();
                secondFrame.setVisible(true);
            }
        });

        BufferedReader bufferedReader = null;
        String message = null;
        try{
            bufferedReader = new BufferedReader(new FileReader("Res.txt"));
            while ((message=bufferedReader.readLine())!=null){
                textArea.setText(message);

            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
