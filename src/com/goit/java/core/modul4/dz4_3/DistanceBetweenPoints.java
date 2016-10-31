package core.modul4.dz4_3;

import java.util.Scanner;

public class DistanceBetweenPoints {


    public static void main(String[] args) {
        try {
            System.out.println("Для вычисления расстояния между точками введети их координаты");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите координаты первой точки");
            System.out.println("Введите значение по шкале х");
            double x1 = scanner.nextDouble();
            System.out.println("Введите значение по шкале у");
            double y1 = scanner.nextDouble();
            System.out.println("Введите координаты второй точки");
            System.out.println("Введите значение по шкале х");
            double x2 = scanner.nextDouble();
            System.out.println("Введите значение по шкале у");
            double y2 = scanner.nextDouble();

            double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            System.out.println("Расстояние между точками равно: " + a);
        }
        catch (NumberFormatException e){
            System.out.println("Ошибка!!! Введите число.");
        }
    }
}
