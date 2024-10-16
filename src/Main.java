public class Main {
    public static void main(String[] args) {
        String divider = " -------------------------------------";

        System.out.printf("%nЗадача #%d %s%n", 1, divider);
        /*final*/
        double savingsTarget = 2_459_000;
        /*final*/
        double deposit = 15_000;
        double total = 0;
        int month = 1;
        while (total < savingsTarget) {
            total += deposit;
            System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей %n", month++, total);
        }

        System.out.printf("%nЗадача #%d %s%n", 2, divider);
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter++ + " ");
        }
        System.out.println();
        counter = 10;
        while (counter >= 1) {
            System.out.print(counter-- + " ");
        }
        System.out.println();

        System.out.printf("%nЗадача #%d %s%n", 3, divider);
        final double birthRate = 17.0 / 1000;
        final double mortalityRate = 8.0 / 1000;
        double population = 12_000_000;
        int year = 1;
        while (year <= 10) {
            population *= (1 + (birthRate - mortalityRate));
            System.out.printf("Год %d, численность населения составляет %,.3f %n", year++, population);
        }

        System.out.printf("%nЗадача #%d %s%n", 4, divider);
        savingsTarget = 12_000_000;
        final double perMonthPercent = 0.07;
        total = deposit;
        month = 1;
        while (total < savingsTarget) {
            total += total * perMonthPercent;
            System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей %n", month++, total);
        }

        System.out.printf("%nЗадача #%d %s%n", 5, divider);
        total = deposit;
        month = 1;
        while (total < savingsTarget) {
            total += total * perMonthPercent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей %n", month, total);
            }
            month++;
        }

        System.out.printf("%nЗадача #%d %s%n", 6, divider);
        total = deposit;
        month = 1;
        int monthMax = 12 * 9;
        while (month <= monthMax) {
            total += total * perMonthPercent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей %n", month, total);
            }
            month++;
        }

        System.out.printf("%nЗадача #%d %s%n", 7, divider);
        final int daysPerMonth = 31;
        int reportingDay = 3; // отчётный день, [первая, сегодня] пятница месяца
        do {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчёт %n", reportingDay);
            reportingDay += 7;
        } while (reportingDay <= daysPerMonth);

        System.out.printf("%nЗадача #%d %s%n", 8, divider);
        final int cometPeriod = 79;
        final int baseYear = 2024;
        final int yearInFuture = baseYear + 100;
        year = baseYear - 200;
        while (year <= yearInFuture) {
            if (year % cometPeriod == 0) {
                System.out.println(year);
            }
            year++;
        };
    }
}