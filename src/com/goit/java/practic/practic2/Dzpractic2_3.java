package practic.practic2;

public class Dzpractic2_3 {
    public static void main(String[] args) {
        int i = -10;
        int j = 5;
        System.out.println(i + ", " + j + " average number: " + average(i, j));
    }

    public static int average(int i, int j) {
        int a = 0;
        a = (i + j) / 2;
        return a;
    }
}
