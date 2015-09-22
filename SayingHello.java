import java.io.*;

public class SayingHello {
	public static void main (String args[]) {
	
		System.out.print("What is your name? ");
	
		try {
			InputStream inputStream = System.in;
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		
			String name = reader.readLine();
			
			if (name.equals("Brian")) {
				System.out.println("Hello, "+ name + ". Go to hell!");
			}
		
			else if (name.equals("Ingo")) {
				System.out.println("Welcome back, Commander "+ name);
			}
		
			else if (name.equals("Hartwig")) {
				System.out.println("Hello, " + name + " T\u00F6dter. I knew you would look into this program some day.");
			}
		
			else {
				System.out.println("Hello, "+ name + ", nice to meet you!");
			}
		}
	
		catch (IOException exception) {
			System.out.println("Falscheingabe!");
		}	
	}
} //Kommentar auf Master branch geschrieben und committed