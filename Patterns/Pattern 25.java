class Main {
    public static void main(String[] args) {
        /*
       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
    */
    
        int n = 5; // Total rows
        for (int i = 1; i <= n; i++) {
           for(int j=1;j<=i;j++)
           {
               if(i%2!=0) //odd i
               {
                   if(j%2!=0) //odd
                   System.out.print("1");
                   else
                   System.out.print("0");
               }
               else  //even i
               {
                   if(j%2==0) //even
                   System.out.print("1");
                   else
                   System.out.print("0");
               }  
           }
            System.out.println();
        }
    }
}
