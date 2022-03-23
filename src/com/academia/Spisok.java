package com.academia;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Spisok {
    public static void main(String[] args) {
        // System.out.println(set200());
        //System.out.println(llString());
        //  System.out.println(doubleNum());
        //System.out.println(del20());
        System.out.println( reverseList());
    }

    public static LinkedList<Integer> set200() {
        LinkedList<Integer> l = new LinkedList<Integer>();
        int i = 0;
        while (i < 10) {
            l.add(((int) (Math.random() * (30 - 15) + 15)));
            i++;
        }
        System.out.println(l);
        if (l.contains(20)) {
            l.set(l.indexOf(20), 200);
        }
        return l;
    }

    public static LinkedList<String> llString() {
        LinkedList<String> l = new LinkedList<String>();
        int i = 0;
        while (i < 10) {
            if ((int) (Math.random() * 2) == 1) {
                l.add((char) (Math.random() * 100) + "");
                i++;
            } else {
                l.add("");
                i++;
            }
        }
        System.out.println(l);
        while (l.contains("")) {
            l.remove("");
        }
        return l;
    }

    public static ArrayList<Integer> doubleNum() {
        ArrayList<Integer> arrList = new ArrayList<>(10);
        int i = 0;
        while (i < 10) {
            arrList.add((int) (Math.random() * 30));
            i++;
        }
        System.out.println(arrList);
        for (i = 0; i < arrList.size(); i++) {
            arrList.set(i, (int) Math.pow(arrList.get(i), 2));
        }
        return arrList;
    }

    public static LinkedList<Integer> del20() {
        LinkedList<Integer> l = new LinkedList<Integer>();
        int i = 0;
        while (i < 10) {
            l.add(((int) (Math.random() * (30 - 15) + 15)));
            i++;
        }
        System.out.println(l);
        while (l.contains(20)) {
            for (i = 0; i < l.size(); i++) {
                if (l.get(i) == 20) {
                    l.remove(i);
                }
            }
        }
        return l;
    }

    public static LinkedList<Integer> reverseList() {
        LinkedList<Integer> l = new LinkedList<Integer>();
        int i = 0;
        while (i < 10) {
            l.add(((int) (Math.random() * (30 - 15) + 15)));
            i++;
        }
        System.out.println(l);
        Collections.reverse(l);
        return l;
    }


}

