package core.modul4.dz4_1;

import java.util.Scanner;

public class CalculationOfArea {

    public static void main(String[] args) {
        try {
            System.out.println("Для расчета площади треугольника введите 1 \n" +
                    "Для расчета площади прямоугольника введите 2 \n" +
                    "Для расчета площади круга введите 3 \n" +
                    "Для выхода 0\n");
            Scanner scanner = new Scanner(System.in);
            int scan = scanner.nextInt();

            if (scan == 1) {
                System.out.println("Введите ширину треугольника: ");
                double a = scanner.nextDouble();
                System.out.println("Введите высоту треугольника: ");
                double b = scanner.nextDouble();
                System.out.println("Площадь треугольника равна " + Triangle.TriangleArea(a, b));
            }
            if (scan == 2) {
                System.out.println("Введите ширину прямоугольника: ");
                double a = scanner.nextDouble();
                System.out.println("Введите высоту прямоугольника: ");
                double b = scanner.nextDouble();
                System.out.println("Площадь прямоугольника равна " + Rectangle.RectangleArea(a, b));
            }
            if (scan == 3) {
                System.out.println("Введите радиус треугольника: ");
                double a = scanner.nextDouble();
                System.out.println("Площадь круга равна " + Circle.CircleArea(a));
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

