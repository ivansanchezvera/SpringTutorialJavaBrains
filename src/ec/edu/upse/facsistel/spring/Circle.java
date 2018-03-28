package ec.edu.upse.facsistel.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Circle implements Shape {

	private Point center;
	@Autowired
	private MessageSource messageSource; 
	
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
		System.out.println("Circle with center: " + center);
		System.out.println("Message: " + this.messageSource.getMessage("greeting", null, "Default Greeting", null));
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

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	 

}
