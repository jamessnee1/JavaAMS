package ams.model.exception;

@SuppressWarnings("serial")
public abstract class AMSException extends Exception {
	public AMSException() {
		super("DEFAULT AMS Exception");
	}

	// NOTE: it is advisable to use this constructor when creating new
	// exceptions
	public AMSException(String message) {
		super(message);
	}
}
