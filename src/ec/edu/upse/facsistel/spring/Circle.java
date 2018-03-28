package ec.edu.upse.facsistel.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializeCircle()
	{
		 System.out.println("Init Circle");
	}
	
	@PreDestroy
	public void destroyCircle()
	{
		 System.out.println("Destroy Circle");
	}
	

}
