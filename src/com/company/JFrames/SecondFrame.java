package com.company.JFrames;

import com.company.Methods.Client;
import com.company.Methods.DBManager;
import com.company.Entity.Player;
import com.company.Entity.Userforbudget;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class SecondFrame extends JFrame {
    Userforbudget userforbudget = new Userforbudget();
    private JButton buttonAddGoal,buttonAddGoal2;
    private JButton buttonAddDef1,buttonAddDef2,buttonAddDef3,buttonAddDef4,buttonAddDef5;
    private JButton buttonAddMid1,buttonAddMid2,buttonAddMid3,buttonAddMid4,buttonAddMid5;
    private JButton buttonAddFor1,buttonAddFor2,buttonAddFor3;
    private JLabel labelData;
    private JLabel labelAddGoal,labelAddGoal2,labelAddDef1,labelAddDef2,labelAddDef3,labelAddDef4,labelAddDef5,
            labelAddMid1,labelAddMid2,labelAddMid3,labelAddMid4,labelAddMid5,labelAddFor1,labelAddFor2,labelAddFor3;
    private JLabel labelWriteNum;
    private JTextField textFieldWriteNum;
    private JButton buttonWriteNum;
    private JTextArea textAreaData;
    private JLabel labelMoney;
    private JLabel labelResults;
    private JButton buttonSubmit, buttonNext;


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



    public SecondFrame(){
        forInformation();
        setTitle("Let's do your fantasy squad");
        setBounds(200, 150, 1650, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        ArrayList<Player> existsPlayers = new ArrayList<>();

        textAreaData = new JTextArea();
        textAreaData.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
        textAreaData.setEditable(false);
        textAreaData.setBounds(1050,80,500,650);
        add(textAreaData);

        labelWriteNum = new JLabel("Write number");
        labelWriteNum.setBounds(1050,50,100,20);
        add(labelWriteNum);

        textFieldWriteNum = new JTextField();
        textFieldWriteNum.setBounds(1160,50,200,20);
        add(textFieldWriteNum);

        buttonWriteNum = new JButton("Add");
        buttonWriteNum.setBounds(1370,50,100,20);
        add(buttonWriteNum);


        labelData = new JLabel(userforbudget.getName()+"    "+userforbudget.getClubName());
        labelData.setBounds(50,20,1000,20);
        add(labelData);


        buttonAddGoal = new JButton("Add goalkeeper");
        buttonAddGoal.setBounds(300,50,150,30);
        add(buttonAddGoal);

        labelAddGoal = new JLabel();
        labelAddGoal.setBounds(300,10,150,30);
        add(labelAddGoal);


        buttonAddGoal2 = new JButton("Add goalkeeper");
        buttonAddGoal2.setBounds(550,50,150,30);
        add(buttonAddGoal2);

        labelAddGoal2 = new JLabel();
        labelAddGoal2.setBounds(550,10,150,30);
        add(labelAddGoal2);


        buttonAddDef1 = new JButton("Add defender");
        buttonAddDef1.setBounds(50,200,150,30);
        add(buttonAddDef1);

        labelAddDef1 = new JLabel();
        labelAddDef1.setBounds(50,160,150,30);
        add(labelAddDef1);


        buttonAddDef2 = new JButton("Add defender");
        buttonAddDef2.setBounds(250,200,150,30);
        add(buttonAddDef2);

        labelAddDef2 = new JLabel();
        labelAddDef2.setBounds(250,160,150,30);
        add(labelAddDef2);


        buttonAddDef3 = new JButton("Add defender");
        buttonAddDef3.setBounds(450,200,150,30);
        add(buttonAddDef3);

        labelAddDef3 = new JLabel();
        labelAddDef3.setBounds(450,160,150,30);
        add(labelAddDef3);


        buttonAddDef4 = new JButton("Add defender");
        buttonAddDef4.setBounds(650,200,150,30);
        add(buttonAddDef4);

        labelAddDef4 = new JLabel();
        labelAddDef4.setBounds(650,160,150,30);
        add(labelAddDef4);


        buttonAddDef5 = new JButton("Add defender");
        buttonAddDef5.setBounds(850,200,150,30);
        add(buttonAddDef5);

        labelAddDef5 = new JLabel();
        labelAddDef5.setBounds(850,160,150,30);
        add(labelAddDef5);



        buttonAddMid1 = new JButton("Add midfielder");
        buttonAddMid1.setBounds(50,350,150,30);
        add(buttonAddMid1);

        labelAddMid1 = new JLabel();
        labelAddMid1.setBounds(50,310,150,30);
        add(labelAddMid1);


        buttonAddMid2 = new JButton("Add midfielder");
        buttonAddMid2.setBounds(250,350,150,30);
        add(buttonAddMid2);

        labelAddMid2 = new JLabel();
        labelAddMid2.setBounds(250,310,150,30);
        add(labelAddMid2);


        buttonAddMid3 = new JButton("Add midfielder");
        buttonAddMid3.setBounds(450,350,150,30);
        add(buttonAddMid3);

        labelAddMid3 = new JLabel();
        labelAddMid3.setBounds(450,310,150,30);
        add(labelAddMid3);


        buttonAddMid4 = new JButton("Add midfielder");
        buttonAddMid4.setBounds(650,350,150,30);
        add(buttonAddMid4);

        labelAddMid4 = new JLabel();
        labelAddMid4.setBounds(650,310,150,30);
        add(labelAddMid4);


        buttonAddMid5 = new JButton("Add midfielder");
        buttonAddMid5.setBounds(850,350,150,30);
        add(buttonAddMid5);

        labelAddMid5 = new JLabel();
        labelAddMid5.setBounds(850,310,150,30);
        add(labelAddMid5);



        buttonAddFor1 = new JButton("Add forward");
        buttonAddFor1.setBounds(150,500,150,30);
        add(buttonAddFor1);

        labelAddFor1 = new JLabel();
        labelAddFor1.setBounds(150,460,150,30);
        add(labelAddFor1);


        buttonAddFor2 = new JButton("Add forward");
        buttonAddFor2.setBounds(400,500,150,30);
        add(buttonAddFor2);

        labelAddFor2 = new JLabel();
        labelAddFor2.setBounds(400,460,150,30);
        add(labelAddFor2);


        buttonAddFor3 = new JButton("Add forward");
        buttonAddFor3.setBounds(650,500,150,30);
        add(buttonAddFor3);

        labelAddFor3 = new JLabel();
        labelAddFor3.setBounds(650,460,150,30);
        add(labelAddFor3);


        labelMoney = new JLabel("money " + userforbudget.getBudget());
        labelMoney.setBounds(50,60,250,30);
        add(labelMoney);


        labelResults = new JLabel("results");
        labelResults.setBounds(50,110,250,30);
        add(labelResults);


        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(450,650,150,30);
        add(buttonSubmit);


        buttonNext = new JButton("NEXT!");
        buttonNext.setBounds(650,650,150,30);
        add(buttonNext);
        buttonNext.setVisible(false);



        buttonAddGoal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Goalkeeper");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                    for(Player i : players){
                        s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                        t++;

                }
                    textAreaData.setText("");
                    textAreaData.setText(s);

                    buttonWriteNum.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                    parseInt(textFieldWriteNum.getText()) <= 0){
                                return;
                            }
                            for(int i = 0; i < existsPlayers.size(); i++){
                                if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                                else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                                existsPlayers.remove(i);
                                i = 0;
                            }

                            existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddGoal.setText("");
                        textFieldWriteNum.setText("");
                        labelAddGoal.setText(player1.getFullName());

                        }
                    });
            }

        });


        buttonAddGoal2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Goalkeeper");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddGoal2.setText("");
                        textFieldWriteNum.setText("");
                        labelAddGoal2.setText(player1.getFullName());

                    }
                });
            }

        });

        buttonAddDef1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Defender");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddDef1.setText("");
                        textFieldWriteNum.setText("");
                        labelAddDef1.setText(player1.getFullName());

                    }
                });
            }

        });

        buttonAddDef2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Defender");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddDef2.setText("");
                        textFieldWriteNum.setText("");
                        labelAddDef2.setText(player1.getFullName());

                    }
                });
            }

        });


        buttonAddDef3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Defender");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddDef3.setText("");
                        textFieldWriteNum.setText("");
                        labelAddDef3.setText(player1.getFullName());

                    }
                });
            }

        });


        buttonAddDef4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Defender");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddDef4.setText("");
                        textFieldWriteNum.setText("");
                        labelAddDef4.setText(player1.getFullName());

                    }
                });
            }

        });


        buttonAddDef5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Defender");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddDef5.setText("");
                        textFieldWriteNum.setText("");
                        labelAddDef5.setText(player1.getFullName());

                    }
                });
            }

        });


        buttonAddMid1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Midfielder");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddMid1.setText("");
                        textFieldWriteNum.setText("");
                        labelAddMid1.setText(player1.getFullName());

                    }
                });
            }

        });



        buttonAddMid2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Midfielder");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddMid2.setText("");
                        textFieldWriteNum.setText("");
                        labelAddMid2.setText(player1.getFullName());

                    }
                });
            }

        });



        buttonAddMid3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Midfielder");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddMid3.setText("");
                        textFieldWriteNum.setText("");
                        labelAddMid3.setText(player1.getFullName());

                    }
                });
            }

        });



        buttonAddMid4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Midfielder");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddMid4.setText("");
                        textFieldWriteNum.setText("");
                        labelAddMid4.setText(player1.getFullName());

                    }
                });
            }

        });



        buttonAddMid5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Midfielder");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddMid5.setText("");
                        textFieldWriteNum.setText("");
                        labelAddMid5.setText(player1.getFullName());

                    }
                });
            }

        });



        buttonAddFor1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Forward");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddFor1.setText("");
                        textFieldWriteNum.setText("");
                        labelAddFor1.setText(player1.getFullName());

                    }
                });
            }

        });



        buttonAddFor2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Forward");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }
                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddFor2.setText("");
                        textFieldWriteNum.setText("");
                        labelAddFor2.setText(player1.getFullName());

                    }
                });
            }

        });




        buttonAddFor3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Player> players = Client.dbManager.getPlayer("Forward");
                for (int i = 0; i <players.size(); i++) {
                    for (int j = 0; j <existsPlayers.size(); j++) {
                        if(players.get(i).getFullName().equals(existsPlayers.get(j).getFullName())) {
                            players.remove(i);
                            i=0;
                        }
                    }
                }
                String s = "";
                int t = 1;
                for(Player i : players){
                    s+= t + ". name: " + i.getFullName() + ", price: " + i.getPrice() + ", total point: " + i.getPoint()+"\n";
                    t++;

                }
                textAreaData.setText("");
                textAreaData.setText(s);

                buttonWriteNum.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(textFieldWriteNum.getText().length()==0 ||  parseInt(textFieldWriteNum.getText())>players.size() ||
                                parseInt(textFieldWriteNum.getText()) <= 0){
                            return;
                        }
                        for(int i = 0; i < existsPlayers.size(); i++){
                            if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                            else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                            existsPlayers.remove(i);
                            i = 0;
                        }

                        existsPlayers.add(players.get(parseInt(textFieldWriteNum.getText())-1));
                        Player player1 = players.get(parseInt(textFieldWriteNum.getText())-1);
                        labelAddFor3.setText("");
                        textFieldWriteNum.setText("");
                        labelAddFor3.setText(player1.getFullName());

                    }
                });
            }

        });


        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double t = 0;
                double k = 0;

                for (int i = 0; i <existsPlayers.size() ; i++) {
                    t+=existsPlayers.get(i).getPoint();
                    k+=existsPlayers.get(i).getPrice();

                }
                for(int i = 0; i < existsPlayers.size(); i++){
                    if(existsPlayers.get(i).getFullName().equals(labelAddGoal.getText())) continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddGoal2.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddDef1.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddDef2.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddDef3.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddDef4.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddDef5.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddMid1.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddMid2.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddMid3.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddMid4.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddMid5.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddFor1.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddFor2.getText()))continue;
                    else if(existsPlayers.get(i).getFullName().equals(labelAddFor3.getText()))continue;
                    existsPlayers.remove(i);
                    i = 0;
                }
                labelResults.setText("");
                labelResults.setText("Total point: "+ t + ",    total price: " + Math.round(k));
                if(k>userforbudget.getBudget()){
                    labelMoney.setText("");
                    labelMoney.setText("money: "+userforbudget.getBudget()+" Insufficient funds!" );
                    return;
                }

                buttonNext.setVisible(true);


                double finalK = Math.round(k);
                buttonNext.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        BufferedWriter bufferedWriter = null;
                        try{
                            bufferedWriter = new BufferedWriter(new FileWriter("Res.txt"));
                            bufferedWriter.write(userforbudget.getName()+", club name: "+userforbudget.getClubName()+", total points: "+ finalK);
                            bufferedWriter.flush();
                            bufferedWriter.close();
                        }catch (Exception e1){
                            e1.printStackTrace();
                        }
                        setVisible(false);
                        FinalPage finalPage = new FinalPage();
                        finalPage.setVisible(true);
                    }
                });



            }
        });











    }
}
