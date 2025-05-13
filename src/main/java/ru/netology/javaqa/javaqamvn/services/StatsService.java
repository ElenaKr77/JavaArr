package ru.netology.javaqa.javaqamvn.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long findAmountSales(long[] sales) {
        long amountSales = 0;
        for (int i = 0; i < sales.length; i++) {
            amountSales += sales[i];
        }
        return amountSales;
    }

    public long averageAmountSalesPerMonth(long[] sales) {
        long amountSales = 0;
        for (int i = 0; i < sales.length; i++) {
            amountSales += sales[i];
        }
        amountSales = amountSales / sales.length;
        return amountSales;
    }

    public int lowerAverage(long[] sales) {
        long amountSales = 0;
        for (int i = 0; i < sales.length; i++) {
            amountSales += sales[i];
        }
        amountSales = amountSales / sales.length;
        int lowerMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < amountSales) {
                lowerMonth++;
            }
        }
        return lowerMonth;

    }

    public int higherAverage(long[] sales) {
        long amountSales = 0;
        for (int i = 0; i < sales.length; i++) {
            amountSales += sales[i];
        }
        amountSales = amountSales / sales.length;
        int higherMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amountSales) {
                higherMonth++;
            }
        }
        return higherMonth;

    }


}