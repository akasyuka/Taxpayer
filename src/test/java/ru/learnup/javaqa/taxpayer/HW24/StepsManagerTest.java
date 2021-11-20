package ru.learnup.javaqa.taxpayer.HW24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StepsManagerTest {

    StepsManager test = new StepsManager();

    @BeforeEach
    public void setup() {
        test.setDay(1);
        test.setDay(2);
    }

    @Test
    public void stepsLeft() {
        test.add(1, 100);
        int actual = test.add(1, 100);
        int expected = 800;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void stepsLeftMinus() {
        test.add(1, -100);
        int actual = test.add(1, 100);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void startSetDay() {
        int actual = test.add(2, 0);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);
    }
}
