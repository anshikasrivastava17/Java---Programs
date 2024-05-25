import java.util.*;
class GCD {
static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter 1st number");
    int a = sc.nextInt();
    System.out.println("Enter 2nd number");
    int b = sc.nextInt();
    int g = gcd(a,b);
    System.out.println("GCD of both numbers is "+g);
  }
}    
