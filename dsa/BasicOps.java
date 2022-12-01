import java.util.Arrays;

public class BasicOps {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 2, 9 };
        float arrf[] = { 22.5f, 18.9f, 10.33f, 80.2f, 19.2f };
        // int pos = 2;
        // int element = 10;
        // insertion(arr, pos, element);
        // deletion(arr, pos);
        // sumOfFloats(arrf);
        add2DArr();
    }

    static void insertion(int[] arr, int pos, int element) {
        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;
        System.out.println(Arrays.toString(arr));
    }

    static void deletion(int[] arr, int pos) {
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println(Arrays.toString(arr));
    }

    // sum of floats
    static void sumOfFloats(float[] arr) {
        float sum = 0;
        for (float f : arr) {
            sum += f;
        }
        System.out.println("Sum of float is " + sum);
    }

    // addition of 2d arrays
    static void add2DArr() {
        int[][] matri1 = {
                { 1, 2, 3 },
                { 4, 6, 8 },
                { 9, 10, 7 },
        };

        int[][] matri2 = {
                { 10, 2, 3 },
                { 4, 5, 20 },
                { 9, 12, 7 },
        };

        int[][] res = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
        };

        for (int i = 0; i < matri1.length; i++) {
            for (int j = 0; j < matri1[i].length; j++) {
                res[i][j] = matri1[i][j] + matri2[i][j];
            }
        }

        for (int[] is : res) {
            System.out.println(Arrays.toString(is));
        }

    }
}
