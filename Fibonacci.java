package JavaMC;
import java.util.*;
public class Fibonacci {
	public static void main(String args[])  
	{  
		System.out.println("Enter n :");
		Scanner S = new Scanner(System.in); 
		int n = S.nextInt(); 
		Fib(n);
		System.out.println();
		System.out.println("Fibonacci with recursion");
		for (int i = 0; i < n; i++) {  
            System.out.print(fibRec(i) +  " ");
		}
	}
	static void Fib(int n){ 
		System.out.println("Fibonacci without recursion");
		int n1=0,n2=1,n3,i;   
		System.out.print(n1+" "+n2);
		for(i=2;i<n;++i){    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3; 
		}
	}
	static int fibRec(int n){
        if (n <= 1)
            return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }
}
