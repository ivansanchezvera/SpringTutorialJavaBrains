package ec.edu.upse.facsistel.spring;

public class Circle implements Shape {

	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
		System.out.println("Circle with center: " + center);
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
	

}
