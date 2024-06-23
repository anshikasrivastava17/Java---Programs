class KBit {
    static void printKthBit(long n, long k)
    {
      //mask is 1 << (k-1)
        System.out.println(
            ((n & (1 << (k - 1))) >> (k - 1)));
    }

    public static void main(String[] args)
    {
        long n = 13, k = 2;
        printKthBit(n, k);
    }
}
