package com.company.Methods;

import com.company.JFrames.FirstPage;

import java.net.Socket;

public class Client {
    public static Socket socket;
    public static DBManagerInterface dbManager;

    public static void main(String[] args) {
        try{
            socket = new Socket("127.0.0.1", 2000);
            dbManager = new DBManager();

            FirstPage firstPage = new FirstPage();
            firstPage.setVisible(true);

        }catch (Exception e){
            System.out.println("Client disconnected");
        }
    }
}
