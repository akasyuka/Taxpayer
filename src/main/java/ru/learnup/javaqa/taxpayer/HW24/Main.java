package ru.learnup.javaqa.taxpayer.HW24;

import ru.learnup.javaqa.taxpayer.HW24.entities.Post;


public class Main {
    private static DbHelper helper = new DbHelper();

    public static void main(String[] args) {
        StepBattle battle = new StepBattle(new StepsManager(), new StepsManager());
        System.out.println("До");
        printAllPlayers();
        System.out.println("После добавления");
        battle.addSteps("1", 12, 122);
        printAllPlayers();
    }

    static void deleteRaw() {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите id...");
//        int id = parseInt(scanner.nextLine());
//        helper.deletePlayer(id);
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
