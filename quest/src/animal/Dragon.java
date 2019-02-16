package animal;

public class Dragon extends Animal {
	private int height;
	
	public void makeSound() {
		System.out.println("RAAAAAHHHHWWWWRRRRRR!!!!!");
	}
	
	public void increaseHeight(int h) {
		this.height+=h;
	}
	
	public void decreaseHeight(int h) {
		this.height-=h;
	}
	public int getHeight() {
		return height;
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
