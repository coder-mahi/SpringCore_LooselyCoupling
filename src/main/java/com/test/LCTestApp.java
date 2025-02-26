package com.test;
import com.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;

public class LCTestApp {
	public static void main(String[] args){
		//FileSystemResource fsr = new FileSystemResource("src/main/resources/applicationContext.xml");
		//BeanFactory factory = new XmlBeanFactory(fsr); --> deprecated in Spring 5.0
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //created IOC Container
		//Flipkart bean = (Flipkart) context.getBean("fpk");  //OR
		
		Flipkart bean = context.getBean("fpk",Flipkart.class);
		String billMsg = bean.purchase(new String[]{"shirt","mobile","books"});
		System.out.println(billMsg);
	}
}
