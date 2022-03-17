package com.academia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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
            System.out.println("Добавить эл-т в список: 1 \nУдалить эл-т из списка: 2 " +
                    "\nПоказать содержимое списка: 3 \nПроверить значение в списке: 4 \nЗаменить значене в списке: 5");
            int n;
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
                    num.remove(n);
                    System.out.println(num);
                    break;
                case 3:
                    System.out.println(num);
                    break;
                case 4:
                    System.out.println("Введи число");
                    n = sc.nextInt();
                    while (it.hasNext()) {
                        if (n == it.next()) {
                            System.out.println("Есть такое значение");
                        } else if (!it.hasNext()) {
                            System.out.println("Такого значения нет");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Заменить значение-1 / Заменить порядковый номер-2");
                    switch (Integer.parseInt(bf.readLine())) {
                        case 1:
                            System.out.println("Введи число");
                            n = sc.nextInt();
                            while (it.hasNext()) {
                                if (n == it.next()) {
                                    num.remove(n);
                                } else if (!it.hasNext()) {
                                    System.out.println("Такого значения нет");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Введи порядковый номер");
                            n = sc.nextInt();
                            System.out.println("Введи значение ");
                            num.add(n, Integer.parseInt(bf.readLine()));
                            break;
                        default:
                            System.out.println(55);
                    }
                default:
                    System.out.println("end");
            }
            System.out.println("Выход из программы-0 / для продолжения нажми любую клавишу");
        }
              while (sc.next().equals("0"));
    }
}
