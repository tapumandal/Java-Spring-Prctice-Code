package com.tapumandal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		FirstTask fTask = (FirstTask) context.getBean("firstTask");
	
		fTask.getMessage();
	}	

}
