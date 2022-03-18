package com.academia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Academia_IT {
    public static void main(String[] args) throws IOException {
        System.out.println(" Введи  размерность коллекции: ");
        Scanner sc = new Scanner(System.in);
        int sizeList = sc.nextInt();
        List<Integer> num = new ArrayList<>(sizeList);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи " + sizeList + " чисел");
        for (int i = 0; i < sizeList; i++) {
            num.add(Integer.parseInt(bf.readLine()));
        }
        System.out.println(num);
        do {
            System.out.println("Добавить эл-т в список: 1 \nУдалить порядковый номер из списка: 2 " +
                    "\nПоказать содержимое списка: 3 \nПроверить значение в списке: 4 \nЗаменить значение в списке: 5");
            int n;
            int change;
            Iterator<Integer> it = num.iterator();
            switch (Integer.parseInt(bf.readLine())) {
                case 1:
                    System.out.println("Введи число");
                    n = sc.nextInt();
                    num.add(n);
                    System.out.println(num);
                    break;
                case 2:
                    System.out.println("Введи число");
                    n = sc.nextInt();
                    num.remove(n - 1);
                    System.out.println(num);
                    break;
                case 3:
                    System.out.println(num);
                    break;
                case 4:
                    System.out.println("Введи число");
                    n = sc.nextInt();
                    while (it.hasNext()) {
                        try {
                            if (n == it.next()) {
                                System.out.println("Есть такое значение");
                            } else if
                            (!it.hasNext() && n != it.next()) {
                            }
                        } catch (NoSuchElementException ex) {
                            System.out.println("Такого значения нет");
                        }
                    }
                    break;
                case 5:
                    boolean stop = false;

                    System.out.println("Заменить значение-1 / Заменить порядковый номер-2");
                    switch (Integer.parseInt(bf.readLine())) {
                        case 1:
                            int counter = -1;
                            System.out.println("Введи число");
                            n = sc.nextInt();
                            System.out.println("На какое число заменить?");
                            change = sc.nextInt();
                            String index = String.valueOf(num.indexOf(n));
                            num.set(Integer.parseInt(index), change);
                            if (index == null) {
                                System.out.println("Такого значения нет");
                            }
                            System.out.println(num);
                            break;
                        case 2:
                            System.out.println("Введи порядковый номер");
                            n = sc.nextInt();
                            System.out.println("Введи значение ");
                            change = Integer.parseInt(bf.readLine());
                            num.set(n - 1, change);
                            System.out.println(num);
                            break;
                        default:
                    }
                default:
                    System.out.println("Выход из программы-0 / для продолжения нажми любую клавишу");
            }
        }
        while (!sc.next().equals("0"));
    }
}