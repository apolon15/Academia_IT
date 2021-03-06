package com.academia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Users {
    private String login;
    private String pass;

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Users() throws IOException {
        this.login = bf.readLine();
        this.pass = bf.readLine();
    }

    public Users(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Пользователь: логин-" + login + " pass- " + '\'' + pass + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(login, users.login) && Objects.equals(pass, users.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, pass);
    }
}






