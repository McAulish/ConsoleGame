package person;

public class Superman extends Person {
	protected int speed;

	
	
	public void increaseSpeed(int speed) {
		this.speed+=speed;
	}

	public void decreaseSpeed(int speed) {

	}
	
	public void setName(String name) {
	this.name = name;
	}
	
	@Override
	public void sayName() {
		System.out.println("My name is " + name + " and I'm a Superman!");
	}
}
