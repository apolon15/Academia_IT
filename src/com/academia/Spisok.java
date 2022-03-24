package com.academia;

import sun.awt.image.ImageWatched;

import java.util.*;

public class Spisok {
    public static void main(String[] args) {
        // System.out.println(task1());
        //System.out.println(task2());
        //  System.out.println(task3());
        //System.out.println(task4());
        // System.out.println(task5());
        //  System.out.println(task6());
        // System.out.println(task7());
       // task8();
       // task9();
    }

    public static LinkedList<Integer> task1() {
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

    public static LinkedList<String> task2() {
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

    public static ArrayList<Integer> task3() {
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

    public static LinkedList<Integer> task4() {
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

    public static LinkedList<Integer> task5() {
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

    public static LinkedList<Integer> task6() {
        LinkedList<Integer> l = new LinkedList<Integer>();
        int i = 0;
        while (i < 100) {
            l.add(0);
            i++;
        }
        System.out.println(l);

        l.set(0, 1);
        l.set(99, 1);
        return l;
    }

    public static LinkedList<Integer> task7() {
        LinkedList<Integer> l = new LinkedList<Integer>();
        int i = 0;
        l.add(0);
        while (i < 45) {
            l.add(l.get(i) + 2);
            i++;
        }
        return l;
    }

    public static void task8() {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<Integer>();
        int sum = 10;
        while (sum != 0) {
            l.add((int) (Math.random() * 21));
            sum--;
        }
        int mult = 1;
        System.out.println(l);
        System.out.println("Введи число");
        int numbr = sc.nextInt();
        if (l.contains(numbr))
            System.out.println(7145);
        else System.out.println(5147);
        for (int num : l) {
            sum += num;
            mult *= num;
        }
        System.out.println("Сумма ячеек = " + sum + "; произведение ячеек = " + mult);
    }


    public static void task9() {
        List<Integer> l = new ArrayList<>(10);
        int max = 0;
        int min = 20;
        int i = 0;
        int indmax = 0;
        int indmin = -1;
        while (i < 10) {
            l.add((int) (Math.random() * 21));
            i++;
        }
        System.out.println(l);
        for (i = 0; i < l.size(); i++) {
            if (max < l.get(i)) {
                indmax = i;
                max = l.get(i);
            }
            if (min > l.get(i)) {
                min = l.get(i);
                indmin = i;
            }
            if (i == l.size() - 1) {
                l.set(indmax, min);
                l.set(indmin, max);
            }
        }
        System.out.println(l);
        System.out.println("max = " + max + " min = " + min);
        List<Integer> copyL = l;
        System.out.print("Повторяемые числа ");
        Iterator<Integer> it = copyL.iterator();
        min = 0;
        while (it.hasNext()) {
            max = it.next();
            it.remove();
            if (l.contains(max)) {
// System.out.print(max+"; ");
                System.out.printf("%d; ", max);
                min++;
            }
        }
        if (min == 0) {
            System.out.print("отсутствуют");
        }
    }
}

