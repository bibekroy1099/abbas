package medium;

public enum BasicDirection implements Direction {

	North {
		@Override
		public void showDirection() {
			System.out.println("I am North");

		}
	},
	South {
		@Override
		public void showDirection() {
			System.out.println("I am South");
		}

	},
	East {
		@Override
		public void showDirection() {
			System.out.println("I am East");
		}

	},
	West {
		@Override
		public void showDirection() {
			System.out.println("I am West");
		}

	}
}
