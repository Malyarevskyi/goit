package core.modul5.dz5_1;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        try {
            System.out.println("Для ввода масива в ручнею нажмите 1 \n" +
                    "Для генерации массива нажмите 2 \n" +
                    "Для выхода нажмите 0\n");
            Scanner scanner = new Scanner(System.in);
            int inputmenu = scanner.nextInt();
            if (inputmenu==1 || inputmenu==2 || inputmenu==0) {
                System.out.println("Введите длину массива:");
                int size = scanner.nextInt();
                int array[] = new int[size];

                if (inputmenu == 1) {
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        array[i] = scanner.nextInt();
                    }
                    System.out.print("Введенный массив элементов:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(" " + array[i]);
                    }

                } else {
                    if (inputmenu == 2) {
                        for (int i = 0; i < size; i++) {
                            array[i] = (int) (Math.random() * 100);
                        }
                        System.out.print("Рендомный массив элементов:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(" " + array[i]);
                        }
                    } else {

                        if (inputmenu == 0) {
                            System.exit(0);
                        } else {
                            System.exit(0);
                        }
                    }
                }
                System.out.println("\nМинимальный элемент массива: " + ArrayUtils.minOfArray(array)
                        + "\nМаксимальный элемент массива: " + ArrayUtils.maxOfArray(array) + "\n");

                System.out.println("Для сортировки масива методом пузырька нажмите 1 \n" +
                        "Для сортировки масива встроенным методом Array.sort() нажмите 2 \n" +
                        "Для выхода нажмите 0\n");
                int inputmenu2 = scanner.nextInt();
                int[] copyArray = array.clone();

                if (inputmenu2 == 1) {
                    ArrayUtils.bubbleSort(copyArray);
                }
                if (inputmenu2 == 2) {
                    Arrays.sort(copyArray);
                }
                if (inputmenu2 == 0) {
                    System.exit(0);
                }
                System.out.print("Отсортированный массив элементов:");
                for (int i = 0; i < size; i++) {
                    System.out.print(" " + copyArray[i]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка!!! Введите число.");

        } catch (Exception e) {
            System.out.println("Ошибка!!! Введите число.");

        }
    }
}
