package model;
public class User{
	private static int id;

	private String userName;
	private String password;
	private String type; // use later for Exam managers, type
	
	public User(String userName, String password, String type){
		this.userName = userName;
		this.password = password;
		this.type = type;
		
		id++;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getType(){
		return type;
	}
	
	public int getId(){
		return id;
	}
}