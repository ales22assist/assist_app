package exception;

public class PropertyFileException extends java.lang.Exception {

	private static final long serialVersionUID = 1L;

	private String propertyName;
	private String propertyValue;

	public PropertyFileException() {
		super();
	}

	public PropertyFileException(String message) {
		super(message);
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}
}