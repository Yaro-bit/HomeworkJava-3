package game;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Startscreen();
		MenuGame();
		LoadCharacter();
	}

	private static void MenuGame() {
		System.out.println("***************************MENU**************************************");
		System.out.println("");
		System.out.println("1. Create new character");
		System.out.println("2. Show all chars");
		System.out.println("3. Exit");
		System.out.println("");
		System.out.print("Enter your value: ");
		String input = UserInput();
		System.out.println("*******************************************************************");
		
		switch (input) {
		case "1":
			CreateCharacter();
			break;
		case "2":
			LoadCharacter();
			break;
		case "3":
			Exit();
			break;
		default:
			System.out.println("Wrong Entry !");
			MenuGame();

		}

	}

	private static void Exit() {
		System.out.print("You really want to exit? (Y/N): ");
		String input = UserInput();
		
		if (input.equalsIgnoreCase("n")) {
			MenuGame();
		}
		
		System.out.println("Thank you for playing !");
		System.out.println("*******************************************************************");
	}

	private static void LoadCharacter() {
		System.out.println(CharacterRepository.getAllCharacter());
	}

	private static void saveCharacter(String name, int strength, int inteligence, int luck) {
		Character c = new Character(name, luck, luck, luck);
		CharacterRepository.saveCharacter(c);
	}

	private static void CreateCharacter() {

		System.out.println("********************Character creation menu************************");
		System.out.print("enter your name: ");
		String name = UserInput();
		System.out.print("enter your STR: ");
		int strength = Integer.parseInt(UserInput());
		System.out.print("enter your INT: ");
		int inteligence = Integer.parseInt(UserInput());
		System.out.print("enter your LUC: ");
		int luck = Integer.parseInt(UserInput());
		showChar(name, strength, inteligence, luck);
		saveCharacter(name, strength, inteligence, luck);
	}

	private static void showChar(String name, int strength, int inteligence, int luck) {

		System.out.println("*******************************************************************");
		System.out.println("*********" + "\t \t \t \tName: " + name);
		System.out.println("*   o   *" + "\tStrength: \t" + strength);
		System.out.println("*  /|\\  *" + "\tInteligence: \t" + inteligence);
		System.out.println("*  / \\  *" + "\tLuck: \t\t" + luck);
		System.out.println("*******************************************************************");

	}

	private static String UserInput() {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		return inputString;
	}

	private static void Startscreen() {
		System.out.println("                         \f THE GAME OF BONES                      ");
		System.out.println("*******************************************************************");
		System.out.println("   /\\                                                        /\\");
		System.out.println("  |  |                                                      |  |");
		System.out.println(" /----\\                  Lord Dark's Keep                  /----\\");
		System.out.println("[______]             Where Brave Knights Tremble          [______]");
		System.out.println(" |    |         _____                        _____         |    |");
		System.out.println(" |[]  |        [     ]                      [     ]        |  []|");
		System.out.println(" |    |       [_______][ ][ ][ ][][ ][ ][ ][_______]       |    |");
		System.out.println(" |    [ ][ ][ ]|     |  ,----------------,  |     |[ ][ ][ ]    |");
		System.out.println(" |             |     |/'    ____..____    '\\|     |             |");
		System.out.println("  \\  []        |     |    /'    ||    '\\    |     |        []  /");
		System.out.println("   |      []   |     |   |o     ||     o|   |     |  []       |");
		System.out.println("   |           |  _  |   |     _||_     |   |  _  |           |");
		System.out.println("   |   []      | (_) |   |    (_||_)    |   | (_) |       []  |");
		System.out.println("   |           |     |   |     (||)     |   |     |           |");
		System.out.println("   |           |     |   |      ||      |   |     |           |");
		System.out.println(" /''           |     |   |o     ||     o|   |     |           ''\\");
		System.out.println("[_____________[_______]--'------''------'--[_______]_____________]");
		System.out.println("*******************************************************************");
		System.out.println("                         \f PRESS START                            ");
		System.out.println("*******************************************************************");
	}
}
