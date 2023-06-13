package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{
                4, 6, 5, 15, 8, 2, 44, 6, 4, 1, 7, 25
        };

        //bubbleSort(arr);  // O(n^2)
        //directSort(arr);    // O(n^2)
        //insertSort(arr);    // O(n^2)
        ss(arr);
        System.out.println(Arrays.toString(arr));
    }
    // O(n^2) Пузырьковая сортировка
    public static void bubbleSort(int[] arr){
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
        }while (!finish);
        //System.out.println(cnt);
    }

    // Шейкерная сортировка
    public static void ss(int[] array){

    }

    // O(n^2) Сортировка выбором
    public static void directSort(int[]array){
        //int cut = 0;
        for (int i = 0; i < array.length - 1; i++){
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minPosition]){
                    minPosition = j;
                    //cut++;
                }
            }
            if (i != minPosition){
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
        //System.out.println(cut);
    }

    // // O(n^2) Сортироака вставкой
    public static void insertSort(int[] array){
        //int cnt = 0;
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                   // cnt++;
                }
            }
        }
        //System.out.println(cnt);
    }


}
