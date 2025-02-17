class Main {
    public static void main(String[] args) {
        /*
         * a
         * B c
         * D e F
         * g H i J
         * k L m N o
         */

        char k = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                if (Character.isLowerCase(k))
                    k = Character.toUpperCase(k);

                else if (Character.isUpperCase(k))
                    k = Character.toLowerCase(k);

                System.out.print(k++ + " ");
            }

            System.out.println();
        }
    }
}