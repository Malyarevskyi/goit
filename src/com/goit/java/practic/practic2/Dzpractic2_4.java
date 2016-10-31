package practic.practic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dzpractic2_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        String str = input.readLine();
        System.out.println("Alphabetic numbers: " + alphabet(str));

    }


    public static String alphabet(String enc) {
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((i - 65)%10);
                } else {
                    encoded.append((i - 97)%10);
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

}
