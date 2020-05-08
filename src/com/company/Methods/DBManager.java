package com.company.Methods;

import com.company.Entity.Player;
import com.company.Entity.Request;
import com.company.Entity.User;
import com.company.Entity.Userforbudget;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.*;
import java.util.ArrayList;

public class DBManager implements DBManagerInterface{

    private Connection connection;
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;

    public DBManager() {
        try {
            this.outputStream = new ObjectOutputStream(Client.socket.getOutputStream());
            this.inputStream = new ObjectInputStream(Client.socket.getInputStream());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean registrationForm(String user_name) {
        try {
            Request request = new Request("registrationForm", user_name, null, null);
            outputStream.writeObject(request);
            return (boolean) inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public void useradd(User user, String password) {
        try {
            Request request = new Request("useradd", password, null, user);
            outputStream.writeObject(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void userUpdate(User user){
        try {
            Request request = new Request("userUpdate", null, null, user);
            outputStream.writeObject(request);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean checkLoginForm(String user_name, String password) {
        try {
            Request request = new Request("checkLoginForm", user_name, password, null);
            outputStream.writeObject(request);
            return (boolean) inputStream.readObject();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public Userforbudget getOneUser(String name){
        try{
            Request request = new Request("getOneUser", name, null, null);
            outputStream.writeObject(request);
            return (Userforbudget) inputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<Player> getPlayer(String positions){
        try {
            Request request = new Request("getPlayer", positions, null, null);
            outputStream.writeObject(request);
            return (ArrayList<Player>) inputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
