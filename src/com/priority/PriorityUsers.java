package com.priority;
import java.io.IOException;
import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityUsers implements Comparator<Person>, PriorityUsers1 {
    public static void main(String[] args) throws IOException {
        task();
    }

    public static void task() {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Person> pQ = new PriorityQueue<Person>(5);
          for (int i = 0; i <= pQ.size(); i++) {
            pQ.add(new Person());
            System.out.println(pQ);
        }
    }



    @Override
    public int compare(Person p1, Person p2) {
//        if (o1.getStatus() < (o2.getStatus())) {
//            return -1;
//        }
//        if (o1.getStatus() > o2.getStatus()) {
//            return 1;
//        }return 0;
        Integer status1=p1.getStatus();
        Integer status2=p2.getStatus();
        return status1.compareTo(status2);
    }

    @Override
    public int compareTo(Person person) {
        if (person.getStatus() < (person.getStatus())) {
            return -1;
        }
        if (person.getStatus() > person.getStatus()) {
            return 1;
        }
        return 0;
    }
}

class Person extends PriorityUsers {

    private Date date;
    private String name;
    private int status;

    Scanner sc = new Scanner(System.in);

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
        this.date = new Date();
        this.name = sc.next();
        this.status = sc.nextInt();

    }



//    public Person(String name, int status) {
//        this.date = date;
//        this.name = sc.next();
//        this.status = sc.nextInt();
//
//
//    }

    @Override
    public String toString() {
        return "Person{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}

