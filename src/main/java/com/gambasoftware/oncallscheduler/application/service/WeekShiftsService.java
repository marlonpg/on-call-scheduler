package com.gambasoftware.oncallscheduler.application.service;

import com.gambasoftware.oncallscheduler.api.models.DayShiftRequest;
import com.gambasoftware.oncallscheduler.application.models.ShiftModel;
import com.gambasoftware.oncallscheduler.application.models.WorkDayModel;
import com.gambasoftware.oncallscheduler.application.models.WorkerModel;
import com.gambasoftware.oncallscheduler.application.models.enums.WeekDay;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class WeekShiftsService {

    public List<WorkDayModel> createAvailableShifts(List<DayShiftRequest> dayShiftRequestList) {
        List<WorkDayModel> weekShifts = new ArrayList<>();
        WeekDay[] days = WeekDay.values();
        for (WeekDay day : days) {
            WorkDayModel workDayModel = new WorkDayModel();
            workDayModel.setWeekDay(day);
            for (DayShiftRequest dayShiftRequest : dayShiftRequestList) {
                if (dayShiftRequest.getWeekDay() == day) {
                    workDayModel.getShifts().add(new ShiftModel(dayShiftRequest.getShiftType(), dayShiftRequest.getNumberOfWorkers()));
                }
            }
            weekShifts.add(workDayModel);
        }
        return weekShifts;
    }

    public List<WorkDayModel> distributeWorkers(List<WorkDayModel> weekShifts, List<WorkerModel> workers, boolean isOnCall) {
        for (int i = 0; i < weekShifts.size(); i++) {
            WorkDayModel workDayModel = weekShifts.get(i);
            LinkedList<WorkerModel> workersAvailable = workers.stream()
                    .filter(workerModel -> workerModel.isMyWorkDay(workDayModel.getWeekDay()))
                    .filter(workerModel -> !isOnCall || !workerModel.hasOnCall() || !workerModel.isUnavailable(workDayModel.getWeekDay()))
                    .collect(Collectors.toCollection(LinkedList::new));

            for (int j = 0; j < workDayModel.getWorkersCapacity(); j++) {
                if (!workDayModel.isAllocationFull())
                    try {
                        workersAvailable.sort((worker1, worker2) -> {
                            if (worker1.getAllowedWeekDays().size() < worker2.getAllowedWeekDays().size()) {
                                return -1;
                            } else {
                                return 1;
                            }
                        });
                        System.out.println(workersAvailable);
                        //workersAvailable.sort((worker1, worker2) -> worker1.getAllowedWeekDays().size() < worker2.getAllowedWeekDays().size());
                        //sort worker by
                        //all that have work at that day
                        //first the ones that have small number of allowed days
                        //second the ones that are not allocated yet
                        //
                        workDayModel.allocateWorker(workersAvailable.poll());
                    } catch (Exception e) {
                        System.out.println("No available");
                    }
            }
        }
        return weekShifts;
    }

    public List<WorkDayModel> distributeWorkersOnCall(List<WorkDayModel> weekWorkDays, List<WorkerModel> workers) {
        for (int i = 0; i < weekWorkDays.size(); i++) {
            WorkDayModel workDayModel = weekWorkDays.get(i);
            LinkedList<WorkerModel> workersAvailable = new LinkedList<>(workers.stream()
                    .filter(workerModel -> workerModel.isMyWorkDay(workDayModel.getWeekDay()))
                    .collect(Collectors.toList()));
            for (int j = 0; j < workDayModel.getWorkersCapacity(); j++) {
                if (!workDayModel.isAllocationFull())
                    try {
                        workersAvailable.sort((worker1, worker2) -> {
                            if (worker1.getAllowedWeekDays().size() < worker2.getAllowedWeekDays().size()) {
                                return -1;
                            } else {
                                return 1;
                            }
                        });
                        System.out.println(workersAvailable);
                        //workersAvailable.sort((worker1, worker2) -> worker1.getAllowedWeekDays().size() < worker2.getAllowedWeekDays().size());
                        //sort worker by
                        //all that have work at that day
                        //first the ones that have small number of allowed days
                        //second the ones that are not allocated yet
                        //
                        workDayModel.allocateWorker(workersAvailable.poll());
                    } catch (Exception e) {
                        System.out.println("No available");
                    }
            }
        }
        return weekWorkDays;
    }
}
