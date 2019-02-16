package weapon;

import java.util.Scanner;

public class Knife extends weapon {
	private int sharpness;
	Scanner input = new Scanner(System.in);

	public void setSharpness() {
		System.out.println("Enter knife's Sharpness(Between 1-10)");

		this.sharpness = input.nextInt();

		while ((this.sharpness < 0) || (this.sharpness > 10)) {
			System.out.println("Please enter again");
			this.sharpness = input.nextInt();
		}

	}

	@Override
	public void getDamage() {
		if (sharpness != 0)
			 {
				this.damage = (sharpness * 10);
			}
		else {
			this.damage = 8;
		}
		System.out.println("Knife's damage is: " + damage);

	}

	@Override
	public void attack() {
		System.out.println("Slash! Cut!");
		
	}

	@Override
	public void dodge() {
		System.out.println("You moved back A little");
		
	}

}
