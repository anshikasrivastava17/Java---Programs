/** Print Fibonacci Series till 70.
  Mark the even numbers with an asterisk (*) **/

public class Fib
{
	public static void main(String[] args) {
	   int n1=1,n2=1,a=1;
	   System.out.println("The Fibonacci series till 70 is:");
	    System.out.println(a+": "+n1+" ");
		while(n2<70)
		{
		    a++;
		 System.out.print(a+": "+n2+" ");  
		 if(n2%2==0)
		 System.out.println("*");
		 else
		 System.out.println();
		 n2=n1+n2;
		 n1=n2-n1;
		}
		System.out.println("Series ended");
	}
}
