package core.modul5.dz5_1;

public class ArrayUtils {


    public static int maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minOfArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] bubbleSort(int[] copyArray) {

        for (int i = 1; i < copyArray.length; i++) {
            for (int j = copyArray.length - 1; j >= i; j--) {
                if (copyArray[j - 1] > copyArray[j]) {
                    int bobble = copyArray[j - 1];
                    copyArray[j - 1] = copyArray[j];
                    copyArray[j] = bobble;
                }
            }

        }
        return copyArray;
    }
}
