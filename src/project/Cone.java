package project;
public class Cone {
	double r;
	double h;
	double l;
	Cone(){
		
	}
	Cone(double r,double h,double l){
		System.out.println("Cone object is created");
		this.r=r;
		this.h=h;
		this.l=l;
	}
	public double getVolume() {
		double volume = (3.14*r*r*h)/3;
		System.out.println("Volume of cuboid is : " + volume + " cube units");
		return volume;
	}
	public double getLateralSurfaceArea() {
		double lsa = 3.14 * r *(Math.sqrt(h*h+r*r));
		System.out.println("Lateral Surface Area of cuboid is : " + lsa + " sq units");
		return lsa;
	}
	public double getTotalSurfaceArea() {
		double tsa =3.14*r*(r+l);
		System.out.println("Total Surface Area of cuboid is : " + tsa + "units");
		System.out.println("===========================");
		return tsa;	
	}
}