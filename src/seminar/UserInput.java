package seminar;

import java.util.Scanner;

public class UserInput {

    public static <T> Object textFromTheUser(String description){
        Scanner in = new Scanner(System.in);
        System.out.print(description);

        return in.next();
    }
}
