//for example if number entered is 7337536 and occurence of 3 has to be found then it is 3
import java.util.*;

public class Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Enter number whose occurence to be found");
        int r = sc.nextInt();
        int c = 0;
        while (n != 0) {
            int d = n % 10;
            if (d == r)
                c++;
            n /= 10;
        }
        System.out.println("It occurs " + c + "times");
    }
}
