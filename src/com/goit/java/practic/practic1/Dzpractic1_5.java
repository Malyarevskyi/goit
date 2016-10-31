package practic.practic1;

public class Dzpractic1_5 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int index = 0;
        int[] result = new int[matrix.length * matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    result[index] = matrix[j][i];
                    index++;
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    result[index] = matrix[j][i];
                    index++;
                }
            }
        }
        System.out.print("Array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(" " + result[i]);
        }
    }
}
