import java.time.LocalDate;

public class Lesson5_2 {
    public static void main(String[] args) {
        checkYear(2004);
        int currentYear = LocalDate.now().getYear();
        checkSystem(currentYear);
        System.out.println(checkDeliveryTime(30));
    }

    public static void checkYear(int year) {
        System.out.println("1 Task");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
        System.out.print("\n");
    }

    public static void checkSystem(int year) {
        System.out.println("2 Task");
        int currentYear = LocalDate.now().getYear();
        int clientOS = 0;
        if (clientOS == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && year == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && year == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.print("\n");
    }

    public static String checkDeliveryTime(int distance) {
        System.out.println("3 Task");
        if (distance < 20) {
            return "Потребуется дней: " + 1;
        } else if (distance >= 20 && distance < 60) {
            return "Потребуется дней: " + 2;
        } else if (distance >= 60 && distance <= 100) {
            return "Потребуется дней: " + 3;
        } else {
            return "Доставки нет.";
        }
    }
}
