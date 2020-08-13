package medium;

public class DirectionDriver {

	public static void printDirection(Direction op) {
		op.showDirection();
	}
	public static void main(String[] args) {
		DirectionDriver.printDirection(BasicDirection.East);
		DirectionDriver.printDirection(AdvancedDirection.South_East);

	}

}
