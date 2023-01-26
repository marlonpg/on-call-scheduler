package com.gambasoftware.oncallscheduler.application.models;

import com.gambasoftware.oncallscheduler.application.models.enums.WeekDay;

import java.util.ArrayList;
import java.util.List;

public class WorkDayModel {
    private String id;
    private WeekDay weekDay;
    private int numberOfShifts;
    private List<ShiftModel> shiftModels = new ArrayList<>();

    public void allocateWorker(WorkerModel worker) {
        if (worker.isMyWorkDay(weekDay))
            for (ShiftModel shiftModel : getShifts()) {
                if (!shiftModel.isAllocationFull()) {
                    try {
                        shiftModel.addWorker(worker);
                        worker.getUnavailableWeekDays().add(weekDay);
                        return;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        throw new RuntimeException("No room left for this shift");
    }

    public boolean isAllocationFull() {
        return (getWorkersCapacity() - getWorkersAllocated()) <= 0;
    }

    public int getWorkersCapacity() {
        return getShifts().stream()
                .map(ShiftModel::getMaxWorkers)
                .reduce(Integer::sum)
                .orElse(0);
    }

    public int getWorkersAllocated() {
        return getShifts().stream()
                .map(ShiftModel::getWorkers)
                .map(List::size)
                .reduce(Integer::sum)
                .orElse(0);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ShiftModel> getShiftModels() {
        return shiftModels;
    }

    public void setShiftModels(List<ShiftModel> shiftModels) {
        this.shiftModels = shiftModels;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public int getNumberOfShifts() {
        return numberOfShifts;
    }

    public void setNumberOfShifts(int numberOfShifts) {
        this.numberOfShifts = numberOfShifts;
    }

    public List<ShiftModel> getShifts() {
        return shiftModels;
    }

    public void setShifts(List<ShiftModel> shiftModels) {
        this.shiftModels = shiftModels;
    }

    @Override
    public String toString() {
        return "WorkDayModel{" +
                "id='" + id + '\'' +
                ", weekDay=" + weekDay +
                ", numberOfShifts=" + numberOfShifts +
                ", shiftModels=" + shiftModels +
                '}';
    }
}
