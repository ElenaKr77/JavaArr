package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindBetweenEnds() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBetweenResults() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        long expectedMonth = 8;
        long actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindAmountSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        long expectedSales = 180;
        long actualSales = service.findAmountSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        long expectedAverage = 15;
        long actualAverage = service.averageAmountSalesPerMonth(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindLowerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        int expectedLowerMonth = 5;
        int actualLowerMonth = service.lowerAverage(sales);
        Assertions.assertEquals(expectedLowerMonth, actualLowerMonth);

    }

    @Test
    public void shouldFindHigherMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        int expectedHigherMonth = 5;
        int actualHigherMonth = service.higherAverage(sales);
        Assertions.assertEquals(expectedHigherMonth, actualHigherMonth);
    }

}
