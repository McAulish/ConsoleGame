package person;


import weapon.weapon;
import java.util.Scanner;

public class Knight extends Person {
	String weapon;

	public void setName() {
		System.out.println("Enter Charachter's name");
		Scanner input = new Scanner(System.in);
		this.name = input.nextLine();
	}
	
	@Override
	public void sayName() {
		System.out.println("My name is Sir " + name + " and I'm a Knight");
	}

	public String getWeapon() {
		return weapon;          //* ******Do we need to implement class Weapon here?
	}							//        or simply a name?

	public void setWeapon(String weapon) {

	}

	public void useWeapon() {
		System.out.println("Slash! Cut! Stab!");
	}
}
