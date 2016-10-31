package practic.practic2;

public class Dzpractic2_7 {

    public static void main(String[] args) {
        String first = "110101011";
        String second = "1011101";

        System.out.println(sum(first, second));
    }

    public static String sum(String first, String second) {
        int Number1 = Integer.parseInt(first);
        int Number2 = Integer.parseInt(second);

        String result = Integer.toBinaryString(Number1 + Number2);
        return result;
    }
}
