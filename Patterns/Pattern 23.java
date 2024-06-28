class Main {
    public static void main(String[] args) {
        /*
        
        
       *        *
             
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
             
       *        *
       
       
        */
        
      //refer pattern 22 and invert it
        int n = 5; // Total rows in one half


        for (int i = n - 1; i > 0; i--) {
                                         // Left side stars
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }
            // Right side stars
            for (int j = n; j > i; j--) {
                System.out.print("*"); 
            }
            System.out.println();
        }

        // Upper half



        for (int i = 0; i < n; i++) {
            // Left side stars
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }
            // Right side stars
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        
    }
}
