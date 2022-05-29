package JavaMC;
import java.util.Scanner;
public class matrices{
	public static void main(String args[]){ 
		Scanner scan = new Scanner(System.in);
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};   
		int c[][] = new int[3][3];
		int choice;
		do{
		      System.out.println("Enter your choice:");
		      System.out.println("1. Addition");
		      System.out.println("2. Multiplication");
		      System.out.println("3. Exit");
		      choice = scan.nextInt();

		      switch (choice){
			      case 1:
			        System.out.println("Sum of matrix: ");
			        c = add(a, b);
			        break;
			      case 2:
			    	  System.out.println("Multiplication of matrix: ");
			          c = multiply(a, b);
			          break;
			      case 3:
			    	  System.out.println("Exit point");
			    	  return;
			      default:
			          System.out.println("Invalid input.");
			          System.out.println("Please enter the correct input.");
			  }
		      
		} while (true);
	}
	public static int[][] add(int[][] a, int[][] b){
		int sum[][] = new int[3][3];
		for(int i = 0; i < 3;i++){    
			for(int j = 0; j < 3;j++){   
				sum[i][j]=a[i][j]+b[i][j];     
				System.out.print(sum[i][j]+" ");   
			}
			System.out.println();  
		}    
		return sum;
	}
	public static int[][] multiply(int[][] a, int[][] b){
		int product[][]=new int[3][3];
	    for(int i=0;i<3;i++){    
	    	for(int j=0;j<3;j++){    
	    		product[i][j]=0;      
	    		for(int k=0;k<3;k++){      
	    			product[i][j]+=a[i][k]*b[k][j];      
	    		}  
	    		System.out.print(product[i][j]+" "); 
	    	}
	    	System.out.println();    
	    }    
	    return product;
	}	
}
