package ru.netology.service;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldSuggestHundred() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 100;
        int actual = cashbackHackService.remain(900);
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldSuggestMaximum() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 999;
        int actual = cashbackHackService.remain(1);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldSuggestThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 1000;
        int actual = cashbackHackService.remain(0);
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldSuggestOne() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 1;
        int actual = cashbackHackService.remain(999);
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldSuggest999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 999;
        int actual = cashbackHackService.remain(1001);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldSuggestZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(expected, actual);

    }
}


