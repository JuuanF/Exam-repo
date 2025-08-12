package model;
public class User{
	private int id = 1;
	private static int nextId;
	private String userName;
	private String password;
	private String type; // use later for Exam managers, type
	
	public User(String userName, String password, String type){
		this.userName = userName;
		this.password = password;
		this.type = type;
		
		id = nextId;
		nextId++;
		
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