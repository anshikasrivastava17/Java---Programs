class Main{
    public static void main(String[] args)
    {
        /*
        1         
        23
        456 
        78910 */
        
        //rows i , columns j
        
        //change i, static j
        int k=0;
        for(int i=1; i<=4; i++)
        {
            for(int j=i; j>= 1; j--)
            {
                System.out.print(++k);
            }
            System.out.println();
        }
    }
}
