package weapon;

import java.util.Scanner;

public class Gun extends weapon {

	Scanner input = new Scanner(System.in);
	private int bulletCal;
	private int bullets = 0;

	public void setBulletCal() {
		System.out.println("Enter Gun's calliber (Between 1-10)");

		this.bulletCal = input.nextInt();

		while ((this.bulletCal < 1) || (this.bulletCal > 10)) {
			System.out.println("Please enter again");
			this.bulletCal = input.nextInt();
		}
	}

	@Override
	public void getDamage() {

		this.damage = bulletCal * 10;

		System.out.println("Gun damage is: " + damage);
	}

	public void reload() {
		System.out.println("Enter number of bullets in the magazine");
		this.bullets += input.nextInt();

	}

	public void shoot() {

		if (bullets < 3) {
			System.out.println("not enough bullets, please reload!");
		}
		System.out.println("PEW! PEW! PEW!");
		this.bullets = bullets - 3;
	}

	public void checkMagazine() {
		System.out.println(bullets + " in the magazine");
	}

	@Override
	public void attack() {
		shoot();

	}

	@Override
	public void dodge() {
		System.out.println("You moved back A little");

	}

}
