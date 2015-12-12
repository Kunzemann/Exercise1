
public class HelloUser {
	
	String Username;
	public HelloUser(String Username){
		this.Username = Username;
	}
	
	public void greetUser(){
		
		System.out.print("Hello "+this.Username);
	}
}
