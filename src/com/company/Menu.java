package com.company;

import java.util.Scanner;

public class Menu {
    public static boolean menu(){
        System.out.println("Here is menu and this app has 3 main function: ");
        String[] funs = new String[]{"1. list all lessons available", "2. access a lesson and associated quiz", "3. check whether completed"};
        /* show each lesson */
        for (String fun: funs) {
            System.out.println(fun);
        }

        System.out.printf("Press ENTER to continue or enter '0' to exit");
        Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();
        while (content.equals("0")){
            System.exit(0);
        };

        return true;

    }

    public static void main(String[] args) {
//        menu();
    }

}
