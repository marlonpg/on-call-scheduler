package com.gambasoftware.oncallscheduler.application.models;

import com.gambasoftware.oncallscheduler.application.models.enums.ShiftType;

import java.util.ArrayList;
import java.util.List;

public class ShiftModel {
    private ShiftType shiftType;
    private int maxWorkers;
    private List<WorkerModel> workers = new ArrayList<>();

    public ShiftModel(ShiftType shiftType, int maxWorkers) {
        this.shiftType = shiftType;
        this.maxWorkers = maxWorkers;
    }

    public void addWorker(WorkerModel worker) {
        if (maxWorkers > workers.size() && worker.isMyShift(shiftType)) {
            workers.add(worker);
            return;
        }
        throw new RuntimeException("No room left for this shift");
    }

    public boolean isAllocationFull() {
        return workers.size() >= maxWorkers;
    }

    public ShiftType getShiftType() {
        return shiftType;
    }

    public void setShiftType(ShiftType shiftType) {
        this.shiftType = shiftType;
    }

    public int getMaxWorkers() {
        return maxWorkers;
    }

    public void setMaxWorkers(int maxWorkers) {
        this.maxWorkers = maxWorkers;
    }

    public List<WorkerModel> getWorkers() {
        return workers;
    }

    public void setWorkers(List<WorkerModel> workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "ShiftModel{" +
                "shiftType=" + shiftType +
                ", maxWorkers=" + maxWorkers +
                ", workers=" + workers +
                '}';
    }
}
