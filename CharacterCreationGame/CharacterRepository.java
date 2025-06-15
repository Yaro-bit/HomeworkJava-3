package game;

import java.util.ArrayList;
import java.util.List;

public class CharacterRepository {
	private static List<Character> characterList = new ArrayList<>();

    
	public static void saveCharacter(Character c) {
		characterList.add(c);
    }
	
    public static String getAllCharacter() {
        return characterList.toString();
    }
    
}
