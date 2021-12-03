package ru.learnup.javaqa.taxpayer.HW24;

public class Main {
    public static void main(String[] args) {
        //HW26
        StepBattle battle = new StepBattle(new StepsManager(), new StepsManager());
        battle.addSteps(1, 2, 300);
        battle.addSteps(1, 2, 300);
        battle.addSteps(2, 1, 200);
        System.out.println(battle.getSumManager1());
        System.out.println(battle.getSumManager2());
        System.out.println(battle.winner());
        //HW27
        StepsManager m1 = new StepsManager();
        m1.add(1, 100);
        m1.add(2, 301);
        m1.add(3, 100);
        m1.add(4, 302);
        m1.add(5, 303);
        StepsManager m2 = new StepsManager();
        m2.add(1, 300);
        m2.add(2, 100);
        System.out.println(m1.compareTo(m2));
        StepsManagerComparator comp = new StepsManagerComparator(200);
        System.out.println(comp.compare(m1, m2));
        //HW28
        m1.getAllAbove(200)
                .forEach(System.out::println);
    }
}
