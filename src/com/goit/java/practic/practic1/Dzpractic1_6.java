package practic.practic1;

public class Dzpractic1_6 {
    public static void main(String[] args) {
        int[][] matrix = {  {1, 2, 3, 4, 5},
                            {6, 7, 8, 9, 10},
                            {11, 12, 13, 14, 15},
                            {16, 17, 18, 19, 20},
                            {21, 22, 23, 24, 25}};
        int index = 0;
        int[] result = new int[matrix.length * matrix[0].length];
        int widthstartpoint = 0;
        int heightstartpoint = 0;
        int height = matrix.length;
        int width = matrix[widthstartpoint].length;

        while (true) {
            for (int x = widthstartpoint; x < width; x++) {
                result[index] = matrix[heightstartpoint][x];
                index++;
            }
            if (index == result.length)
                break;

            heightstartpoint++;
            for (int y = heightstartpoint; y < height; y++) {
                result[index] = matrix[y][width - 1];
                index++;
            }
            if (index >= result.length)
                break;

            width--;
            for (int x = width - 1; x >= widthstartpoint; x--) {
                result[index] = matrix[height - 1][x];
                index++;
            }
            height--;
            if (index >= result.length)
                break;

            for (int y = height - 1; y >= heightstartpoint; y--) {
                result[index] = matrix[y][widthstartpoint];
                index++;
            }
            widthstartpoint++;
            if (index >= result.length)
                break;
        }

        System.out.print("Array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(" " + result[i]);
        }
    }
}
