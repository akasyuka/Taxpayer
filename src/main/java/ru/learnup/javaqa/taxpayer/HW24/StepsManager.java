package ru.learnup.javaqa.taxpayer.HW24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StepsManager implements Comparable<StepsManager> {
    private int sum;
    private Map<Integer, Integer> days = new HashMap<>();

    public int getSum() {
        return sum;
    }

    public void add(String player, int day, int steps) throws IllegalArgumentException {
        if ((day < 1) || (day > 365)) {
            throw new IllegalDayException(day);
        }
        if (steps < 0) {
            throw new IllegalStepsException(steps);
        }
//        if (!days.containsKey(day)) {
//            days.put(day, 0);
//        }
//        days.put(day, steps + days.get(day));
        sum += steps;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Main.addPlayer(player, day, steps);
    }

    public Map<Integer, Integer> getMap() {
        return days;
    }

    @Override
    public int compareTo(StepsManager m2) {
        return sum - m2.getSum();
    }

    public Stream<Integer> getAllAbove(int steps) {
        List<Integer> ret = new ArrayList<>();
        for (Integer key : days.keySet()) {
            ret.add(days.get(key));
        }
        return ret.stream()
                .filter(p -> p > steps);
    }
}
