package ru.learnup.javaqa.taxpayer.HW24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class StepBattleTest {
    StepsManager manager = Mockito.mock(StepsManager.class);
    StepBattle play = new StepBattle(manager);

    @BeforeEach
    public void playInit() {
        play.addSteps(1,1,1000);
        play.addSteps(1,3,1000);
        play.addSteps(2,1,900);
        play.addSteps(2,1,1200);
    }

    @Test
    public void playWinner() {
        int expected = 2;
        int actual = play.winner();

        Assertions.assertEquals(expected,actual);
    }

//    @Test
//    public void deadInside() {
//        //int expected = play.winner();
//        verify(manager).
//    }
}
