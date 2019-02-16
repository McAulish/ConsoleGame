package animal;

import com.quest.Movement;

public abstract class Animal implements Movement {
	protected String name;
	protected int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public abstract void makeSound();

}
