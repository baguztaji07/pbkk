package com.bagus.heroes;

import org.springframework.beans.factory.annotation.Autowired;

import com.bagus.herotype.TypeAbi;

@Component
public class Centaur implements Hero {
	private TypeAbi Ability;
	private int attSpeed;
	private int mana;
	private int hp;
	
	public Centaur() {
		super();
	}
	
	
	@Autowired
	public Centaur(@Value("${her1.At}")int attSpeed,
				   @Value("${her1.Mn}")int mana,
				   @Value("${her1.Hp}")int hp )
	{
		super();
		Ability = ability;
		this.attSpeed = attSpeed;
		this.mana = mana;
		this.hp = hp;
	}



	public TypeAbi getAbility() {
		return Ability;
	}


	public void setAbility(TypeAbi ability) {
		Ability = ability;
	}


	public int getAttSpeed() {
		return attSpeed;
	}


	public void setAttSpeed(int attSpeed) {
		this.attSpeed = attSpeed;
	}


	public int getMana() {
		return mana;
	}


	public void setMana(int mana) {
		this.mana = mana;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	@Override
	public String heroName() {
		// TODO Auto-generated method stub
		return "Centaur";
	}

}
