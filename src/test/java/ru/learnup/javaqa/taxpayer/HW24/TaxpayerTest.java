package ru.learnup.javaqa.taxpayer.HW24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxpayerTest {

    @Test
    public void Test1(){
        Taxpayer boss = new Taxpayer(100000, 50000);
        int actual  = boss.getIncome();
        int expected = 100000;

        Assertions.assertEquals(expected, actual);
    }
}
