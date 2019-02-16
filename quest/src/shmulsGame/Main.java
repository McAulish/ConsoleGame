package shmulsGame;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static int quit = 0;


	public static void main(String[] args) {
		Character hero = new Character();
		System.out.println("Would you like to start? (yes/no)");
		String command = input.nextLine();
		switch (command) {
		case "yes":
			System.out.println("The game begins! \n-------------------------------------");
			break;
		}
		while (quit == 0) {
			switch (command) {
			case "quit":
				System.out.println("Thank you for playing!");
				quit = 1;
				break;
			}
			command = input.nextLine();
			switch (command) {
			case "advance":
				hero.advance();
				hero.monster();
				break;
			case "back":
				hero.back();
				break;
			case "dodge":
				hero.dodge();
				break;
			case "attack":
				hero.attack();
				break;
			case "check magazine":
				hero.checkMagazine();
				break;
			case "reload":
				hero.reload();
				break;
			case "hp":
				hero.hp();
				break;
			case "help":
				System.out.println(
						"######################################\n In this game you have to advance and finish the maze,");
				System.out.println("When you encounter a monster you can shoot it or try to dodge");
				System.out.println("if your HP is low.\n-----------------------");
				System.out.println("Commands are:");
				System.out.println(
						"advance (forward)\n back (go back)\n attack (shoot the beast)\n dodge (try to menouver back)\n reload (fresh magazine of 12 bullets)\n check magazine (see how many bullets left) \n hp (how much Health points you have) \n help (this tab) \n and quit (stops the game)");
				System.out.println("######################################");
				break;

			}
		}

	}

}
