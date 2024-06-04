/* Strictly sorted matrix where all elements of entire are sorted altogether */

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    // search in the row and also between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // matrix may be empty
        if (cols == 0)
            return new int[] {-1,-1};
        
        if (rows == 1) 
            return binarySearch(matrix,0, 0, cols-1, target); //row = 0 as there's only 1 row of index 0 and it has all columns so cols-1
    

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) {                  // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) 
                return new int[]{mid, cMid};
              
            if (matrix[mid][cMid] < target) 
                rStart = mid;
            else 
                rEnd = mid;
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target)   //checking col of 1st row
            return new int[]{rStart, cMid};
        
        if (matrix[rStart + 1][cMid] == target) //checking col of 2ns row
            return new int[]{rStart + 1, cMid};
        
        //if not found search in 4 halves
        
        if (target <= matrix[rStart][cMid - 1])  // search in 1st half
            return binarySearch(matrix, rStart, 0, cMid-1, target);
      
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) // search in 2nd half
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        
        if (target <= matrix[rStart + 1][cMid - 1]) // search in 3rd half
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        else 
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
    }
}
