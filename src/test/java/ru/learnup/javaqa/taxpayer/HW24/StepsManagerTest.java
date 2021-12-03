package ru.learnup.javaqa.taxpayer.HW24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StepsManagerTest {
    StepsManager manager = new StepsManager();

    @Test
    public void stepsAddInc() {
        manager.add(1, 100);
        manager.add(1, 100);
        int actual = manager.getSum();
        int expected = 200;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void compareToSum() {
        StepsManager m1 = new StepsManager();
        m1.add(4, 300);
        m1.add(5, 300);
        StepsManager m2 = new StepsManager();
        m2.add(1, 300);
        m2.add(2, 100);
        int expected = 200;
        int actual = m1.compareTo(m2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void exceptionDayAbove() {
        StepsManager m = new StepsManager();
        Assertions.assertThrows(IllegalDayException.class, () -> m.add(1000, 100));
    }

    @Test
    public void exceptionDayUnder() {
        StepsManager m = new StepsManager();
        Assertions.assertThrows(IllegalDayException.class, () -> m.add(-100, 100));
    }

    @Test
    public void exceptionSteps() {
        StepsManager m = new StepsManager();
        Assertions.assertThrows(IllegalStepsException.class, () -> m.add(10, -100));
    }
}
