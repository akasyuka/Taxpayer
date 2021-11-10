package ru.learnup.javaqa.taxpayer.HW24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TaxpayerTest {

    Taxpayer boss = new Taxpayer(100000, 50000);
    @BeforeEach
    public void setup() {
        boss.getIncome();
        boss.incIncome(12000);
        boss.getExpenses();
        boss.incExpenses(8000);

    }
    @Test
    public void incIncome(){
        int actual  = boss.getIncome();
        int expected = 112000;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void incExpenses(){
        int actual  = boss.getExpenses();
        int expected = 58000;

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({"-120,0", "0,0"})
    public void incIncomeNull(int incIncome, int expectedTotal){
        int actual  = boss.incIncome(incIncome);
        int expected = expectedTotal;

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({"-150,0", "0,0"})
    public void incExpensesNull(int incExpenses, int expectedTotal){
        int actual  = boss.incExpenses(incExpenses);
        int expected = expectedTotal;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void taxIncome(){
        int actual  = boss.taxIncome();
        int expected = 6720;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void taxIncomeExpenses(){
        int actual  = boss.taxIncomeExpenses();
        int expected = 8100;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void taxIncomeExpensesZero(){
        Taxpayer badboss = new Taxpayer(100000, 120000);
        int actual  = badboss.taxIncomeExpenses();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}
