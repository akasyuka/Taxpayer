package ru.learnup.javaqa.taxpayer.HW24;

import java.util.ArrayList;
import java.util.List;


public class StepBattle {
    private int sum1;
    private int sum2;
    private List<StepsManager> player1 = new ArrayList<>();
    private List<StepsManager> player2 = new ArrayList<>();

    public void addSteps(int player, int day, int steps) {
        if (player == 1) {
            player1.add(new StepsManager(day, steps));
        }
        if (player == 2) {
            player2.add(new StepsManager(day, steps));
        }

    }

    public int winner() {
        for (StepsManager day : player1) {
            sum1 += day.getSum();
        }
        for (StepsManager day : player2) {
            sum2 += day.getSum();
        }
        if (sum1 > sum2) {
            return 1;
        } else {
            return 2;
        }
    }

}

