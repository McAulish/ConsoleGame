package shmulsGame;

import com.quest.Movement;
import com.quest.fight;

public class Character implements fight, Movement {
	public static int monsterHP = 0, heroHP = 100;
	public static int finish, counter = 0;
	public static int prompt;
	private int bullets;
	public String command;


	public void reload() {
		System.out.println("Reloading!!! (12 bullets in magazine)\n*----------------");
		bullets = 12;
		if (monsterHP > 0) {
			monsterCounter();
		}
	}

	public void shoot() {

		if (bullets < 3) {
			System.out.println("not enough bullets, please reload!\n----------------");
		} else {
			System.out.println("PEW! PEW! PEW!\n-------------------");
			this.bullets = bullets - 3;
			if (monsterHP > 0) {
				monsterHP = -7;
			}
			if (monsterHP <= 0) {
				System.out.println("You killed the monster");
			}
		}
	}

	public void checkMagazine() {
		System.out.println(bullets + " in the magazine\n----------------");
		if (monsterHP > 0) {
			monsterCounter();
		}
	}

	@Override
	public void advance() {
		System.out.println("Advancing...\n-----------------------");
		if (monsterHP > 0) {
			monsterCounter();
		}
		counter++;
		finish++;
		if (finish == 20) {
			endGame();
		}
	}

	@Override
	public void back() {
		System.out.println("Going back...\n----------------------");
		counter--;
		finish--;
		if (monsterHP > 0) {
			monsterCounter();
		}
	}

	@Override
	public void attack() {
		shoot();
	}

	@Override
	public void dodge() {
		shoot();
		System.out.println("Dodging:\n------------------------");
		back();

	}

	public void monsterCounter() {
		prompt++;

		if (prompt == 2) {
			monsterAttack();
			prompt = 0;
		}
	}

	public void monster() {
		if (counter % 3 == 0 || counter % 7 == 0) {
			monsterHP = 5;
			System.out.println("A monster has apeared!");
			monsterCounter();

		}
	}

	public void monsterAttack() {
		System.out.println("The monster attacked!!!");
		heroHP -= 15;
		if (heroHP<=0) System.out.println("--------------\n You're DEAD!\n--------------");
	}

	public void hp() {
		System.out.println("Your HP -  " + heroHP);
	}
	public String endGame() {
		System.out.println("Congratulations! you've completed the game!");
		return this.command = "quit";
	}
}
