
abstract class Vehicle
{
	abstract void startEngine();
	abstract void stopEngine();
} 
class Car extends Vehicle
{
	void startEngine()
	{
		System.out.println("Car,s engines started");
	}
	void stopEngine()
	{
		System.out.println("Car,s engines stoped");
	}
}
class Motorcycle extends Vehicle
{
	void startEngine()
	{
		System.out.println("Motorcycle,s engines started");
	}
	void stopEngine()
	{
		System.out.println("Motorcycle,s engines stoped");
	}
}
class Number7
{
	public static void main(String [] args)
	{
		Car c = new Car();
		c.startEngine();
		c.stopEngine();
		
		Motorcycle m = new Motorcycle();
		m.startEngine();
		m.stopEngine();
	}
}