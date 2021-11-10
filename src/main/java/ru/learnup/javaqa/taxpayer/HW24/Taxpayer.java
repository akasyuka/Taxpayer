package ru.learnup.javaqa.taxpayer.HW24;

public class Taxpayer {
    private int income;
    private int expenses;
    private int taxincome = 0;
    private int taxincomeexpenses = 0;

    public Taxpayer(int income, int expenses) {
        this.income = income;
        this.expenses = expenses;
    }

    public int getIncome() {
        return income;
    }

    public int getExpenses() {
        return expenses;
    }

    public void incIncome(int inc) {
        if (inc > 0) {
            income = income + inc;
        }
    }

    public void incExpenses(int inc) {
        if (inc > 0) {
            expenses = expenses + inc;
        }
    }

    public void calcTaxIncome() {
        taxincome = income * 6 / 100;
        System.out.println(taxincome);
        taxincome = 0;
    }

    public void calcTaxIncomeExpenses() {
        taxincomeexpenses = (income - expenses) * 15 / 100;
        System.out.println(taxincomeexpenses);
        taxincomeexpenses = 0;
    }
}

