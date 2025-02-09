class Main{
    public static void main(String[] args)
    {
        /*
            *      *
         *   *  *   *
       *      *        *
        
        */
        
         for(int i=1; i<=3; i++) 
        {   
            
            for(int s=(3-i);s>=1;s--) 
            System.out.print(" ");
                 
            for(int j=i; j>= 1; j--)    //left pyramid
            {
            if(j==i)
            System.out.print("*"); 
            
            else
            System.out.print(" ");  //leave hollow
            }
            
            
            if(i>1)
            {
            for(int j=2; j<= i; j++) {      //right pyramid
                
                if(j==i)
                System.out.print("*");
                
                else
                System.out.print(" ");
            }
            }
            
            /*   first complete pyramid */
            
            if(i==1)
            for(int s=1 ;s<=3;s++ )
            System.out.print(" ");
            
            if(i==2)
            System.out.print(" ");
            
            
            for(int j=i; j>=1; j--)    //left pyramid
            {
            
            if(i==3)
            j--;    
            
            if(j==i ||  i ==1)
            System.out.print("*"); 
            
            else
            System.out.print(" ");  //leave hollow
            }
            
            
            
            
            
            
            
            if(i>1)
            {
            for(int j=2; j<= i; j++) {      //right pyramid
                
                if(j==i)
                System.out.print("*");
                
                else
                System.out.print(" ");
            }
            }
            
            System.out.println();
        }
    }
}
