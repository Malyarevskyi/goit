package core.modul4.dz4_2;

import java.util.Scanner;

public class TransferTemperature {

    public static void main(String[] args) {
        try {
            System.out.println("Для преобразования значение температуры по шкале Цельсия в значение по шкале Фаренгейта введите 1 \n" +
                    "Для преобразования значение температуры по шкале Фаренгейта в значение по шкале Цельсия введите 2 \n" +
                    "Для выхода 0\n");
            Scanner scanner = new Scanner(System.in);
            int scan = scanner.nextInt();
            if (scan == 1) {
                System.out.println("Введите  температура по шкале Цельсия: ");
                double a = scanner.nextDouble();
                System.out.println("Температура по шкале Фаренгейта равна " + Calculation.CelsiusToFahrenheit(a));
            }
            if (scan == 1) {
                System.out.println("Введите  температура по шкале Фаренгейта: ");
                double a = scanner.nextDouble();
                System.out.println("Температура по шкале Цельсия равна " + Calculation.FahrenheitToCelsius(a));
            }
            if (scan == 0) {
                System.exit(0);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Ошибка!!! Введите число.");
        }
    }
}
