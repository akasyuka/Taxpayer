package ru.learnup.javaqa.taxpayer.HW24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class StepBattleTest {
    StepsManager manager1 = Mockito.mock(StepsManager.class);
    StepsManager manager2 = Mockito.mock(StepsManager.class);
    StepBattle battle = new StepBattle(manager1, manager2);

    @BeforeEach
    public void init() {
        manager1.add(1, 1000);
        manager1.add(3, 300);
        manager2.add(2, 200);
    }

    @Test
    public void checkAdd() {
        verify(manager1).add(3, 300);
        verify(manager2).add(2, 200);
    }

    @Test
    public void mockBattleWinner() {
        doReturn(1000).when(manager1).getSum();
        doReturn(1200).when(manager2).getSum();
        int expected = 2;
        int actual = battle.winner();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void battleWinner() {
        StepBattle battle = new StepBattle(new StepsManager(1, 0), new StepsManager(1, 0));
        battle.addSteps(1, 2, 300);
        battle.addSteps(1, 2, 300);
        battle.addSteps(2, 1, 200);

        int expected = 1;
        int actual = battle.winner();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void battleGetSum() {
        StepBattle battle = new StepBattle(new StepsManager(1, 100), new StepsManager(1, 0));
        battle.addSteps(1, 2, 300);
        battle.addSteps(1, 2, 200);

        int expected = 600;
        int actual = battle.getSumManager1();

        Assertions.assertEquals(expected, actual);
    }
}
