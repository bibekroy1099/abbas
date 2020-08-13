package medium;

public class M63 {

	public void f() {
		try {
			g(new String("goosebumb"));
		} catch (MynewException e) {
			System.out.println(e);
			 try {
				throw new MyOwnException("Chaining of Exception.", ErrorCode.INVALID_PORT_CONFIGURATION);
			} catch (MyOwnException e1) {
				System.out.println(e1);
			}
		}
	}
	public void g(String input) throws MynewException {
		try {
			int i = Integer.parseInt(input);
			System.out.println("int value = " + i);
		} catch (NumberFormatException e) {
			throw new MynewException("A message that describes the error");
		}
	}

	public static void main(String[] args) {
		M63 m = new M63();
		m.f();

	}

}
