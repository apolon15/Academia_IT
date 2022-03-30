package com.academia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Academia_IT {
    public static void main(String[] args) throws IOException {
        //collection();
        collectionUsers();
    }

    //КАЖДЫЙ КЛАСС ОТВЕЧАЕТ ЗА ПУНКТ ДОМАШНЕГО ЗАДАНИЯ.ВРОДЕ ДОЛЖНО БЫТЬ ВСЁ ПОНЯТНО.
    //В СЛЕДУЮЩИЙ РАЗ БУДУ РАЗБИВАТЬ НА ПРОЕКТЫ И ОТДЕЛЬНЫЕ РЕПОЗ.



    /*
    Пользователь вводит с клавиатуры набор чисел. По-
    лученные числа необходимо сохранить в список. После
    чего нужно показать меню, в котором предложить поль-
    зователю набор пунктов:
    1. Добавить элемент в список;
    2. Удалить элемент из списка;
    3. Показать содержимое списка;
    4. Проверить есть ли значение в списке;
    5. Заменить значение в списке.
    В зависимости от выбора пользователя выполняется
    действие, после чего меню отображается снова.
    Для решения задачи используйте подходящий класс
    из Java Collections Framework.
     */
    public static void collection() throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        do {
            try {
                BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
                System.out.println(" Введи  размерность коллекции: ");
                int sizeList = Integer.parseInt(bf.readLine());
                //  int sizeList = sc.nextInt();
                List<Integer> num = new ArrayList<Integer>(sizeList);
                System.out.println("Введи " + sizeList + " чисел");
                int i = 0;
                while (i < sizeList) {
                    i++;
                    try {
                        num.add(Integer.parseInt(bf.readLine()));
                    } catch (IllegalArgumentException ex) {
                        System.out.println(" Не корректный ввод. Введено не число. Введи число");
                        i--;
                    }
                }
                System.out.println(num);
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
                        System.out.println("Введи порядковый номер");
                        n = sc.nextInt();
                        try {
                            num.remove(n - 1);
                            System.out.println(num);
                        } catch (IndexOutOfBoundsException ex) {
                            System.out.println("Внимательно читай условия.Нет такого порядкового  номера.");
                        }
                        break;
                    case 3:
                        System.out.println(num);
                        break;
                    case 4:
                        System.out.println("Введи число");
                        try {
                            n = sc.nextInt();
                            while (it.hasNext()) {
                                if (n == it.next()) {
                                    System.out.println("Есть такое значение");
                                    break;
                                }
                            }
                            if
                            (!it.hasNext() && n != it.next()) {
                            }
                        } catch (NoSuchElementException ex) {
                            System.out.println("Такого значения нет либо не корректный ввод");
                        }
                        break;
                    case 5:
                        System.out.println("Заменить значение-1 / Заменить порядковый номер-2");
                        switch (Integer.parseInt(bf.readLine())) {
                            case 1:
                                System.out.println("Введи число");
                                n = sc.nextInt();
                                System.out.println("На какое число заменить?");
                                change = sc.nextInt();
                                String index = String.valueOf(num.indexOf(n));
                                try {
                                    while (num.contains(n)) {
                                        num.set(Integer.parseInt(String.valueOf(num.indexOf(n))), change);
                                    }
                                } catch (IndexOutOfBoundsException ex) {
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
                        }
                    default:
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Значение должно быть более 0 либо введен \"пробел\"");
            } catch (InputMismatchException ex) {
                System.out.println("Введено не число");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Нет такого порядкового номера ");
            }
            System.out.println("Выход из программы-0 / Начать заново нажми любую клавишу");
        }
        while (!sc.next().equals("0"));
    }

    /*
    Необходимо разработать приложение, которое по-
    зволит сохранять информацию о логинах пользователей
    и их паролях. Каждому пользователю соответствует
    пара логин — пароль. При старте приложение отобра-
    жается меню:
    Практические задания
    1
    1. Добавить нового пользователя;
    2. Удалить существующего пользователя;
    3. Проверить существует ли пользователь;
    4. Изменить логин существующего пользователя;
    5. Изменить пароль существующего пользователя;
    В зависимости от выбора пользователя выполняется
    действие, после чего меню отображается снова.
     */
    public static void collectionUsers() throws IOException {
        boolean yes = false;
        HashSet<Users> uS = new HashSet<>();
        String login;
        String pass;
        boolean stop = false;
        do {
            System.out.println("Добавить пользователя: 1 \nУдалить пользователя: 2 " +
                    "\nПроверить пользователяв списке: 3\nИзменить логин пользователя: 4 \nИзменить пароль пользователя: 5");
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            try {
                switch (Integer.parseInt(bf.readLine())) {
                    case 1:
                        System.out.println("Введи логин:");
                        login = bf.readLine();
                        System.out.println("Введи pass:");
                        pass = bf.readLine();
                        if (uS.add(new Users(login, pass))) {
                            System.out.println("Пользователь добавлен \n" + uS);
                        }
                        break;
                    case 2:
                        if (uS.isEmpty()) {
                            System.out.println("Cписок пуст");
                        } else {
                            System.out.println("Введи логин:");
                            String delLogin = bf.readLine();
                            if (uS.removeIf(users -> delLogin.equals(users.getLogin()))) {
                                System.out.println("Пользователь под login " + delLogin + " удален");
                            } else {
                                System.out.println(" Нет такого юзера ");
                            }
                            System.out.println(uS);
                        }
                        break;
                    case 3:
                        if (uS.isEmpty()) {
                            System.out.println("Cписок пуст");
                        } else {
                            System.out.println("Введи логин:");
                            login = bf.readLine();
                            for (Users users : uS) {
                                if (users.getLogin().equals(login)) {
                                    System.out.println("Пользователь под login " + login + " существует");
                                    System.out.println(uS);
                                    yes = true;
                                    break;
                                } else {
                                }
                            }
                            if (!yes) {
                                System.out.println("Пользователя не существует");
                            }
                        }
                        break;
                    case 4:
                        if (uS.isEmpty()) {
                            System.out.println("Cписок пуст");
                        } else {
                            System.out.println("Введи логин требующий замены:");
                            login = bf.readLine();
                            System.out.println("Введи новый логин :");
                            String newLogin = bf.readLine();
                            for (Users users : uS) {
                                if (users.getLogin().equals(login)) {
                                    String copyPass = users.getPass();
                                    uS.remove(users);
                                    uS.add(new Users(newLogin, copyPass));
                                    yes = true;
                                    break;
                                }
                            } if (!yes) {
                                System.out.println("LOGINA не существует");
                            }
                        }
                        System.out.println(uS);
                        break;
                    case 5:
                        if (uS.isEmpty()) {
                            System.out.println("Cписок пуст");
                        } else {
                            System.out.println("Введи пароль требующий замены:");
                            pass = bf.readLine();
                            System.out.println("Введи новый pass :");
                            String newPass = bf.readLine();
                            for (Users users : uS) {
                                if (users.getPass().equals(pass)) {
                                    String copyLogin = users.getLogin();
                                    uS.remove(users);
                                    uS.add(new Users(copyLogin, newPass));
                                    yes = true;
                                    break;
                                }
                            }
                            if (!yes) {
                                System.out.println("Pass не существует");
                            }
                        }
                        System.out.println(uS);
                        break;
                    default:
                        System.out.println("Ожидаю ввода:");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Введи число: ");
            }
        } while (!stop);
    }
}