package org.example;

public class Main {
    public static void main(String[] args) {

        MyDatabaseSingleton db = MyDatabaseSingleton.getInstance();

        User usuario1 = new User("Maria", 20);
        User usuario2 = new User("João", 12);
        User usuario3 = new User("José", 50);
        User usuario4 = new User("Marilene", 40);

        db.addUser(usuario1);
        db.addUser(usuario2);
        db.addUser(usuario3);
        db.addUser(usuario4);

        db.showUsers();

        System.out.println("-------------------");

        db.removeUser(usuario3);

        db.showUsers();
    }
}
