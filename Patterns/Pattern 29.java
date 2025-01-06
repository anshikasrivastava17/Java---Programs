class Main {
    public static void main(String[] args) {
        /*
         * E
         * D E
         * C D E
         * B C D E
         * A B C D E
         */

        // rows i , columns j

        // change i, static j

        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = i; j <= 'E'; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}