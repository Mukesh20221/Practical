package Day3;
import java.util.*;
public class BasicArithmeticOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int firstno = sc.nextInt();
		System.out.println("Enter second number");
		int secno = sc.nextInt();
		sc.close();
		int add = firstno + secno;
		int sub = firstno - secno;
		int multi = firstno * secno;
		int div = secno / firstno;
		System.out.println("Addition of two number: "+add);
		System.out.println("Subtraction of two number: "+sub);
		System.out.println("Multiplication of two number: "+multi);
		System.out.println("Division of two number: "+div);
	}
}