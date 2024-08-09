package week05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder spaced = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			spaced.append(log.charAt(i));
			if (i < log.length() - 1) {
				spaced.append(" ");
			}
		}
		System.out.println(spaced);
	}

	@Override
	public void error(String error) {
		StringBuilder errorPrint = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			errorPrint.append(error.charAt(i));
			if (i < error.length() - 1) {
				errorPrint.append(" ");
			}
		}
		System.out.println("ERROR: " + errorPrint);
	}

} // End SpacedLogger Class
