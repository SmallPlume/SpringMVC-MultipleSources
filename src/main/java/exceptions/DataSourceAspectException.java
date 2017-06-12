package exceptions;

public class DataSourceAspectException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String code;
	
	private Throwable message;
	
	public DataSourceAspectException(String code,Throwable e){
		this.code = code;
		this.message = e;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setMessage(Throwable message) {
		this.message = message;
	}

}
