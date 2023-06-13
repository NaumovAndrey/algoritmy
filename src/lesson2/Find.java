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
        int num = binarySearch(arr, 40, 0, arr.length - 1) ;    // O(log n)
        System.out.println(num);
    }

    // Поиск в массиве
    public static int find(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    // O(log n) Бинарный поиск
    public static int binarySearch(int[] array, int value, int min_value, int max_value){
        int midpoint;
        if (max_value < min_value){
            return -1;
        }else {
            midpoint = (max_value - min_value) / 2 + min_value;
        }

        if (array[midpoint] < value){
            return binarySearch(array, value, midpoint + 1, max_value);
        } else {
            if (array[midpoint] > value){
                return binarySearch(array, value, min_value, midpoint-1);
            }else {
                return midpoint;
            }
        }
    }

    //44:00 lesson2 56
}
