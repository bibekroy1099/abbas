package medium;

public class MyOwnExceptionDemo {
	
	public void handleExceptionInOneBlock() {
	    try {
	        wrapException(new String("goosebumb"));
	    } catch (MyOwnException e) {
	        // handle exception
	     System.out.println(e);
	    }
	}
	private void wrapException(String input) throws MyOwnException {
	    try {
	    	 int i = Integer.parseInt(input);
	    	   System.out.println("int value = " + i);
	    } catch (NumberFormatException e) {
	        throw new MyOwnException("A message that describes the error.", ErrorCode.INVALID_PORT_CONFIGURATION);
	    }
	}

	public static void main(String[] args) {
		MyOwnExceptionDemo mownD = new MyOwnExceptionDemo();
		mownD.handleExceptionInOneBlock();
	}

}
