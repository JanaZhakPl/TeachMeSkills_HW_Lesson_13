package com.teachmeskills.Lesson_13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

/*
 Получить дату следеющего вторника
 */

public class Task2 {

    public static String dateNextTuesday(){

        LocalDate myDate = LocalDate.now();
        myDate = myDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday will be on " + myDate);
        return myDate.toString();
    }


//    public static String dateNextTuesdayFormSomeDate(int day, int month, int year){
//
//        LocalDate ld = LocalDate.of(year, month, day);
//        ld = ld.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
//        System.out.println("Next Tuesday will be on " + ld);
//        return ld.toString();
//    }

    public static void main(String[] args) {
        dateNextTuesday();
        //dateNextTuesdayFormSomeDate();
    }
}
