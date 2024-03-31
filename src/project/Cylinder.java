package project;
public class Cylinder extends ThreeDShape {
	double r;
	double h;
	Cylinder() {

	}
	Cylinder(double r, double h) {
		System.out.println("Cylinder object is created");
		this.r = r;
		this.h = h;
	}
	public double getVolume() {
		double volume = 3.14 * r * r * h;
		System.out.println("Volume of cylinder is : " + volume + " cube units");
		return volume;
	}
	public double getLateralSurfaceArea() {
		double lsa = 2 * 3.14 * r * h;
		System.out.println("Lateral Surface Area of cylinder is : " + lsa + " sq units");
		return lsa;
	}
	public double getTotalSurfaceArea() {
		double tsa = 2 * 3.14 * r * (r + h);
		System.out.println("Total Surface Area of cylinder is : " + tsa + "units");
		System.out.println("===========================");
		return tsa;
	}
}