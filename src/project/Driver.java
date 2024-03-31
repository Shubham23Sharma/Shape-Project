package project;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		
		Driver.driver();
		
	}
	public static void driver()
	{
		Scanner scn = new Scanner(System.in);
		int x;
		do {
			System.out.println("--------Welcome To Shape Game--------------");
			System.out.println("Press 1 for Two Dimensional Game");
			System.out.println("Press 2 for Three Dimensional Game");
			x=scn.nextInt();
			Shape s1=new Shape();
			s1.getShape(x);
			if(x<1 || x>2)
			{
				System.out.println("Please enter a valid input");
			}
		} while (x<1 || x>2);
	}
}