package ru.netology.stats;

public class StatsService {
    public int amountOfAllSales(int[] sales) {    //сумма всех продаж

    int amount = 0;  //переменная для суммы продажи
    for (int sale : sales) {
        amount = amount + sale;
    }

    return amount;
}

    public double midSales(int[] sales) {   //средняя сумма продаж в месяц
        double middle = amountOfAllSales(sales);
        double middleMonth = (double) middle / sales.length;

        return middleMonth;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int SalesMinMid(int[] sales) {
        double middleMonth = midSales(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < middleMonth) {
                month = month + 1;
            }
        }
    return month;
    }

    public int SalesMaxMid(int[] sales) {
        double middleMonth = midSales(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > middleMonth) {
                month = month + 1;
            }
        }
        return month;
    }

}
