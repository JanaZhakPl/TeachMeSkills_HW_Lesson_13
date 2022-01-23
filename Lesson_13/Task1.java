package com.teachmeskills.Lesson_13;


import java.time.DayOfWeek;
import java.time.LocalDate;

/*
1. Получить день недели по дате
 */

public class Task1 {

        public static String getDayOfWeek(int day, int month, int year) {

            LocalDate myDate = LocalDate.of(year, month, day);

            DayOfWeek dayOfWeek = myDate.getDayOfWeek();
            System.out.println(dayOfWeek);

            return dayOfWeek.toString();
        }

    public static void main(String[] args) {
        getDayOfWeek(16,01,2022);
        }
}
