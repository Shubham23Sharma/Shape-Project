package project;
import java.util.Scanner;
public class Shape {
	public void getShape(int option) {
		Scanner scn = new Scanner(System.in);
		char ch;
		do {
		if(option==1)
		{
			int x;
			do {
			System.out.println("!!!----You have selected Two Dimensional Shape----!!!");
			System.out.println("Please enter your choice from below option");
			System.out.println("Press ==> 1 for Circle");
			System.out.println("Press ==> 2 for Rectangle");
			System.out.println("Press ==> 3 for Square");
			System.out.println("Press ==> 4 for Triangle");
			x=scn.nextInt();
			switch(x) {
			case 1: 
				System.out.println("!!! You have selected circle !!!");
				System.out.println("Enter radius of circle");
				double r = scn.nextDouble();
				Circle c=new Circle(r);
				c.getArea();
				c.getPerimeter();
				break;
			case 2:
				System.out.println("!!! You have selectd rectangle !!!");
				System.out.println("Enter length of rectangle");
				double l=scn.nextDouble();
				System.out.println("Enter breadth of rectangle");
				double w=scn.nextDouble();
				Rectangle rc=new Rectangle(l,w);
				rc.getArea();
				rc.getPerimeter();
				break;
			case 3:
				System.out.println("!!! You have selectd square !!!");
				System.out.println("Enter side of square");
				double side=scn.nextDouble();
				Square sq=new Square(side);
				sq.getArea();
				sq.getPerimeter();
				break;
			case 4:
				System.out.println("!!! You have selected Triangle !!!");
				System.out.println("Enter side1 of Triangle");
				double side1=scn.nextDouble();
				System.out.println("Enter side2 of Triangle");
				double side2=scn.nextDouble();
				System.out.println("Enter base of Triangle");
				double base=scn.nextDouble();
				System.out.println("Enter height of Triangle");
				double height=scn.nextDouble();
				Triangle tg=new Triangle(side1,side2,base,height);
				tg.getArea();
				tg.getPerimeter();
				break;
			}
			if(x<1 || x>4)
			{
				System.err.println("This is not a valid choice");
			}
			}while(x<1 || x>4);
		}
		else if(option==2)
		{
			int x;
			do {
			System.out.println("!!!-----You have selected Three Dimensional Shape----!!!");
			System.out.println("Please enter your choice from below option");
			System.out.println("Press ==> 1 for Cone");
			System.out.println("Press ==> 2 for Cuboid");
			System.out.println("Press ==> 3 for cylinder");
			System.out.println("Press ==> 4 for sphere");
			x=scn.nextInt();
			switch(x) {
			case 1:
				System.out.println("!!! You have selected Cone !!!");
				System.out.println("Please enter radius of Cone");
				double r=scn.nextDouble();
				System.out.println("Please enter height of Cone");
				double h=scn.nextDouble();
				System.out.println("Please enter slant height of Cone");
				double l=scn.nextDouble();
				Cone c=new Cone(r,h,l);
				c.getVolume();
				c.getLateralSurfaceArea();
				c.getTotalSurfaceArea();
				break;
			case 2:
				System.out.println("!!! You have selected Cuboid !!!");
				System.out.println("Please enter length of Cuboid");
				double le=scn.nextDouble();
				System.out.println("Please enter breadth of Cuboid");
				double b=scn.nextDouble();
				System.out.println("Please enter height of Cuboid");
				double he=scn.nextDouble();
				Cuboid cb = new Cuboid(le,b,he);
				cb.getVolume();
				cb.getLateralSurfaceArea();
				cb.getTotalSurfaceArea();
				break;
			case 3:
				System.out.println("!!! You have selected Cylinder !!!");
				System.out.println("Enter radius of Cylinder");
				double ra = scn.nextDouble();
				System.out.println("Enter height of Cylinder");
				double hei = scn.nextDouble();
				Cylinder cy = new Cylinder(ra,hei);
				cy.getVolume();
				cy.getLateralSurfaceArea();
				cy.getTotalSurfaceArea();
				break;
			case 4:
				System.out.println("!!! You have selected Sphere !!!");
				System.out.println("Enter radius of sphere");
				double rad=scn.nextDouble();
				Sphere s=new Sphere(rad);
				s.getVolume();
				s.getLateralSurfaceArea();
				s.getTotalSurfaceArea();
				break;
			}
			if(x<1 || x>4)
			System.err.println("This is not a valid choice");
			}while(x<1 || x>4);
		}
		else if(option>2)
		{
			System.err.println("This is not a valid chocie");
			System.err.println("Please select correct option");
			Driver.driver();
		}
		System.out.println("Press Y/y to continue game or any other key to close the program");
		ch=scn.next().charAt(0);
		if(ch=='Y' || ch=='y')
		{
			Driver.driver();
		}
		}while(ch=='Y' || ch=='y');
}
}
	
