package ru.learnup.javaqa.taxpayer.HW24;

public class IllegalDayException extends IllegalArgumentException {

    public IllegalDayException(int input) {
        super("Дня " + input + " в году нет");
    }
}
