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

    public int SumSales(long[] sales) {
        int TotalSale = 0;
        for (long sale : sales) {
            TotalSale += sale;
        }
        return TotalSale;
    }

    public int AverageSales(long[] sales) {
        int Average = SumSales(sales) / 12;
        return Average;
    }

    public int LowAverageSales(long[] sales) {
        int Low = 0;
        for (long sale : sales) {
            if (sale < AverageSales(sales)) {
                Low++;
            }
        }
        return Low;
    }

    public int OverAverageSales(long[] sales) {
        int Over = 0;
        for (long sale : sales) {
            if (sale > AverageSales(sales)) {
                Over++;
            }
        }
        return Over;
    }

}

