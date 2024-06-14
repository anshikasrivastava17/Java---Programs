class Main{
    public static void main(String[] args)
    {
        /*
        
        *
       ***
      *****
     *******
    *********
        
        */
        
        for(int i=1; i<=5; i++) //rows = 5
        {   
            
            for(int s=(5-i);s>=1;s--) //space is always rows - i, because i is values being printed and space is remaining
            System.out.print(" ");
                 
            for(int j=i; j>= 1; j--)    //left pyramid
            System.out.print("*"); 
            
            
            if(i>1)
            {
            for(int j=2; j<= i; j++)       //right pyramid
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}
