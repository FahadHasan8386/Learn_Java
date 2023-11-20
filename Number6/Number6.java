
abstract class Shape3D
 {
	abstract double calculateVolume();
	abstract double calculateSurfaceArea();
 }
 class Sphere extends Shape3D
 {
	double pi, r;
	Sphere(double pi, double r)
	{
		this.pi = pi;
		this.r = r;
	}
	double calculateVolume()
	{
		return(1.33333*pi*r*r*r);
	} /// 4/3 pi r^3
	double calculateSurfaceArea()
	{
		return (4*pi*r*r);
	} /// 4 pi r^2
 }
 class Cube extends Shape3D
 {	
	 int edge;
	 Cube(int edge)
	 {
		 this.edge = edge;
	 }
	 double calculateVolume(){return (edge*edge*edge);}
	 double calculateSurfaceArea(){return(6*edge*edge);}
 }
 class Number6
 {
	 public static void main(String[]args)
	 {
		 Shape3D s;
		 s = new Sphere(3.1416, 5);
		 System.out.println("Volume of sphere = "+s.calculateVolume());
		 System.out.println("Surface area of sphere = "+s.calculateSurfaceArea());
	 
		 s = new Cube(3);
		 System.out.println("Volume of Cube = "+s.calculateVolume());
		 System.out.println("Surface area of cube = "+s.calculateSurfaceArea());
	 }
 }