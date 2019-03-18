package com.bagus.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext
			context = new ClassPathXmlApplicationContext("HeroConfigv2.xml"); 
		
		Hero hero1 = context.getBean("Centaur", Hero.class);
		Centaur centaur1 = (Centaur)hero1;
			
		System.out.println(hero1.heroName());
		System.out.println(centaur.getAbility().getTypeAbi());
		System.out.println(centaur.getHp());
		
		context.close();
	}
	
}
