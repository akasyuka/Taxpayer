package ru.learnup.javaqa.taxpayer.HW24;

public class Taxpayer {
    private int income;
    private int expenses;
    private int taxincome;
    private int taxincomeexpenses;

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

    public int incIncome(int inc) {
        if (inc > 0) {
            income = income + inc;
            return income;
        } else {
            return 0;
        }
    }

    public int incExpenses(int inc) {
        if (inc > 0) {
            expenses = expenses + inc;
            return expenses;
        } else {
            return 0;
        }
    }

    public int taxIncome() {
        taxincome = 0;
        taxincome = income * 6 / 100;
        return taxincome;
    }

    public int taxIncomeExpenses() {
        taxincomeexpenses = 0;
        taxincomeexpenses = (income - expenses) * 15 / 100;
        if (taxincomeexpenses > 0) {
            return taxincomeexpenses;
        } else {
            return 0;
        }
    }
}

