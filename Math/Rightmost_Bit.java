/* Find position of right most set bit */

//Method 1


class Rightmost {
    static int getFirstSetBitPos(int n)
    {
        return (int)((Math.log10(n & -n)) / Math.log10(2)) + 1; // log2 of the no, will get (position – 1)
    }
  
    public static void main(String[] args)
    {
        int n = 10;
        System.out.print(getFirstSetBitPos(n));
    }
}

/* Method 2
class Rightmost {
    static int PositionRightmostSetbit(int n)
    {
        int position = 1;
        int m = 1;
 
        while ((n & m) == 0) {
            // left shift
            m = m << 1;
            position++;
        }
        return position;
    }
}
 */
