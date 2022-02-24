package com.company;

import java.util.Scanner;

public class Main {

    public static void app() {

        /* function 1: list all lessons available */
        if (Menu.menu()){
            List list = new List();
            list.list();
        }

        /* function 2: access a lesson and associated quiz */
        Selection select = new Selection();
        select.choice();
        System.out.printf("Press ENTER to continue or enter '0' to exit");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        while (s.equals("0")){
            System.exit(0);
        }

        /* function 3: check whether completed */
        if (select.quiz()){
            Check.check();
        }else {
            app();
        }

    }
    public static void main(String[] args) {

        app();

    }
}
