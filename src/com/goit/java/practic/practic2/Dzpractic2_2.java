package practic.practic2;

public class Dzpractic2_2 {
    public static void main(String[] args) {
        int i = 10;
        int j = 18;
        if (i > 0 && j > 0) {
            System.out.println(i + ", " + j + " average number: " + average(i, j));
        } else System.out.println("must be positive numbers");
    }

    public static int average(int i, int j) {
        int a = 0;
        a = (i + j) / 2;
        return a;
    }
}
