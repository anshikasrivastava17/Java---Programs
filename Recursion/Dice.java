//given a 6 faced dice, return all possible ways a given number can be obtained.
//eg if number or target is 4 then possible ways {1111,121,13,22,4 and so on....}
import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(dice("", 4));
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }
