package ru.learnup.javaqa.taxpayer.HW24;


public class StepBattle {

    private StepsManager manager1;
    private StepsManager manager2;

    public StepBattle(StepsManager manager1, StepsManager manager2) {
        this.manager1 = manager1;
        this.manager2 = manager2;
    }

    public int getSumManager1() {
        int sum;
        sum = manager1.getSum();
        return sum;
    }

    public int getSumManager2() {
        int sum;
        sum = manager2.getSum();
        return sum;
    }


    public void addSteps(int player, int day, int steps) {
        if (player == 1) {
            manager1.add(day, steps);
        }
        if (player == 2) {
            manager2.add(day, steps);
        }
    }

    public int winner() {
        if (manager1.getSum() > manager2.getSum()) {
            return 1;
        } else if (manager1.getSum() < manager2.getSum()){
            return 2;
        } else {
            return 0;
        }
    }
}

