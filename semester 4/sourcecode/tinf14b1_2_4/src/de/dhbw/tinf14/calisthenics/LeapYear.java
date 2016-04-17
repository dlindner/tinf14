package de.dhbw.tinf14.calisthenics;

public enum LeapYear {
	
	leap(1, "Schaltjahr") {
		@Override
		public void what() {
			System.out.println("that!");
		}
	},
	nonLeap(0, "KEIN Schaltjahr") {
		@Override
		public void what() {
			System.out.println("really");
		}
	},
	unsure(42, "OMG!") {
		@Override
		public void what() {
			System.out.println("works");
		}
	};

	private final int offset;
	private final String description;
	
	private LeapYear(int offset, String description) {
		this.offset = offset;
		this.description = description;
	}
	
	public void addTo(Counter counter) {
		for (int i = 0; i < this.offset; i++) {
			counter.increase();
		}
	}
	
	public void describe() {
		System.out.println(this.description);
	}
	
	public abstract void what();
}
