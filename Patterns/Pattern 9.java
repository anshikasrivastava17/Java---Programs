class Main{
    public static void main(String[] args)
    {
        /*
        _ _ 1 _ _
        _ 2 3 4 _
        5 6 7 8 9
        */
        
        //rows i , columns j
        
        //change i, static j
        
        int k = 0;
        for(int i=1; i<=3; i++) //rows = 5
        {   
            
            for(int s=(3-i);s>=1;s--) //space is always rows - i, because i is values being printed and space is remaining
            System.out.print("_ ");
                
            for(int j=1; j<= i; j++)
            System.out.print(++k +" " );
            
            for(int j=1; j<= i-1; j++)
            System.out.print(++k +" ");
            
            for(int s=(3-i);s>=1;s--) //space is always rows - i, because i is values being printed and space is remaining
            System.out.print("_ ");
            
            System.out.println(); //for changing rows
        }
    }
}
