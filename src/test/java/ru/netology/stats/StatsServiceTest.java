package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void SummAll() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 180;
        int actual = service.amountOfAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MiddleSummAll() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        double expected = 15;
        double actual = service.midSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMidMonthSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.SalesMinMid(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMidMonthSales() {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.SalesMaxMid(sales);

        Assertions.assertEquals(expected, actual);
    }

}

