package ru.learnup.javaqa.taxpayer.HW24;

public class Main {
    public static void main(String[] args) {
        StepBattle play = new StepBattle();
        play.addSteps(1,1,1000);
        play.addSteps(1,3,1000);
        play.addSteps(2,1,900);
        play.addSteps(2,2,900);
        System.out.println(play.winner());
    }
}
