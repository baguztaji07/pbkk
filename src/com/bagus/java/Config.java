package com.bagus.java;

import org.springframework.beans.factory.annotation.Value;

@Configuration
@PropertySource("classpath:isi.properties")
public class Config {
	
	@Bean
	public Hero Centaur((@Value("${her1.At}")int attSpeed,
			   @Value("${her1.Mn}")int mana,
			   @Value("${her1.Hp}")int hp ){
		
		Centaur centaur1 = new Centaur(attSpeed, mana, hp);
		return centaur1;
	}
}
