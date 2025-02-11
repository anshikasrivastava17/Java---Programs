class Main {
    public static void main(String[] args) {
        /*
           *        *
                 
           * *    * *
           *  *  *  *
           *      *
           *      *
           *  *  *  *
           * *    * *
                 
           *        *
        */


      //hollow butterfly
        int n = 5; 

        // Upper half
        for (int i = 1; i <= n; i++) {
            
            // Left part
            for (int j = 1; j <= i; j++) {
                if (j == 1  j == i) 
                    System.out.print("*");
                else 
                    System.out.print(" ");
                
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) 
                System.out.print(" ");
            

            // Right part
            for (int j = 1; j <= i; j++) {
                if (j == 1  j == i) 
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }

            System.out.println();
        }


        // Lower half
        for (int i = n; i >= 1; i--) {
            
            // Left part
            for (int j = 1; j <= i; j++) {
                if (j == 1  j == i) 
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) 
                System.out.print(" ");
            

            // Right part
            for (int j = 1; j <= i; j++) {
                if (j == 1  j == i) 
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
