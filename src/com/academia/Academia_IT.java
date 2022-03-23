package com.academia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Academia_IT {
    public static void main(String[] args) throws IOException {
          collection();
        //collectionUsers();
    }

    public static void collection() throws IOException {
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
                    try {
                        num.remove(n - 1);
                        System.out.println(num);
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("Внимательно читай условия.Нет такого порядкового  номера. Выход из программы-0 / для продолжения нажми любую клавишу");
                    }
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
                    System.out.println("Заменить значение-1 / Заменить порядковый номер-2");
                    switch (Integer.parseInt(bf.readLine())) {
                        case 1:
                            System.out.println("Введи число");
                            n = sc.nextInt();
                            System.out.println("На какое число заменить?");
                            change = sc.nextInt();
                            String index = String.valueOf(num.indexOf(n));
                            try {
                                num.set(Integer.parseInt(String.valueOf(num.indexOf(n))), change);
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
                        default:
                    }
                default:
                    System.out.println("Выход из программы-0 / для продолжения нажми любую клавишу");
            }
        }
        while (!sc.next().equals("0"));
    }

    public static void collectionUsers() throws IOException {
        List<Users> uS = new ArrayList<>();
        String login;
        String pass;
        boolean stop = false;
        Iterator<Users> it = uS.iterator();
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
                        uS.add(new Users(login, pass));
                        System.out.println(uS);
                        break;
                    case 2:
                        if (uS.isEmpty()) {
                            System.out.println("Cписок пуст");
                        } else {
                            System.out.println("Введи логин:");
                            login = bf.readLine();
                            while (it.hasNext()) {
                                for (int i = 0; i <= uS.size() - 1; i++) {
                                    if (uS.get(i).getLogin().equals(login)) {
                                        uS.remove(i);
                                        System.out.println("Пользователь под login " + login + " удален");
                                        System.out.println(uS);
                                    } else if (!it.hasNext()) {
                                        System.out.println(" Нет такого юзера ");
                                        System.out.println(uS);
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        if (uS.isEmpty()) {
                            System.out.println("Cписок пуст");
                        } else {
                            System.out.println("Введи логин:");
                            login = bf.readLine();
                            while (it.hasNext()) {
                                for (int i = 0; i <= uS.size() - 1; i++) {
                                    if (uS.get(i).getLogin().equals(login)) {
                                        System.out.println("Такой существует");
                                        System.out.println(uS);
                                    } else if (!it.hasNext()) {
                                        System.out.println(" Нет такого юзера ");
                                        System.out.println(uS);
                                    }
                                }
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
                            for (int i = 0; i <= uS.size() - 1; i++) {
                                if (uS.get(i).getLogin().equals(login)) {
                                    uS.get(i).setLogin(newLogin);
                                    System.out.println(uS);
                                } else if (i == uS.size() - 1) {
                                    System.out.println("Нет юзера с таким логином\n" + uS);
                                }
                            }
                        }
                        break;
                    case 5:
                        if (uS.isEmpty()) {
                            System.out.println("Cписок пуст");
                        } else {
                            System.out.println("Введи пароль требующий замены:");
                            pass = bf.readLine();
                            System.out.println("Введи новый pass :");
                            String newPass = bf.readLine();
                            for (int i = 0; i <= uS.size() - 1; i++) {
                                if (uS.get(i).getPass().equals(pass)) {
                                    uS.get(i).setPass(newPass);
                                } else if (i == uS.size() - 1) {
                                    System.out.println("Нет юзера с таким pass");
                                }
                            }
                        }
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