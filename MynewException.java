package medium;

public class MynewException extends Exception {
  
	
	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	MynewException(String msg){
		super(msg);	
	}
}
