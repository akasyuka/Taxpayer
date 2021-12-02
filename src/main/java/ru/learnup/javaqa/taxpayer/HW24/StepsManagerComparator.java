package ru.learnup.javaqa.taxpayer.HW24;

import java.util.Comparator;

public class StepsManagerComparator implements Comparator<StepsManager> {
    private int minSteps;
    private int count1;
    private int count2;

    public StepsManagerComparator(int minSteps) {
        this.minSteps = minSteps;
    }

    @Override
    public int compare(StepsManager o1, StepsManager o2) {
        for (Integer key : o1.getMap().keySet()) {
            if (o1.getMap().get(key) > minSteps) {
                count1++;
            }
        }
        for (Integer key : o2.getMap().keySet()) {
            if (o2.getMap().get(key) > minSteps) {
                count2++;
            }
        }
        return count1 - count2;
    }
}
