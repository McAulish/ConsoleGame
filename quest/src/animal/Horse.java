package animal;

public class Horse extends Animal {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void increaseSpeed(int s) {
		this.speed += s;
	}

	public void decreaseSpeed(int s) {
		this.speed -= s;
	}

	public void makeSound() {
		System.out.println("HHHEeeeeeeehaw!");
	}

	@Override
	public void advance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}
}