package medium;

public enum AdvancedDirection implements Direction {

	North_East {

		@Override
		public void showDirection() {
			System.out.println("I am North-East");
		}
	},
	North_WEST {
		@Override
		public void showDirection() {
			System.out.println("I am North-West");
		}
	},
	South_East {
		@Override
		public void showDirection() {
			System.out.println("I am South-East");
		}
	},
	South_West {
		@Override
		public void showDirection() {
			System.out.println("I am South-West");
		}

	}

}
