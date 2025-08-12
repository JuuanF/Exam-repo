package data;
import java.util.List;
import java.util.ArrayList;
import model.User;
public class UserData{
	public static List<User> getUsers(){
		List<User> userList = new ArrayList<>();
		
		userList.add(new User("LudCar", "1", "Student"));
		userList.add(new User("JuanF", "2", "Student"));
		userList.add(new User("MarioS", "3", "Manager"));
		
		return userList;
	}
}
