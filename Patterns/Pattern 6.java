class Main{
    public static void main(String[] args)
    {
        /*
        
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
        
        */
        
        for(int i=1; i<=5; i++)  //upper pyramid
        {
            for(int s=(5-i);s>=0; s-- )   //space is rows - i
                System.out.print(" ");
            for(int j=1; j<= i; j++)
                System.out.print("* ");
            System.out.println();
        }
        
         for(int i=4; i>=1; i--) //lower pyramid
        {
            for(int s=(5-i);s>=0; s-- )   //space is rows - i
                System.out.print(" ");
                
            for(int j=i; j>= 1; j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
