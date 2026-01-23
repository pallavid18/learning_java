import java.io.Console;

public class ConsoleReadTest {

	public static void main(String[] args) {
		
			Console c = System.console();
			System.out.println("Enter your name : ");
			String name = c.readLine();
			System.out.println("Thanku you : "+name);
			
	}

}
