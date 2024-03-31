package project;
public class Square extends TwoDShape{
	double side;
	Square(){
		
	}
	Square(double side){
		System.out.println("Square object is created");
		this.side=side;
	}
	public double getArea(){
		double area = side * side;
		System.out.println("Area of Square is : "+area+" sq units");
		return area;
	}
	public double getPerimeter(){
		double peri = 4*side;
		System.out.println("Perimeter of Square is : "+peri+" units");
		System.out.println("===========================");
		return peri;
	}
}