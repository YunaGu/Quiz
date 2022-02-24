package com.company;

public class List {
    public static String[] lessons;

    public static String getLessons(int n) {
        return lessons[n-1];
    }

    public static void list(){
        System.out.println("The lessons available: ");
        lessons = new String[]{"1. Web application", "2. Programming Principles and Practice"};
        /* show each lesson */
        for (String lesson: lessons) {
            System.out.println(lesson);
        }
    }
    public static void main(String[] args) {
//        list();
    }
}
