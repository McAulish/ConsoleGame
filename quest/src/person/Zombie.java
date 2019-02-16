package person;

public class Zombie extends Person {

	protected int deathRate = 7;

	public int getDeathRate() {
		return deathRate;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayName() {
		System.out.println("My name is " + name + " and I'm a Zombie!");
	}
}
