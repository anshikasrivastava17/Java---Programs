class Main {
    public static void main(String[] args) {
        /*
         
     *********
      *     *
       *   *
        * *
         *
         
        */
        
        int n = 5; // Number of rows

        for (int i = n; i >= 1; i--) { // Start from the widest row and go to the narrowest
            
            // Print leading spaces
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            // Print left part of the pyramid
            for (int j = 1; j <= i; j++) {
                if (j == 1  i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Print right part of the pyramid
            if (i > 1) {
                for (int j = 2; j <= i; j++) {
                    if (j == i  i == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
