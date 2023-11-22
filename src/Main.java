import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();


    }
    static public void task1() {
        System.out.println("Задача 1");
        int year1 = 2001;
        int year2 = 2004;
        printYearType(year2);
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
    public static void printYearType (int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год не високосный");
        }

        System.out.println( );
    }
    public static void task2() {
        System.out.println("Задача 2");

        int os = 1;
        int phoneYear = 2015;
        printMessage(os, phoneYear);
    }
    public static void printMessage(int os, int phoneYear) {
        String message = getMessage(os, phoneYear);
        System.out.println(message);
    }
    public static String getMessage(int os, int phoneYear) {
        if (os == 0 && phoneYear >= 2015) {
            return "Установите версию приложения iOS по ссылке";
        } else if (os == 1 && phoneYear >= 2015) {
            return "Установите версию приложения Android по ссылке";
        } else if (os == 0 && phoneYear < 2015) {
            return "Установите облегченную версию приложения iOS по ссылке";
        } else if (os == 1 && phoneYear < 2015) {
            return "Установите облегченную версию приложения Android по ссылке";
        } else {
            return "Не удалось определить версию приложения";

        }

    }
    static public void task3() {
        System.out.println("Задача 3");
        deliveryDays(95);

    }
    public static void deliveryDays (int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDay + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDay + 2));
        } else {
            System.out.println("Доставка невозможна");
        }

        System.out.println( );
    }

}