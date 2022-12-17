package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {



    @Test
    public void shouldSuggestHundred() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldSuggestMaximum() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1);
        int expected = 999;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldSuggestThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldSuggestOne() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldSuggest999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldSuggestZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }
}
