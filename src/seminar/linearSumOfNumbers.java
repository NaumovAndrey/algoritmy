package seminar;

public class linearSumOfNumbers {
    public static int metodCalculation(int num){
        int temp = 0;
        for(int i = 1; i<= num; i++){
            temp += i;
        }
        return temp;
    }
}
