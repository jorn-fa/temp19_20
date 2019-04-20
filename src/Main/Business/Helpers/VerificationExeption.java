package Main.Business.Helpers;

public class VerificationExeption extends Exception {
	
	
	private static final long serialVersionUID = 1L;
	
	
	private String errorCause;
	
	public VerificationExeption(String input) {
		this.errorCause = input;
	}
	
	
	public String toString() {
		return "String failed to verify " + errorCause;
	}
	

}
