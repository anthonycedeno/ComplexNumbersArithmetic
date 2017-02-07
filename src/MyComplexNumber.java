import java.util.Scanner;

public class MyComplexNumber {

	public static void main(String[] args) {
		
		int a,b,c,d,i,addition1,addition2,multiplication1,multiplication2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter integer real number  a: ");
		a = keyboard.nextInt();
		System.out.print("Enter imaginary number  b: ");
		b = keyboard.nextInt();
		System.out.print("Enter integer real number  c: ");
		c = keyboard.nextInt();
		System.out.print("Enter imaginary number  d: ");
		d = keyboard.nextInt();
		
		
		addition1 = (a+c);
		addition2 = (b+d);
		multiplication1 = ((a*c)-(b*d));
		multiplication2 = ((a*d)+(b*c));
		
		System.out.println("The addition of this complex number is: " + addition1 +" + "+ addition2 + "i");
		System.out.println("The multiplication of this complex number is: " + multiplication1 +" + "+ multiplication2 + "i");
	}

}
