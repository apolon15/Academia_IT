package com.priority;
import java.io.IOException;
import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityUsers<Person> {
    public static void main(String[] args) throws IOException {

        //task();

    }

    public void task() {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Person> pQ = new PriorityQueue<Person>(5);
          for (int i = 0; i <= pQ.size(); i++) {
     //       pQ.add(new Person("jh000hf",8));
            System.out.println(pQ);
        }
    }


}



