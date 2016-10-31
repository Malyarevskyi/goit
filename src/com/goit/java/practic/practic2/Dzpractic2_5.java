package practic.practic2;


import java.io.IOException;
import java.util.Scanner;

public class Dzpractic2_5 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        System.out.println(countBit(str));
    }

    public static int countBit(int bit) {
        int result = 0;
        String binary = Integer.toBinaryString(bit);

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }
}
