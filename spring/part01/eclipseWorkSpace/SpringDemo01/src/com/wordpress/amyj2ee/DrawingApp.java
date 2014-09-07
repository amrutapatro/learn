package com.wordpress.amyj2ee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle trangle=(Triangle)factory.getBean("triangle");
		trangle.draw();
		Rectangle rectangle=(Rectangle)factory.getBean("rectangle");
		rectangle.draw();
	}
}
