package medium;

public class MyOwnException extends Exception {
	
	
	private static final long serialVersionUID = 7718828512143293558L;
	private final  ErrorCode code;
	
	public MyOwnException(ErrorCode code) {
		super();
		this.code=code;
	}
	
	public MyOwnException(String Message , Throwable cause, ErrorCode code) {
		super(Message, cause);
		this.code=code;
	}
	
	public MyOwnException(String Message, ErrorCode code) {
		super(Message);
		this.code=code;
	}
	
	public MyOwnException( Throwable cause, ErrorCode code) {
		super( cause);
		this.code=code;
	}

	public ErrorCode getCode() {
		return code;
	}

	

}
