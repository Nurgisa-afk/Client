package com.company.JFrames;

import com.company.Methods.Client;
import com.company.Methods.DBManager;
import com.company.Entity.User;
import com.company.Entity.Userforbudget;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class NurFrame extends JFrame {
    private Userforbudget userforbudget = new Userforbudget();
    private JLabel labelName, labelId, labelClubName;
    private JTextField textFieldName, textFieldId, textFieldClubName;
    private JButton buttonAdd, buttonNext;
    private JTextArea textAreaUsers;
    private JComboBox comboBoxCountry, comboBoxCity;

    public void forInformation(){
        BufferedReader bufferedReader = null;
        String s = "";
        try {
            bufferedReader = new BufferedReader(new FileReader("UserID.txt"));
            s = bufferedReader.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        userforbudget = Client.dbManager.getOneUser(s);
    }

    private ArrayList<User> users = new ArrayList<>();
    public NurFrame(){
        forInformation();

        setTitle("Welcome to Premier League");
        setBounds(400, 150, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        labelName = new JLabel("User name: ");
        labelName.setBounds(160,50,70,20);
        add(labelName);

        textFieldName = new JTextField();
        textFieldName.setText(userforbudget.getName());
        textFieldName.setEditable(false);
        textFieldName.setBounds(240,50,200,20);
        add(textFieldName);

        labelId = new JLabel("User id: ");
        labelId.setBounds(160,80,70,20);
        add(labelId);

        textFieldId = new JTextField();
        textFieldId.setText(userforbudget.getId()+"");
        textFieldId.setEditable(false);
        textFieldId.setBounds(240,80,200,20);
        add(textFieldId);

        labelClubName = new JLabel("Club name: ");
        labelClubName.setBounds(160,110,70,20);
        add(labelClubName);

        textFieldClubName = new JTextField();
        textFieldClubName.setText(userforbudget.getClubName());
        textFieldClubName.setBounds(240,110,200,20);
        add(textFieldClubName);

        buttonAdd = new JButton("Update");
        buttonAdd.setBounds(240,170,120,20);
        add(buttonAdd);

        textAreaUsers = new JTextArea();
        textAreaUsers.setBounds(160,200,500,300);
        add(textAreaUsers);

        buttonNext = new JButton("Next");
        buttonNext.setBounds(240,520,120,20);
        add(buttonNext);

        String[] country = {"Kazakhstan","Russia","China","Kyrgyzstan","Uzbekistan"};
        comboBoxCountry = new JComboBox(new DefaultComboBoxModel(country));
        comboBoxCountry.setBounds(160, 140, 150, 20);
        add(comboBoxCountry);

        comboBoxCity = new JComboBox();
        comboBoxCity.setBounds(330,140,150,20);
        add(comboBoxCity);

        comboBoxCountry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  selected = (String) comboBoxCountry.getSelectedItem();

                if(selected.equals("Kazakhstan")){
                    String[] kz = {"Nur-Sultan", "Almaty", "Shymkent", "Aktau", "Aktobe", "Karagandy", "Taraz"};
                    comboBoxCity.setModel(new DefaultComboBoxModel(kz));
                }
                else if(selected.equals("Russia")){
                    String[]rus = {"Moscow", "Saint Petersburg", "Novosibirsk", "Yekaterinburg", "Samara", "Krasnodar"};
                    comboBoxCity.setModel(new DefaultComboBoxModel(rus));
                }
                else if(selected.equals("China")){
                    String[]china = {"Shanghai","Beijing","Chongqing","Tianjin","Guangzhou","Wuhan"};
                    comboBoxCity.setModel(new DefaultComboBoxModel(china));
                }
                else if(selected.equals("Kyrgyzstan")){
                    String[]kyr = {"Bishkek","Osh","Jalal-Abad","Karakol","Tokmok"};
                    comboBoxCity.setModel(new DefaultComboBoxModel(kyr));
                }
                else if(selected.equals("Uzbekistan")){
                    String[]uzb = {"Tashkent","Samarkand","Namangan","Andijan","Bukhara"};
                    comboBoxCity.setModel(new DefaultComboBoxModel(uzb));
                }
            }
        });


        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textFieldName.getText();
                int id = Integer.parseInt(textFieldId.getText());
                String clubName = textFieldClubName.getText();
                String country = comboBoxCountry.getSelectedItem().toString();
                String city = comboBoxCity.getSelectedItem().toString();
                textFieldName.setText("");
                textFieldId.setText("");
                textFieldClubName.setText("");
                Client.dbManager.userUpdate(new User(userforbudget.getName(),userforbudget.getId(),clubName,country,city));

                users.add(new User(name,id,clubName,country,city));
                textAreaUsers.append("User id and name: "+id+", "+name+", from: "+country+", "+city+", club name: "+clubName);

            }
        });

        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

                SecondFrame openSecond = new SecondFrame();
                openSecond.setVisible(true);

            }
        });

    }
    }
