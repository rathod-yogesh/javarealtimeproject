package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WishMessageGenerator;

public class SetterInjectionTest {
	
	public static void main(String[] args) {
	
		FileSystemResource res=new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml");
		
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		Object obj=factory.getBean("wmg");
		
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		
		String result=generator.generateMessage("Yogesh");
		System.out.println("Wish Message is :: "+ result);
	}
}
