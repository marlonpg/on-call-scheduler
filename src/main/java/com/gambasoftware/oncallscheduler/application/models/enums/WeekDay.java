package com.gambasoftware.oncallscheduler.application.models.enums;

import com.gambasoftware.oncallscheduler.application.models.LinkedNode;

public enum WeekDay {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static LinkedNode<WeekDay> weekDays = new LinkedNode<>();

    static {
        weekDays.add(WeekDay.SUNDAY);
        weekDays.add(WeekDay.MONDAY);
        weekDays.add(WeekDay.TUESDAY);
        weekDays.add(WeekDay.WEDNESDAY);
        weekDays.add(WeekDay.THURSDAY);
        weekDays.add(WeekDay.FRIDAY);
        weekDays.add(WeekDay.SATURDAY);
    }
}
