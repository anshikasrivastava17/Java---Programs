class Main{
    public static void main(String[] args)
    {
        /*
        _ _ 1 _ _
        _ 1 1 1 _
        1 1 1 1 1
        */
        
        //rows i , columns j
        
        //change i, static j
   
        for(int i=1; i<=3; i++) //rows = 5
        {   
            
            for(int s=(3-i);s>=1;s--) //space is always rows - i, because i is values being printed and space is remaining
            System.out.print("_ ");
                
            for(int j=1; j<= i; j++)
            System.out.print("1 ");
            
            for(int j=1; j<= i-1; j++)
            System.out.print("1 ");
            
            for(int s=(3-i);s>=1;s--) //space is always rows - i, because i is values being printed and space is remaining
            System.out.print("_ ");
            
            System.out.println(); //for changing rows
        }
    }
}
