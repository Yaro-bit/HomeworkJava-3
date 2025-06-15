package game;

public class Character {
	String name;
	int strength;
	int inteligence;
	int luck;

public Character(String name, int strength, int inteligence, int luck) {
		super();
		this.name = name;
		this.strength = strength;
		this.inteligence = inteligence;
		this.luck = luck;
	}

@Override
public String toString() {
	return "Character [name=" + name + ", strength=" + strength + ", inteligence=" + inteligence + ", luck=" + luck;
}

	
}
