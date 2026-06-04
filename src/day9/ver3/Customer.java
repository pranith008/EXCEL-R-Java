package day9.ver3;

public class Customer {
	private String username;
	private String password;
	private String user;
	
	public Customer() {}
	public Customer(String username, String password,String user)
	{
		this.username = username;
		this.password = password;
		this.user = user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
		
	
	public boolean login(String user,String pass)
	{
		if(user.equalsIgnoreCase(this.username) && pass.equals(this.password))
		return true;
		else
		return false;
	}
}
