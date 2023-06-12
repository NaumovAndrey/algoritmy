package seminar;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        String num = (String) UserInput.textFromTheUser("Введите число: ");
//        int sumNum = linearSumOfNumbers.metodCalculation(Integer.parseInt(num)); // task1 seminar1, O(n)
        ArrayList<Integer> pn = PrimeNumbers.sieveOfEratosthenes(Integer.parseInt(num)); // O(2n)
        Print.printConsole(pn);

    }
}
// seminar1 27:57 task2 (PrimeNumbers)