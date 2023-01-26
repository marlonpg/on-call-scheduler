package com.gambasoftware.oncallscheduler.service;

import com.gambasoftware.oncallscheduler.api.models.DayShiftRequest;
import com.gambasoftware.oncallscheduler.application.models.LinkedNode;
import com.gambasoftware.oncallscheduler.application.models.Node;
import com.gambasoftware.oncallscheduler.application.models.WorkerModel;
import com.gambasoftware.oncallscheduler.application.models.enums.ShiftType;
import com.gambasoftware.oncallscheduler.application.models.enums.WeekDay;
import com.gambasoftware.oncallscheduler.application.service.WeekShiftsService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WeekShiftsServiceTest {

    private WeekShiftsService weekShiftsService = new WeekShiftsService();

    @Test
    public void createAvailableShifts_shouldReturnLinkedList_whenSuccessful() {

//        Map<Integer, DayShiftRequest> map = new HashMap<>();
//        map.put(1, new DayShiftRequest(WeekDay.SUNDAY, ShiftType.DAY, 2));
//        map.put(2, new DayShiftRequest(WeekDay.SUNDAY, ShiftType.NIGHT, 1));
//        map.put(3, new DayShiftRequest(WeekDay.MONDAY, ShiftType.DAY, 1));
//        map.put(4, new DayShiftRequest(WeekDay.MONDAY, ShiftType.NIGHT, 1));
//        map.put(5, new DayShiftRequest(WeekDay.TUESDAY, ShiftType.DAY, 1));
//        map.put(6, new DayShiftRequest(WeekDay.TUESDAY, ShiftType.NIGHT, 1));
//        map.put(7, new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.DAY, 1));
//        map.put(8, new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.NIGHT, 1));
//        map.put(9, new DayShiftRequest(WeekDay.THURSDAY, ShiftType.DAY, 1));
//        map.put(10, new DayShiftRequest(WeekDay.THURSDAY, ShiftType.NIGHT, 1));
//        map.put(11, new DayShiftRequest(WeekDay.FRIDAY, ShiftType.DAY, 1));
//        map.put(12, new DayShiftRequest(WeekDay.FRIDAY, ShiftType.NIGHT, 1));
//        map.put(13, new DayShiftRequest(WeekDay.SATURDAY, ShiftType.DAY, 2));
//        map.put(14, new DayShiftRequest(WeekDay.SATURDAY, ShiftType.NIGHT, 2));
//
//
//        var response = weekShiftsService.createAvailableShifts(map);
//        assertNotNull(response);
//        assertEquals(WeekDay.MONDAY, response.get(1).getWeekDay());
//        assertEquals(2, response.get(1).getNumberOfShifts());
    }

    @Test
    public void distributeWorkers_shouldReturnLinkedList_whenSuccessful() {

//        Map<Integer, DayShiftRequest> map = new HashMap<>();
//        map.put(1, new DayShiftRequest(WeekDay.SUNDAY, ShiftType.DAY, 2));
//        map.put(2, new DayShiftRequest(WeekDay.SUNDAY, ShiftType.NIGHT, 1));
//        map.put(3, new DayShiftRequest(WeekDay.MONDAY, ShiftType.DAY, 1));
//        map.put(4, new DayShiftRequest(WeekDay.MONDAY, ShiftType.NIGHT, 1));
//        map.put(5, new DayShiftRequest(WeekDay.TUESDAY, ShiftType.DAY, 1));
//        map.put(6, new DayShiftRequest(WeekDay.TUESDAY, ShiftType.NIGHT, 1));
//        map.put(7, new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.DAY, 1));
//        map.put(8, new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.NIGHT, 1));
//        map.put(9, new DayShiftRequest(WeekDay.THURSDAY, ShiftType.DAY, 1));
//        map.put(10, new DayShiftRequest(WeekDay.THURSDAY, ShiftType.NIGHT, 1));
//        map.put(11, new DayShiftRequest(WeekDay.FRIDAY, ShiftType.DAY, 1));
//        map.put(12, new DayShiftRequest(WeekDay.FRIDAY, ShiftType.NIGHT, 1));
//        map.put(13, new DayShiftRequest(WeekDay.SATURDAY, ShiftType.DAY, 2));
//        map.put(14, new DayShiftRequest(WeekDay.SATURDAY, ShiftType.NIGHT, 2));
//
//
//        var availableShifts = weekShiftsService.createAvailableShifts(map);
//
//        List<String> workers = new ArrayList<>();
//        workers.add("Isadora");
//        workers.add("Bruna");
//        workers.add("Kerolin");
//        workers.add("Mariana");
//        workers.add("Victoria Morino");
//        workers.add("Matheus");
//        workers.add("Ana Carolina");
//        workers.add("Karina");
//        workers.add("Vitoria");
//        workers.add("Tamires");
//
//        var response = weekShiftsService.distributeWorkers(availableShifts, workers);
//
//        System.out.println(response);
    }

    @Test
    public void createAvailableShifts2_shouldReturnLinkedList_whenSuccessful() {
        List<DayShiftRequest> list = new ArrayList<>();
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.DAY, 2));
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.ON_CALL_DAY, 1));
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.MONDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.MONDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.TUESDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.TUESDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.THURSDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.THURSDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.FRIDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.FRIDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.DAY, 2));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.ON_CALL_DAY, 1));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.NIGHT, 2));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.ON_CALL_NIGHT, 1));

        var availableShifts = weekShiftsService.createAvailableShifts(list);

        System.out.println(availableShifts);

        List<WorkerModel> workers = new ArrayList<>();

        workers.add(new WorkerModel("Isadora", List.of(WeekDay.values()), List.of(ShiftType.DAY)));
        workers.add(new WorkerModel("Bruna", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Kerolin", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Mariana", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Victoria Morino", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Matheus", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Ana Carolina", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Karina", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Vitoria", List.of(WeekDay.SUNDAY), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Tamires", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));

        var response = weekShiftsService.distributeWorkers(availableShifts, workers, false);

        System.out.println(response);
    }

    @Test
    public void createAvailableShifts2_shouldReturnLinkedList_whenSuccessful2() {
        List<DayShiftRequest> list = new ArrayList<>();
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.DAY, 2));
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.ON_CALL_DAY, 1));
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.MONDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.MONDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.MONDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.TUESDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.TUESDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.TUESDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.THURSDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.THURSDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.THURSDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.FRIDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.FRIDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.FRIDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.DAY, 2));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.ON_CALL_DAY, 1));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.NIGHT, 2));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.ON_CALL_NIGHT, 1));

        var availableShifts = weekShiftsService.createAvailableShifts(list);

        System.out.println(availableShifts);

        List<WorkerModel> workers = new ArrayList<>();

        workers.add(new WorkerModel("Isadora", List.of(WeekDay.values()), List.of(ShiftType.DAY)));
        workers.add(new WorkerModel("Bruna", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Kerolin", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Mariana", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Victoria Morino", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Matheus", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Ana Carolina", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Karina", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Vitoria", List.of(WeekDay.SUNDAY), List.of(ShiftType.DAY, ShiftType.NIGHT)));
        workers.add(new WorkerModel("Tamires", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT)));

        List<WorkerModel> workersOnCall = new ArrayList<>();

        workersOnCall.add(new WorkerModel("Isadora", List.of(WeekDay.values()), List.of(ShiftType.ON_CALL_DAY)));
        workersOnCall.add(new WorkerModel("Bruna", List.of(WeekDay.values()), List.of(ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workersOnCall.add(new WorkerModel("Kerolin", List.of(WeekDay.values()), List.of(ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workersOnCall.add(new WorkerModel("Mariana", List.of(WeekDay.values()), List.of(ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workersOnCall.add(new WorkerModel("Victoria Morino", List.of(WeekDay.values()), List.of(ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workersOnCall.add(new WorkerModel("Matheus", List.of(WeekDay.values()), List.of(ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workersOnCall.add(new WorkerModel("Ana Carolina", List.of(WeekDay.values()), List.of(ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workersOnCall.add(new WorkerModel("Karina", List.of(WeekDay.values()), List.of(ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workersOnCall.add(new WorkerModel("Vitoria", List.of(WeekDay.SUNDAY, WeekDay.SATURDAY), List.of(ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workersOnCall.add(new WorkerModel("Tamires", List.of(WeekDay.values()), List.of(ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));

        var response = weekShiftsService.distributeWorkers(availableShifts, workers, false);

        var response2 = weekShiftsService.distributeWorkers(response, workersOnCall, true);

        System.out.println(response);

        System.out.println(response2);
    }

    @Test
    public void createAvailableShifts3_shouldReturnLinkedList_whenSuccessful2() {
        List<DayShiftRequest> list = new ArrayList<>();
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.DAY, 2));
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.ON_CALL_DAY, 1));
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.SUNDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.MONDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.MONDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.MONDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.TUESDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.TUESDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.TUESDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.WEDNESDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.THURSDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.THURSDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.THURSDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.FRIDAY, ShiftType.DAY, 1));
        list.add(new DayShiftRequest(WeekDay.FRIDAY, ShiftType.NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.FRIDAY, ShiftType.ON_CALL_NIGHT, 1));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.DAY, 2));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.ON_CALL_DAY, 1));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.NIGHT, 2));
        list.add(new DayShiftRequest(WeekDay.SATURDAY, ShiftType.ON_CALL_NIGHT, 1));

        var availableShifts = weekShiftsService.createAvailableShifts(list);

        System.out.println(availableShifts);

        List<WorkerModel> workers = new ArrayList<>();

        workers.add(new WorkerModel("Isadora", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.ON_CALL_DAY)));
        workers.add(new WorkerModel("Bruna", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT, ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workers.add(new WorkerModel("Kerolin", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT, ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workers.add(new WorkerModel("Mariana", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT, ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workers.add(new WorkerModel("Victoria Morino", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT, ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workers.add(new WorkerModel("Matheus", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT, ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workers.add(new WorkerModel("Ana Carolina", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT, ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workers.add(new WorkerModel("Karina", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT, ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workers.add(new WorkerModel("Vitoria", List.of(WeekDay.SUNDAY), List.of(ShiftType.DAY, ShiftType.NIGHT, ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));
        workers.add(new WorkerModel("Tamires", List.of(WeekDay.values()), List.of(ShiftType.DAY, ShiftType.NIGHT, ShiftType.ON_CALL_DAY, ShiftType.ON_CALL_NIGHT)));

        var response = weekShiftsService.distributeWorkers(availableShifts, workers, false);

        var response2 = weekShiftsService.distributeWorkers(response, workers, true);

        System.out.println(response);

        System.out.println(response2);
    }

    @Test
    public void linkedNode_shouldReturnCorrectWeekDay_whenSuccessful() {
        LinkedNode<WeekDay> weekDayLinkedNode = new LinkedNode<>();
        weekDayLinkedNode.add(WeekDay.SUNDAY);
        weekDayLinkedNode.add(WeekDay.MONDAY);
        weekDayLinkedNode.add(WeekDay.TUESDAY);
        weekDayLinkedNode.add(WeekDay.WEDNESDAY);

        assertEquals(weekDayLinkedNode.getFirst().getObject(), WeekDay.SUNDAY);
        assertEquals(weekDayLinkedNode.getFirst().getNext().getObject(), WeekDay.MONDAY);
        assertEquals(weekDayLinkedNode.getLast().getPrevious().getObject(), WeekDay.TUESDAY);
        assertEquals(weekDayLinkedNode.getLast().getObject(), WeekDay.WEDNESDAY);
    }

    @Test
    public void getByObject_shouldReturnCorrectNode_whenSuccessful() {
        LinkedNode<WeekDay> weekDayLinkedNode = new LinkedNode<>();
        weekDayLinkedNode.add(WeekDay.SUNDAY);
        weekDayLinkedNode.add(WeekDay.MONDAY);
        weekDayLinkedNode.add(WeekDay.TUESDAY);
        weekDayLinkedNode.add(WeekDay.WEDNESDAY);
        weekDayLinkedNode.add(WeekDay.THURSDAY);

        Node response = weekDayLinkedNode.getByObject(WeekDay.TUESDAY);
        assertEquals(response.getObject(), WeekDay.TUESDAY);
        assertEquals(response.getNext().getObject(), WeekDay.WEDNESDAY);
        assertEquals(response.getPrevious().getObject(), WeekDay.MONDAY);
    }
}
