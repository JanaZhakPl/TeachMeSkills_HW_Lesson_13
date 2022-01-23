package com.teachmeskills.Lesson_13.Task3.ChooseNumber;

import java.util.Scanner;

public class ChooseAction {

   static MyFunctionalInterface<String> inCaseOfString = (str) -> {
           return new StringBuilder(str).reverse().toString();
       };
   static MyFunctionalInterface<Integer> inCaseOfInteger = (n) -> {
       int result = 1;
       for (int i = 1; i <= n; i++) {
           result = result * i;
       }
       return result;
   };

    public static void main(String[] args) {

            System.out.println("Enter \"1\" to get reverse of your string, " +
                    "or \"2\" to return factorial of your integer");

            Scanner s = new Scanner(System.in);
            int myChoice = s.nextInt();

            switch (myChoice) {
                case (1):
                    System.out.println("Enter the string to reverse: ");
                    Scanner s2 = new Scanner(System.in);
                    String stringToReverse = s2.nextLine();
                    System.out.println(inCaseOfString.chosenAction(stringToReverse));

                    break;
                case (2):
                    System.out.println("Enter the number to get factorial");
                    int numberToFactorial = s.nextInt();
                    System.out.println(inCaseOfInteger.chosenAction(numberToFactorial));
                    break;
                default:
                    System.out.println("Enter only 1 or 2 ");
            }
    }}