package project;
public class Triangle extends TwoDShape {
	double side1;
	double side2;
	double base;
	double height;
	Triangle() {

	}

	Triangle(double side1, double side2, double base, double height) {
		System.out.println("Triangle object is created");
		this.side1 = side1;
		this.side2 = side2;
		this.base = base;
		this.height = height;
	}
	@Override
	public double getArea() {
		double area = (base * height) / 2;
		System.out.println("Area of triangle is : " + area);
		return area;
	}
	@Override
	public double getPerimeter() {
		double peri = side1 + side2 + base;
		System.out.println("Perimeter of triangle is : " + peri);
		System.out.println("===========================");
		return peri;
	}
}