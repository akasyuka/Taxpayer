package ru.learnup.javaqa.taxpayer.HW24;

public class IllegalStepsException extends IllegalArgumentException {

    public IllegalStepsException(int input) {
        super(input + " отрицательное число шагов");
    }
}
