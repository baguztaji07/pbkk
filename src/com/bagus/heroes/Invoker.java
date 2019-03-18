package com.bagus.heroes;

import com.bagus.herotype.TypeAbi;

public class Invoker implements Hero {

	private TypeAbi Ability;
	private int attSpeed;
	private int mana;
	private int hp;
	
	public Invoker() {
		super();
	}

	public Invoker(TypeAbi ability, int attSpeed, int mana, int hp) {
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
		return "Invoker";
	}

}
