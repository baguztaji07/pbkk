package com.bagus.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		
		Hero hero2 = context.getBean("Invoker", Hero.class);
		Invoker invoker1 = (Invoker)hero2;
			
		System.out.println("Hero 2: " + invoker1.heroName() + "\nAbility: " + invoker1.getAbility().getTypeAbi());
		
		context.close();
	}

}
