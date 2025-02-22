class Main {
    public static void main(String[] args) {
        /*
         *****
         * *
         * *
         * *
         *****
         */

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int s = i; s < n; s++)
                System.out.print(" ");

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) // print on boundaries
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}