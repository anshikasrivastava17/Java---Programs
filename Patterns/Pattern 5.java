class Main{
    public static void main(String[] args)
    {
        /*
        
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
        
        */
        
        //rows i , columns j
        
        //change i, static j
        
        for(int i=1; i<=4; i++)  //upper pyramid
        {
            for(int j=1; j<= i; j++)
                System.out.print("*");
            System.out.println();
        }
        
         for(int i=5; i>=1; i--) //lower pyramid
        {
            for(int j=i; j>= 1; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
