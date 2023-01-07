
public class CountByZeroException extends Exception{
	private String message;
	public CountByZeroException() {}
	public CountByZeroException(String message) {
		this.message=message;
		
	}
	public void setMessage(String message) {
		this.message=message;
	}
@Override
	public String getMessage() {
		return this.message;
	}
	

}
