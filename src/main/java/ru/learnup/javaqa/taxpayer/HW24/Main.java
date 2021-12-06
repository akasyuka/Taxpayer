package ru.learnup.javaqa.taxpayer.HW24;

import lombok.experimental.Helper;
import ru.learnup.javaqa.taxpayer.HW24.entities.Post;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    private static final String DB_URL = "jdbc:mysql://localhost:3306";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";
    private static DbHelper helper = new DbHelper(DB_URL, DB_USER, DB_PASS);

    public static void main(String[] args) {
//        //HW26
//        StepBattle battle = new StepBattle(new StepsManager(), new StepsManager());
//        battle.addSteps(1, 2, 300);
//        battle.addSteps(1, 2, 300);
//        battle.addSteps(2, 1, 200);
//        System.out.println(battle.getSumManager1());
//        System.out.println(battle.getSumManager2());
//        System.out.println(battle.winner());
//        //HW27
//        StepsManager m1 = new StepsManager();
//        m1.add(1, 100);
//        m1.add(2, 301);
//        m1.add(3, 100);
//        m1.add(4, 302);
//        m1.add(5, 303);
//        StepsManager m2 = new StepsManager();
//        m2.add(1, 300);
//        m2.add(2, 100);
//        System.out.println(m1.compareTo(m2));
//        StepsManagerComparator comp = new StepsManagerComparator(200);
//        System.out.println(comp.compare(m1, m2));
//        //HW28
//        m1.getAllAbove(200)
//                .forEach(System.out::println);
//      //HW30
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        printAllPlayers();
//        addPlayerAndPrintAll();
        StepBattle battle = new StepBattle(new StepsManager(), new StepsManager());
        System.out.println("До:");
        printAllPlayers();
        System.out.println("После добавления:");
        battle.addSteps("1", 2, 300);
        battle.addSteps("2", 4, 500);
        battle.addSteps("2", 2, 600);
        printAllPlayers();
        System.out.println("После удаления:");
        deleteRaw();
        printAllPlayers();
    }

    static void deleteRaw() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id...");
        int id = parseInt(scanner.nextLine());
        helper.deletePlayer(id);
    }
    static void addPlayer(String player, int day, int steps) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите плеера String...");
//        final String player = scanner.nextLine();
//        System.out.println("Введите день int...");
//        final Integer day = Integer.parseInt(scanner.nextLine());
//        System.out.println("Введите шаги int...");
//        final Integer steps = Integer.valueOf(scanner.nextLine());
//        Integer DAYS = Integer.valueOf(day);
//        Integer STEPS = Integer.valueOf(steps);
//        printAllPlayers();
        helper.addPlayer(new Post(player,day,steps));
    }
    static void printAllPlayers() {
        for (Post post : helper.getAllPlayers()) {
            System.out.println(post);
        }
    }
}
