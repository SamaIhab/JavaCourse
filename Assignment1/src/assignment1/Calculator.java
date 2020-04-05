package assignment1;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
	
		double n1,n2,ans;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please Enter first number: ");
		n1=sc.nextInt();
		
		System.out.println("Please Enter second number: ");
		n2=sc.nextInt();
		
		ans=n1+n2;
		System.out.printf("Addition: %.2f\n",ans);
		
		ans=n1-n2;
		System.out.printf("Subtraction: %.2f\n",ans);
		
		ans=n1*n2;
		System.out.printf("Multiplication: %.2f\n",ans);
		
		ans=n1/n2;
		System.out.printf("Division: %.2f\n",ans);
		
		
		
		
		
		

	}

}
