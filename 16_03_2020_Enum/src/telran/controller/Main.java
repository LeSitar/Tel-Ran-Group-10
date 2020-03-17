package telran.controller;

import telran.data.DayOfWeek;
import telran.data.Schedule;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek sunday = DayOfWeek.SUNDAY;
        System.out.println(monday);
        System.out.println(sunday.ordinal());
        //monday.printHello();
        System.out.println(monday.getTitle());
        System.out.println(Arrays.toString(DayOfWeek.values()));

        Schedule schedule = new Schedule();
        schedule.setDayOfWeek(DayOfWeek.MONDAY);
        schedule.wakeUp();
        schedule.getMenu(monday);
        schedule.getMenu(DayOfWeek.FRIDAY);

    }
}
