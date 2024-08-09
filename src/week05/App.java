package week05;

public class App {

	public static void main(String[] args) {
		
		Logger loggerAsterisk = new AsteriskLogger();
		Logger loggerSpaced = new SpacedLogger();
		
		/* Provided Tests: */
		loggerAsterisk.log("Hello");
		System.out.println();
		
		loggerAsterisk.error("Hello");
		System.out.println();
		
		loggerSpaced.log("Hello");
		System.out.println();
		
		loggerSpaced.error("Hello");
		System.out.println();
	
		
		/* Additional Tests: */
		loggerAsterisk.log("Good-bye");
		System.out.println();
		
		loggerAsterisk.error("Good-bye");
		System.out.println();
		
		loggerSpaced.log("Good-bye");
		System.out.println();
		
		loggerSpaced.error("Good-bye");
		System.out.println();
	}

}
