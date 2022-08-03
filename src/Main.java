import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//1st task
        System.out.println("Введите год, а я проверю високосный ли он.");
        int year = Integer.parseInt(reader.readLine());
        countYearIsLeap(year);
//2nd task
        System.out.println("Напишите на английском название операционной системы Вашего телефона");
        String phoneOS = reader.readLine();
        System.out.println("Введите год выпуска Вашего телефона");
        int phoneYear = Integer.parseInt(reader.readLine());
        getAppVersion(phoneOS, phoneYear);
//3rd task
        System.out.println("Введите расстояние до нас:");
        int clientDistance = Integer.parseInt(reader.readLine());
        countDeliveryDays(clientDistance);
        reader.close();
    }

    //1st task's method
    public static void countYearIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " — високосный год!");
        } else {
            System.out.println(year + " — не високосный год!");
        }
    }

    //2nd task's method
    public static void getAppVersion(String phoneOS, int phoneYear) {
        int currentYear = LocalDate.now().getYear();
        if (phoneOS.toLowerCase().equals("ios") && phoneYear < currentYear) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке");
        } else if (phoneOS.toLowerCase().equals("ios") && phoneYear == currentYear) {
            System.out.println("Установите последнюю версию приложения для iOS по ссылке");
        } else if (phoneOS.toLowerCase().equals("android") && phoneYear < currentYear) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        } else if (phoneOS.toLowerCase().equals("android") && phoneYear == currentYear) {
            System.out.println("Установите последнюю версию приложения для Android по ссылке");
        } else if (phoneOS.toLowerCase().equals("ios") || phoneOS.toLowerCase().equals("android") && phoneYear > currentYear) {
            System.out.println("Немыслимо! Телефон из будущего!");
        } else {
            System.out.println("Извините, мы не работаем с вашей ОС :(");
        }
    }

    //3rd task's method
    public static void countDeliveryDays(int distance) {
        int deliveryDays = 1;
        if (distance > 20) {
            deliveryDays++;
        }
        if (distance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
    }
}