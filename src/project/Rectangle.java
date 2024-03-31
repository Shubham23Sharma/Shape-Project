package project;
public class Rectangle extends TwoDShape {
	double l;
	double b;
	Rectangle() {

	}
	Rectangle(double l, double b) {
		System.out.println("Rectangle Object is created");
		this.l = l;
		this.b = b;
	}
	public double getArea() {
		double area = l * b;
		System.out.println("Area of Rectangle is : " + area + " sq units");
		return area;
	}
	public double getPerimeter() {
		double peri = (l + b) * 2;
		System.out.println("Perimeter of Rectangle is : " + peri + " units");
		System.out.println("===========================");
		return peri;
	}
}