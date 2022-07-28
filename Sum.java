package practice;
import java.util.*;
public class Sum {
	  public int addNumbers(int x, int y) {
	    int sum = x + y;
	    return sum;
	  }
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	    int num1;
	    System.out.println("Enter num1 value:");
	    num1=sc.nextInt();
	    int num2;
	    System.out.println("Enter num2 value:");
	    num2=sc.nextInt();
	    Sum obj = new Sum();
	    int result = obj.addNumbers(num1, num2);
	    System.out.println("Sum is: " + result);
	  }
	}
