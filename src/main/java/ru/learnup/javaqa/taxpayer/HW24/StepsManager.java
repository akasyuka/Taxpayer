package ru.learnup.javaqa.taxpayer.HW24;

import java.util.HashMap;
import java.util.Map;

public class StepsManager implements Comparable<StepsManager> {
    private int sum;
    private Map<Integer, Integer> days = new HashMap<>();

    public int getSum() {
        return sum;
    }

    public void add(int day, int steps) {
        if (!days.containsKey(day)) {
            days.put(day, 0);
        }
        days.put(day, steps + days.get(day));
        sum += steps;
    }

    public Map<Integer, Integer> getMap() {
        return days;
    }

    @Override
    public int compareTo(StepsManager m2) {
        return sum - m2.getSum();
    }
}
