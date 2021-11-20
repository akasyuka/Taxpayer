package ru.learnup.javaqa.taxpayer.HW24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StepsManagerTest {

    @Test
    public void stepsLeft() {
        StepsManager test = new StepsManager();

        test.setDay(1);
        test.add(1, 100);
        int actual = test.add(1, 100);
        int expected = 800;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void stepsLeftMinus() {
        StepsManager test = new StepsManager();

        test.setDay(1);
        test.add(1, -100);
        int actual = test.add(1, 100);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void startSetDay() {
        StepsManager test = new StepsManager();
        test.setDay(2);
        int actual = test.add(2,0);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);
    }
}
