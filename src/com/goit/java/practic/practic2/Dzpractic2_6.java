package practic.practic2;

import java.io.IOException;
import java.util.Scanner;

public class Dzpractic2_6 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = scanner.nextInt();
        System.out.println(set(num,i));
    }

    public static int set(int num, int i) {

        String binary = Integer.toBinaryString(num);
        char[] bits = binary.toCharArray();

        if ((i >= 1) && (i <= bits.length)) {
            bits[bits.length - i] = '0';
        }

        if (num < 0) {
            bits[0] = '0';
            binary = String.valueOf(bits);
            return Integer.parseInt(binary, 2)*(-1)-2;
        }

        binary = String.valueOf(bits);
        return Integer.parseInt(binary, 2);
    }
}
