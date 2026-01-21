import java.io.Console;

class ReadPasswordTest {
     public static void main(String[] args) 
	{
		Console c = System.console();
		System.out.println("Enter Name");
		String name = c.readLine();

		System.out.println("Enter your password");
		char []ch = c.readPassword();
		
		String pass = String.valueOf(ch);
		System.out.println("Welcome "+name);
		System.out.println("Your password is : "+pass);
		
	}
}