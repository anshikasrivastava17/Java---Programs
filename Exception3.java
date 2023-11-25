public class Arithmetic_ex3 {
    static float my_fn(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Should not be divide by zero");
        } else {
            float i = a / b;
            return i;
        }
    }

    public static void main(String[] args) {
        int a = 1, b = 0;
        try {
            System.out.println("TRY block entered");
            my_fn(a, b);
        } catch (ArithmeticException e) {
            System.out.println("CATCH block entered");
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of the code");
    }
}
