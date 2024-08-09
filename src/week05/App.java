package week05;

public class App {

	public static void main(String[] args) {

		Logger loggerAsterisk = new AsteriskLogger();
		// Alternative:
		// AsteriskLogger loggerAsterisk = new AsteriskLogger();
		Logger loggerSpaced = new SpacedLogger();
		// Alternative:
		// SpacedLogger loggerSpaced = new SpacedLogger();
		
		/* Provided Tests: */
		System.out.println("First Test: ");
		System.out.println("- - - - - - - - - - - - \n");
		
		//
		loggerAsterisk.log("Hello");
		System.out.println();

		loggerAsterisk.error("Hello");
		System.out.println();
		
		//
		loggerSpaced.log("Hello");
		System.out.println();

		loggerSpaced.error("Hello");
		System.out.println();

		System.out.println("\n\n\n");

		/* Additional Tests: */
		System.out.println("Additional Tests: \n");
		loggerAsterisk.log("Good-bye");
		System.out.println();

		loggerAsterisk.error("Good-bye");
		System.out.println();

		loggerSpaced.log("Good-bye");
		System.out.println();

		loggerSpaced.error("Good-bye");
		System.out.println();
		
		//
		String abc = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		loggerAsterisk.error(abc);
		System.out.println();
		
		loggerSpaced.error(abc);
		System.out.println();
	}

}
