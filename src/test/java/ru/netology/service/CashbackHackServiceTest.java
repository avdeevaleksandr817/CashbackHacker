package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldMissing50Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 950;
        int expected = 50;

        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }
    @Test
    public void shouldAmountReached() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

}