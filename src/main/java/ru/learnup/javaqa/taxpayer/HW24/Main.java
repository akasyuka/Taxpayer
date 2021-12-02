package ru.learnup.javaqa.taxpayer.HW24;

public class Main {
    public static void main(String[] args) {
        StepBattle battle = new StepBattle(new StepsManager(1, 0), new StepsManager(1, 0));
        battle.addSteps(1, 2, 300);
        battle.addSteps(1, 2, 300);
        battle.addSteps(2, 1, 200);
        System.out.println(battle.getSumManager1());
        System.out.println(battle.getSumManager2());
        System.out.println(battle.winner());
    }
}
