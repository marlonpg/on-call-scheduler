package com.gambasoftware.oncallscheduler.api.models;

import com.gambasoftware.oncallscheduler.application.models.enums.ShiftType;
import com.gambasoftware.oncallscheduler.application.models.enums.WeekDay;

public class DayShiftRequest {
    private WeekDay weekDay;
    private ShiftType shiftType;
    private int numberOfWorkers;

    public DayShiftRequest(WeekDay weekDay, ShiftType shiftType, int numberOfWorkers) {
        this.weekDay = weekDay;
        this.shiftType = shiftType;
        this.numberOfWorkers = numberOfWorkers;
    }

    public DayShiftRequest() {
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public ShiftType getShiftType() {
        return shiftType;
    }

    public void setShiftType(ShiftType shiftType) {
        this.shiftType = shiftType;
    }

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    @Override
    public String toString() {
        return "DayShiftRequest{" +
                "weekDay=" + weekDay +
                ", shiftType=" + shiftType +
                ", numberOfWorkers=" + numberOfWorkers +
                '}';
    }
}
