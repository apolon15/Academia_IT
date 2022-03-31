package com.priority;

import java.util.Date;
import java.util.Scanner;

 public class Person  {
    private String name;
    private int status;
    Date date;
Scanner sc= new Scanner(System.in);
    public Date getDate() {
        return date;
    }

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

    public Person() {
//        this.name=sc.next();
//        this.status=sc.nextInt();
//        this.date=new Date();
    }

    public Person(String name, int status) {
        this.name = sc.next();
        this.status = sc.nextInt();
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", date=" + date +
                '}';
    }


//    @Override
//    public int compareTo(Object p) {
//        if (this.getStatus() > (Person) p.getStatus()) {
//            return 1;
//        }
//        return 0;
//    }
}
