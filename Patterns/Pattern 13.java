class Main{
    public static void main(String[] args)
    {
        /*
        1         
        11
        111 
        1111
        11111 */
        
        //rows i , columns j
        
        //change i, static j
        
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j>= 1; j--)
            {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
