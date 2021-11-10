package ru.learnup.javaqa.taxpayer.HW24;

public class Main {

    public static void main(String[] args) {
        Taxpayer boss = new Taxpayer(100000, 50000);
        System.out.println(boss.getIncome() + " " + boss.getExpenses());
        boss.incIncome(20000);
        boss.incExpenses(10000);
        System.out.println(boss.getIncome() + " " + boss.getExpenses());
        boss.calcTaxIncome();
        boss.calcTaxIncomeExpenses();
    }
}

