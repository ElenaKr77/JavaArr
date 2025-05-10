package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindBetweenEnds() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBetweenResults() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindAmountSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        int expectedSales = 180;
        int actualSales = service.findAmountSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }
    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        int expectedAverage = 15;
        int actualAverage = service.averageAmountSalesPerMonth(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }
    @Test
    public void shouldFindLowerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        int expectedLowerMonth = 5;
        int actualLowerMonth = service.lowerAverage(sales);
        Assertions.assertEquals(expectedLowerMonth, actualLowerMonth);

    }
    @Test
    public void shouldFindHigherMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 22, 7, 14, 14, 16};
        int expectedHigherMonth = 5;
        int actualHigherMonth = service.higherAverage(sales);
        Assertions.assertEquals(expectedHigherMonth, actualHigherMonth);
    }

}
