package com.company;

import java.util.Scanner;

public class Check {

    public static void check(){
        /* ask for their name */
        System.out.println("Please re-enter your name:");
        Scanner scannerName1 = new Scanner(System.in);
        String name1 = scannerName1.nextLine();

        /* get the previous name and lesson */
        Selection selectedName = new Selection();
        String name = selectedName.name;
        int num = selectedName.a;
        List lessonList = new List();

        /* check whether the user has completed each lesson */
        if (name.equals(name1)){
            System.out.println(name1 + " has completed " + "\"" + lessonList.getLessons(num) + "\"");
        } else {
            System.out.println(name1 + " hasn't complete any quiz yet");
        }
    }

    public static void main(String[] args) {
//        check();
    }

}
