package com.example.pr2_spring_user_model.models;

public class User {
    private String account;
    private String password;
    private String name;
    private String email;
    private int age;

    public User(){}

    public User(String john, String number, String john1, String mail, int i) {
        this.account = john;
        this.password = number;
        this.name = john1;
        this.email = mail;
        this.age = i;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
