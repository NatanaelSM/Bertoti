package org.example;

import java.util.ArrayList;

public class MyDatabaseSingleton {

    private static MyDatabaseSingleton instance = null;
    private ArrayList<User> users = new ArrayList<>();

    private MyDatabaseSingleton(){};

    public static MyDatabaseSingleton getInstance(){
        if(instance == null){
            instance = new MyDatabaseSingleton();
        }
        return instance;
    };

    public void addUser(User user){
        this.users.add(user);
    }

    public void removeUser(User user){
        int cont = 0;
        for(User u : this.users){
            if(u == user){
                 this.users.remove(cont);
                 break;
            }
            cont++;
        }
    }

    public void showUsers(){
        for(User u: this.users){
            System.out.println(u.getNome());
        }
    }
}
