package ru.learnup.javaqa.taxpayer.HW24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StepsManagerTest {
    StepsManager manager = new StepsManager();

    @Test
    public void stepsAddInc() {
        manager.add(1, 100);
        int actual = manager.getSum();
        int expected = 300;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stepsAddDec() {
        manager.add(1, -100);
        int actual = manager.getSum();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }
}
