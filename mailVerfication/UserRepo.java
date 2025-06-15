package task_1;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
	private static List<User> userList = new ArrayList<>();
	
	public static void saveCharacter(User u) {
	
		userList.add(u);
    }
	
}
