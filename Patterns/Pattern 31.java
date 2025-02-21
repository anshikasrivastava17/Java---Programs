class Main {
    public static void main(String[] args) {
        /*
         * E D C B A
         * D C B A
         * C B A
         * B A
         * A
         */

        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = i; j >= 'A'; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}