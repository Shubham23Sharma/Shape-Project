package project;
public class Circle extends TwoDShape {
	double r;
	Circle() {

	}
	Circle(double r) {
		System.out.println("Circle Object is created");
		this.r = r;
	}
	@Override
	public double getArea() {
		double area = 3.14 * r * r;
		System.out.println("Area of circle is : " + area + " sq. units");
		return area;
	}
	@Override
	public double getPerimeter() {
		double peri = 2 * 3.14 * r;
		System.out.println("Perimeter of circle is : " + peri + " units");
		System.out.println("===========================");
		return peri;
	}
}