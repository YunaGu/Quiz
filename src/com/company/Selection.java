package com.company;

import java.util.Scanner;

public class Selection {

    /* scanner content 1 (1 or 2) */
    public static int a;
    /* scanner content 2 (Y or N) */
    public static String b;
    /* scanner content 3 (name) */
    public static String name;

    public static void choice(){
        /* enter the number of course which you want to access */
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.print("Please enter the number of course which you want to access: ");

            /* inspect if a string or a number */
            while (!scanner1.hasNextInt()) {
                String input1 = scanner1.next();
                System.out.printf("It\'s not a valid number, please enter a number, 1 or 2\n", input1);
            }
            a = scanner1.nextInt();
        /* only allow user to enter 1 or 2 instead of other numbers or characters */
        } while (a != 1 && a != 2);

        /* user views the text-based lesson */
        if (a == 1) {
            System.out.println("You chose Web Application which is a course includes both frond-end and back-end development. You could create a website by using HTML5, CSS3, and JavaScript, then passing data by Spring boot or Ajax. It should be very interesting.");
        } else if (a == 2) {
            System.out.println("You chose Programing Principle and Practice, all programmes are developed in Java. You could create all kinds of class to build various object, for instance, writing a class to describe some behaviour and features of a cat. Building a command-line programme based on basic grammar like if and while is also attractive.");
        };

    }

    /* ask users if they would like to do the quiz now */
    public static boolean quiz(){
        System.out.println("Would you want to have a quiz? (Please enter Y or N)");
        Scanner scanner = new Scanner(System.in);

        /* only input Y or N (case-sensitive) */
        do {
            b = scanner.next();
            System.out.printf("Please enter right choice (Y or N)\n", b);
        } while (!b.equals("Y") && !b.equals("N"));

        if (b.equals("Y") ) {
            System.out.println("Let\'s do a quiz now: ");
            /* do the quiz now */
            /* if user has done the quiz, ask his name */
            if (question()){
                System.out.println("Please enter your name:");
                Scanner scannerName = new Scanner(System.in);
                name = scannerName.nextLine();
            }
            return true;
        } else {
            /* if no, go back to the main menu (course list) */
            System.out.println("Let\' s go back to the main menu now: ");

          return false;
        }

    }

    public static boolean question(){

        /* Questions */
        String[][] arrayQues = {{"1. HTML stand for Hypertext Markup Language (T or F)", "2. CSS stand for Cascading Style Sheet (T or F)", "3. Every external JavaScript file contains the <script> tag (T or F)", "4. Which operation is designed to assign a value to a variable ('=' or '-' or the others)", "5. Is JavaScript case-sensitive? (Y or N)"},{"1. Java is short for 'JavaScript' (T or F)", "2. Array index start with (enter a number)", "3. Which statement is used to stop a loop? (break or return or the others)", "4. It is possible to inherit attributes and methods from one class to another (T or F)", "5. Which operator is used to multiply numbers ('*' or '#' or the others)"}};
        /* init answers */
        String[][] ans = {{"0","0","0","0","0"},{"0","0","0","0","0"}};
        /* criteria of answers */
        String[][] arrayAns = {{"T","T","F","=","Y"},{"F","0","break","F","*"}};
        /* init the score */
        int score = 0;
        /* there are 5 questions and the user can answer each */
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayQues[a-1][i]);
            Scanner scanner2 = new Scanner(System.in);
            ans[a-1][i]=scanner2.nextLine();
        }
        /* give the score after the user have answered all questions */
        for (int j = 0; j < 5; j++) {
            if (ans[a-1][j].equals(arrayAns[a-1][j])){
                score++;
            }
        }
        /* give the mark */
        System.out.println("Your score is: "+score);

        return true;
    }

    public static void main(String[] args) {
//        choice();
//        System.out.printf("Press ENTER to continue");
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//        quiz();
    }

}
