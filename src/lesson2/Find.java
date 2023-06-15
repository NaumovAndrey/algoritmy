package lesson2;

import java.util.Arrays;

public class Find {
    public static void main(String[] args) {
        int[] arr = new int[]{
                4, 6, 5, 15, 8, 2, 44, 6, 4, 1, 7, 25
        };

        System.out.println(Arrays.toString(arr));
        Sort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
        //int num = find(arr, 15);    // O(n)
        //int num = binarySearch(arr, 40, 0, arr.length - 1);    // O(log n)
        int num = binarySearchW(arr, 44);
        System.out.println(num);
    }

    // Поиск в массиве
    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // O(log n) Бинарный поиск
    public static int binarySearch(int[] array, int value, int min_value, int max_value) {
        int midpoint;
        if (max_value < min_value) {
            return -1;
        } else {
            midpoint = (max_value - min_value) / 2 + min_value;
        }

        if (array[midpoint] < value) {
            return binarySearch(array, value, midpoint + 1, max_value);
        } else {
            if (array[midpoint] > value) {
                return binarySearch(array, value, min_value, midpoint - 1);
            } else {
                return midpoint;
            }
        }
    }

    // Бинарный поиск (через цикл)
    public static Integer binarySearchW(int[] array, int value) {
        int left = 0, right = array.length - 1;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (array[mid] > value) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (array[left] == value) return left;
        if (array[right] == value) return right;
        return null;
    }
}
