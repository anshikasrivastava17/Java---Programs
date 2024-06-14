class Main{
    public static void main(String[] args)
    {
        /*
        
    4 4 4 4 4 4 4 
    4 3 3 3 3 3 4 
    4 3 2 2 2 3 4 
    4 3 2 1 2 3 4 
    4 3 2 2 2 3 4 
    4 3 3 3 3 3 4 
    4 4 4 4 4 4 4 
        
        */
        
        int originalN = 4;  //max number at the corners
        int n = 2 * (originalN - 1);  //number of rows/columns in the pattern

        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                
                // Calculate the minimum distance to the edge
                int minDistanceToEdge = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                
                // Subtract this distance from the originalN to get the correct number
                int atEveryIndex = originalN - minDistanceToEdge;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
