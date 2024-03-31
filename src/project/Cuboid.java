package project;
public class Cuboid extends ThreeDShape {
	double l;
	double b;
	double h;
	Cuboid() {

	}
	Cuboid(double l, double b, double h) {
		System.out.println("Cuboid Object is Created");
		this.l = l;
		this.b = b;
		this.h = h;
	}
	public double getVolume() {
		double volume = l * b * h;
		System.out.println("Volume of cuboid is : " + volume + " cube units");
		return volume;
	}
	public double getLateralSurfaceArea() {
		double lsa = 2 * (l + b) * h;
		System.out.println("Lateral Surface Area of cuboid is : " + lsa + " sq units");
		return lsa;
	}
	public double getTotalSurfaceArea() {
		double tsa = 2 * (l * b + b * h + h * l);
		System.out.println("Total Surface Area of cuboid is : " + tsa + "units");
		System.out.println("===========================");
		return tsa;
	}
}