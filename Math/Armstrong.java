class Solution {
    static String armstrongNumber(int n) {
        int k = n, s=0;
        while(n!=0)
        {
            int d = n%10;
            s = s + d*d*d;
            n=n/10;
        }
        if(s==k)
        return "true";
        else
        return "false";
    }
}
