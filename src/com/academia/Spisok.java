package com.academia;

import java.util.*;

public class Spisok {
    public static void main(String[] args) {
        // System.out.println(task1());
        //System.out.println(task2());
        //  System.out.println(task3());
        //System.out.println(task4());
        // System.out.println(task5());
        //  System.out.println(task6());
        System.out.println(task7());
        // task8();
        // task9();
    }

    /*
    Задача 1
    Дан список некоторых целых чисел, найдите значение 20 в нем и, если оно присутствует, замените его на 200. Обновите список только при первом вхождении числа 20.

     */
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

    /*
    Задача 2
    Необходимо удалить пустые строки из списка строк.

     */
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

    /*
    Задача 3
    Дан список чисел. Превратите его в список квадратов этих чисел.

     */
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

    /*
    Задача 4
    Дан список чисел, необходимо удалить все вхождения числа 20 из него.

     */
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

    /*
    Задача 5
    Необходимо вывести список в обратном порядке.

     */
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

    /*
    Задача 6
    Заполнить список ста нулями, кроме первого и последнего элементов, которые должны быть равны единице.

     */
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

    /*
    Задача 7.
    Сформировать возрастающий список из чётных чисел (количество элементов 45).

     */
    public static ArrayList<Integer> task7() {
        int[] mass = new int[45];
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < 45; i++) {
            int num = (int) (Math.random() * 100);
            if (num % 2 == 0 && num != 0) {
                l.add(num);
            } else
                i--;
        }
        Collections.sort(l);
        return l;
    }


    /*
    Задача 8.
    Пользователь вводит число. Определить, содержит ли список данное число x. Если содержит, то вывести на экран число 7145, если не содержит, то вывести на экран число 5741;
    Найдите сумму и произведение элементов списка. Результаты вывести на экран.

     */
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

    /*
    Задача 9.
    Найти наибольший элемент списка и вывести его на экран;
    Определите, есть ли в списке повторяющиеся элементы, если да, то вывести на экран это значение;
    Поменять местами самый большой и самый маленький элементы списка

     */
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

