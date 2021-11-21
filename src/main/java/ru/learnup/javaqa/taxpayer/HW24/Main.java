package ru.learnup.javaqa.taxpayer.HW24;

public class Main {
    public static void main(String[] args) {
        StepsManager list = new StepsManager();

        //list.setDay(1);
        System.out.println(list.add(1, 100));
        System.out.println(list.add(1, 200));

        //list.setDay(2);
        System.out.println(list.add(2, 50));
        System.out.println(list.add(2, 400));
    }
}
