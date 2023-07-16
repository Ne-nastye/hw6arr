package ru.netology.stats;

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
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(long[] sales) {
        int totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public int averageSales(long[] sales) {
        int average = sumSales(sales) / 12;
        return average;
    }

    public int lowAverageSales(long[] sales) {
        int low = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                low++;
            }
        }
        return low;
    }

    public int overAverageSales(long[] sales) {
        int over = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                over++;
            }
        }
        return over;
    }

}

