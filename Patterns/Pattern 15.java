class Main{
    public static void main(String[] args)
    {
        /*
        
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
        3 2 1 2 3 
          2 1 2         
            1        
        */
        
        //rows i , columns j
        
        //change i, static j
        
         for(int i=1; i<=4; i++) //top pyramid
        {   
            
            for(int s=(4-i);s>=1;s--) //space is always rows - i, because i is values being printed and space is remaining
            System.out.print("  ");
                 
            for(int j=i; j>= 1; j--)    //left pyramid
            System.out.print(j +" "); 
            
            
            if(i>1)
            {
            for(int j=2; j<= i; j++)       //right pyramid
                System.out.print(j + " ");
            }
           
            System.out.println();
        }
        
        for(int i=3; i>=1; i--){      //bottom pyramid
            for(int s=(4-i);s>=1;s--) 
            System.out.print("  ");
            
            for(int j=i; j>= 1; j--)
            System.out.print(j +" "); 
            
            for(int j=2; j<= i; j++)       //right pyramid
                System.out.print(j + " ");
            
            System.out.println();
            
        }
    }
}
