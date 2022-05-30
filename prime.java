package JavaMC;
import java.util.*;
public class prime {
	public static void main(String[] args) {
		System.out.println( "Please insert any number");
		Scanner S = new Scanner(System.in); 
		int num = S.nextInt(); 
		int flag = 0;
	    for (int i = 2; i <= num/2; ++i) {
	    	if (num % i == 0) {
	    		flag = 1;
	    		break;
	      }
	    }
	    if (flag == 0)
	      System.out.println(num + " is prime number");
	    else
	      System.out.println(num + " is not a prime number");
	  }
}
