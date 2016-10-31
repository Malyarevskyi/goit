package practic.practic2;

import java.util.Collections;

public class Dzpractic2_1 {

    public static String buildOnTheBasisOf36(String symbols) {
        String Base36 = "0123456789abcdefghijklmnopqrstuvwxyz";
        String reverseSymbols = new StringBuffer(symbols).reverse().toString().toLowerCase();
        String[] split = reverseSymbols.split(" ");
        long sumOfNumber36 = 0;
        long elementOfNumber = 0;
        long count = 0;
        long count36 = 1;

        for (String symbol : split) {
            for (char symbolChar : symbol.toCharArray()) {
                elementOfNumber = Base36.indexOf(symbolChar) * count36;
                count = elementOfNumber + count;
                System.out.println(count);
                count36 *= 36;
            }
            sumOfNumber36 += count;
            count = 0;
            count36 = 1;
        }
        return Long.toString(sumOfNumber36, 36);
    }

    public static void main(String[] args) {
        String symbolsForSum = "zzzasdf 21q";
        System.out.println("Sum of numbers36 '" + symbolsForSum + "': is =" + buildOnTheBasisOf36(symbolsForSum));
    }
}