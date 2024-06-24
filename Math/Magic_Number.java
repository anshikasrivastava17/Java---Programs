/* Find nth magic number */
public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;

        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;  //last bit
            n = n >> 1;
            ans += last * base;
            base = base * 5;  //5 ^0 then 5 ^ 1 and so on
        }
        System.out.println(ans);
    }
}
