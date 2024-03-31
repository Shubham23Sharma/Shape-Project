package project;
public class Sphere extends ThreeDShape{
	double r;
	Sphere(){
		
	}
	Sphere(double r)
	{
		this.r=r;
	}
	public double getVolume() {
		double volume = (4* (3.14*r*r*r)/3);
		System.out.println("Volume of sphere is : " + volume + " cube units");
		return volume;
	}
	public double getLateralSurfaceArea() {
		double lsa = 4*3.14*r*r;
		System.out.println("Lateral Surface Area of sphere is : " + lsa + " sq units");
		return lsa;
	}

	public double getTotalSurfaceArea() {
		double tsa = 4*3.14*r*r;
		System.out.println("Total Surface Area of sphere is : " + tsa + "units");
		System.out.println("===========================");
		return tsa;
	}
}