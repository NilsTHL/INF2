package recursion;

public class Methods {
	public static int fact(int n) {
		if(n <= 1 ) {
			return 1;
			}
		return n * fact(n - 1);
	}
	public static int binom(int n, int k) {
			if(n < k) return 0;
		return fact(n)/(fact(k)*fact(n-k));
	}
	public static int ggT(int a, int b) {
		   if (a==b) return(a);
		   if (a>b) return(ggT(a-b,b));
		   return(ggT(b-a,a));
		}
	public static int fib(int a){
		  if (a==1||a==2) return 1;
		  else return fib(a-1) + fib(a-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
