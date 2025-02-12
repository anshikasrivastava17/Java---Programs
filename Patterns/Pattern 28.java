class Main {
    public static void main(String[] args) {
        /*
            1 2 3 4  17 18 19 20
              5 6 7  14 15 16
                8 9  12 13
                  10 11
        */

         int k=0,l=17;

        for(int i=4;i>=1;i--){
            
            if(i!=4)  //avoid first time
            l=l-(2*i);
            for(int s=(4-i);s>=1;s--)
               System.out.print("  ");
            

            for(int j=i;j>=1;j--)
                System.out.print(++k +" ");
                
            if(i!=1)
            System.out.print(" ");
            
            /* triangle 2 */
            
          
            for(int j=1;j<=i;j++)
            System.out.print(l++ +" ");
            
            l=l-1;
            
            
            System.out.println();
        }
    }
    
}
