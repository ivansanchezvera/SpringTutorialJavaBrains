package ec.edu.upse.facsistel.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean, DisposableBean{

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

	public void draw()
	{
		System.out.println("Triangle Drawn");
		System.out.println("Point A: " + pointA);
		System.out.println("Point B: " + pointB);
		System.out.println("Point C: " + pointC);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initilizing beans init method call for triangle ");		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroyed Bean");
	}

}
