/**
 * 
 */

/**
 * @author Lukas
 *
 */
import java.io.*;

public class HelloWorld {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Hello ASE2015 - how are you? :)");
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    System.out.print("Please enter your name: ");
	    String eingabe = br.readLine();
	
		HelloUser User = new HelloUser(eingabe);
		User.greetUser();
	}

}
