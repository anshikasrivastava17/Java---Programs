/* reset means change kth bit to 0 if not already, i.e. if it is already 0 let it be 0 */
class ResetBit
{
     
    // Function to clear the kth bit of n 
    static int clearBit(int n, int k) 
    { 
        return (n & (~(1 << (k - 1))));   //complement of mask
    } 
  
    public static void main (String[] args) 
    { 
        int n = 5, k = 1; 
     
        System.out.println(clearBit(n, k)); 
    } 
}
