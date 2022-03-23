package com.priority;

import com.academia.Users;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

import static java.lang.Integer.compare;

//, compare(Integer.parseInt(new Users(bf.readLine(), (bf.readLine())).getStatus()))),Integer.parseInt(new Users(bf.readLine(), (bf.readLine())).getStatus())))

 //public class PriorityUsers implements Comparator<User> {
//    public void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        Users u = new Users(bf.readLine(), bf.readLine());
//        Users u1 = new Users(bf.readLine(), bf.readLine());
//        PriorityQueue<Users> pQ = new PriorityQueue<Users>(5);
//        pQ.add(u);
//        pQ.add(u1);
//        pQ.comparator(u, u1);
//
//
//    }

//    @Override
//    public int comparator(User u, User u1) {
//        return u.getStatus() - u1.getStatus();
//    }
//
//}

class User {
    private String name;
    private int status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User() {

    }

    public User(String name, int status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Пользователь: логин-" + name + " status- " + '\'' + status + '\'';
    }


}

