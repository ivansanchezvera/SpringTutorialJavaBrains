package ec.edu.upse.facsistel.spring;

public class Triangle implements Shape {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing a Triangle");
		System.out.println("Point A: " + pointA);
		System.out.println("Point B: " + pointB);
		System.out.println("Point C: " + pointC);
		
	}

	public void myInit()
	{
		System.out.println("My initialization");
	}
	
	public void cleanUp()
	{
		System.out.println("Cleaning up. Bye bye.");
	}

}
