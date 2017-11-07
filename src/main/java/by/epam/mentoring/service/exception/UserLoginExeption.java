package by.epam.mentoring.service.exception;

public class UserLoginExeption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1589524051430771218L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserLoginExeption(String message) {
		super(message);
		this.message = message;
	}

}
