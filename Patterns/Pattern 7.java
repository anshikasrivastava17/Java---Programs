class Main{
    public static void main(String[] args)
    {
        /*
        _ _ _ _ 1
        _ _ _ 1 2
        _ _ 1 2 3
        _ 1 2 3 4
        1 2 3 4 5
        */
        
        //rows i , columns j
        
        //change i, static j
        int k=0;
        for(int i=1; i<=5; i++) //rows = 5
        {   
            
            for(int s=(5-i);s>=1;s--) //space is always rows - i, because i is values being printed and space is remaining
            System.out.print("_ ");
                
            for(int j=1; j<= i; j++)
            System.out.print(j);
            
            System.out.println();
        }
    }
}
