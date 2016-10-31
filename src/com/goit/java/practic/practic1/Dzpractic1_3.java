package practic.practic1;

import java.util.Scanner;

public class Dzpractic1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int size = scanner.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print("Rendom array");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("\nFirst odd number: "+ oddNumber(array));
    }

    public static int oddNumber(int[] array) {
        int odd=array[1];
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd = array[i];
                break;
            }
            else {
                odd= -1;
            }
        }
        return odd;
    }
}
