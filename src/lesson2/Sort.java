package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    final static int[] buf = new int[100000];

    public static void main(String[] args) {
        int[] arr = new int[]{
                4, 6, 5, 15, 8, 2, 44, 6, 4, 1, 7, 25
        };

        //bubbleSort(arr);  // O(n^2)
        //directSort(arr);    // O(n^2)
        //insertSort(arr);    // O(n^2)
        //shakeSort(arr);     // O(n^2)
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // O(n^2) Пузырьковая сортировка
    public static void bubbleSort(int[] arr) {
        boolean finish;
        //int cnt = 0;
        do {
            finish = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    finish = false;
                    //cnt++;
                }
            }
        } while (!finish);
        //System.out.println(cnt);
    }

    // // O(n^2) Шейкерная сортировка
    public static void shakeSort(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i; j < array.length - i - 1; i++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            for (int j = array.length - i - 1; j > i; i--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // O(n^2) Сортировка выбором
    public static void directSort(int[] array) {
        //int cut = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                    //cut++;
                }
            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
        //System.out.println(cut);
    }

    // // O(n^2) Сортироака вставкой
    public static void insertSort(int[] array) {
        //int cnt = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    // cnt++;
                }
            }
        }
        //System.out.println(cnt);
    }

    // Сортировка слиянием
    static public void mergeSort(int[] Array) {
        mergeSort(Array, 0, Array.length - 1);
    }

    static private void mergeSort(int[] Array, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(Array, left, mid);
        mergeSort(Array, mid + 1, right);

        //Слияние
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (Array[i] < Array[j]) {
                buf[k] = Array[i];
                i++;
            } else {
                buf[k] = Array[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            buf[k++] = Array[i++];
        }

        while (j <= right) {
            buf[k++] = Array[j++];
        }

        for (int q = left; q <= right; q++)
            Array[q] = buf[q];
    }

}


