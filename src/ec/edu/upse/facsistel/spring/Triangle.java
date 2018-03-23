package ec.edu.upse.facsistel.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{

	List<Point> points;
	private ApplicationContext context = null;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw()
	{
		System.out.println("Triangle Drawn");
		for(Point p: points)
		{
			System.out.println("Point: " + p);
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name: " + beanName);
		
	}

}
