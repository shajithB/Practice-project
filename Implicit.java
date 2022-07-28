package practice;
import java.util.*;
public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit type casting");
		char a='H';
		System.out.println("value of a:"+a);
		int b=a;
		System.out.println("value of b:"+b);
		double c=a;
		System.out.println("value of c:"+c);
		float d=a;
		System.out.println("value of d:"+d);
		long f=a;
		System.out.println("value of f:"+f);
		System.out.print("Expicit type casting");
		double g=15.25;
		 int j=(int) g ;
		 System.out.print("value of g:"+g );
		 System.out.print("\n");
		 System.out.println("value of j:"+j);
}

}
