class Main {
    public static void main(String[] args) {
        /*
        
         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
         
         
        */
          for(int i=1; i<=5; i++)
        {   
            
            for(int s=(5-i);s>=1;s--)
            System.out.print(" ");
                 
            for(int j=i; j>= 1; j--)    //left pyramid
            {
            if(j==i ||  i ==1)
            System.out.print("*"); 
            
            else
            System.out.print(" ");  //leave hollow
            }
            
            
            if(i>1)
            {
            for(int j=2; j<= i; j++) {      //right pyramid
                
                if(j==i)
                System.out.print("*");
                
                else
                System.out.print(" ");
            }
            }
           
            System.out.println();
        }
        
        
        
        
        
        
        
        int n = 5; // Number of rows

        for (int i = n; i >= 1; i--) { // Lower pyramid
            
            
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            //left part of the pyramid
            for (int j = 1; j <= i; j++) {
                if (j == 1) 
                    System.out.print("*");
                 else 
                    System.out.print(" ");
                
            }

            //right part of the pyramid
            if (i > 1) {
                for (int j = 2; j <= i; j++) {
                    if (j == i) 
                        System.out.print("*");
                    else 
                        System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
    }
}
