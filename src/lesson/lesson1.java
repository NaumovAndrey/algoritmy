package lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class lesson1 {
    public static void main(String[] args) {
//        List<Integer> availableDivider = findAvailableDivider(12);  // O(n) линейная функция *
//        for (Integer i : availableDivider) {
//            System.out.println(i);
//        }
//
//        List<Integer> availableDivider2 = findSimpleNumbers(100);  // O(n^2) малось не сходится так принято, находим все простые числа
//        for (Integer i : availableDivider2) {
//            System.out.println(i);
//        }

        AtomicInteger couter = new AtomicInteger(0);
        int fib = fib(20, couter); // O(2^n) экспоненциальная, рекурсия
        System.out.println(fib);
        System.out.println(couter.get());
    }

    public static List<Integer> findAvailableDivider(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findSimpleNumbers(int max) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < max; i++) {
            boolean simle = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) {
                    simle = false;
                    break;
                }
            }
            if (simle) {
                result.add(i);
            }
        }
        System.out.println(counter);
        return result;
    }

    public static int fib(int position, AtomicInteger counter) {
        counter.incrementAndGet();
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fib(position - 1, counter) + fib(position - 2, counter);
    }
}



