package com.gambasoftware.oncallscheduler.application.models;

import com.gambasoftware.oncallscheduler.application.models.enums.ShiftType;
import com.gambasoftware.oncallscheduler.application.models.enums.WeekDay;

import java.util.ArrayList;
import java.util.List;

public class WorkerModel {
    private String id;
    private String name;
    private List<WeekDay> allowedWeekDays = new ArrayList<>();
    private List<ShiftType> allowedShiftTypes = new ArrayList<>();
    private List<WeekDay> unavailableWeekDays = new ArrayList<>();

    public boolean isUnavailable(WeekDay weekDay) {
        Node node = WeekDay.weekDays.getByObject(weekDay);
        return unavailableWeekDays.contains(node.getObject())
                || unavailableWeekDays.contains(node.getNext())
                || unavailableWeekDays.contains(node.getPrevious());
    }

    public WorkerModel(String name, List<WeekDay> allowedWeekDays, List<ShiftType> allowedShiftTypes) {
        this.name = name;
        this.allowedWeekDays = allowedWeekDays;
        this.allowedShiftTypes = allowedShiftTypes;
    }

    public boolean hasOnCall() {
        return allowedShiftTypes.contains(ShiftType.ON_CALL_DAY) || allowedShiftTypes.contains(ShiftType.ON_CALL_NIGHT);
    }

    public boolean isMyShift(ShiftType shiftType) {
        return allowedShiftTypes.contains(shiftType);
    }

    public boolean isMyWorkDay(WeekDay weekDay) {
        return allowedWeekDays.contains(weekDay);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeekDay> getAllowedWeekDays() {
        return allowedWeekDays;
    }

    public void setAllowedWeekDays(List<WeekDay> allowedWeekDays) {
        this.allowedWeekDays = allowedWeekDays;
    }

    public List<ShiftType> getAllowedShiftTypes() {
        return allowedShiftTypes;
    }

    public void setAllowedShiftTypes(List<ShiftType> allowedShiftTypes) {
        this.allowedShiftTypes = allowedShiftTypes;
    }

    public List<WeekDay> getUnavailableWeekDays() {
        return unavailableWeekDays;
    }

    public void setUnavailableWeekDays(List<WeekDay> unavailableWeekDays) {
        this.unavailableWeekDays = unavailableWeekDays;
    }

    @Override
    public String toString() {
        return "WorkerModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", allowedWeekDays=" + allowedWeekDays +
                ", allowedShiftTypes=" + allowedShiftTypes +
                ", unavailableWeekDays=" + unavailableWeekDays +
                '}';
    }
}
