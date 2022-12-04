package glave;

public class Cat {
	String name = "Felix";
	int age = 12;
	int walletMove = 150;

	public void nameAge() {
		System.out.println("Name of cat : " + name + " | Age : " + age);

	}

	public void grow() {
		do {
			if (age < 17) {
			}
			age++;
			System.out.println(" Felix grow ! : " + age + " (After one year) ");

		} while (age < 13);

	}

	public void eat() {
		System.out.println("Felix is hungry right now");
	}

	public void sleep() {
		System.out.println("Felix is don't slepp right now");
	}

	public void money() {
		double wallet = 1000;
		for (int i = 1; i < 2; i++) {
			wallet = wallet + walletMove;
			System.out.println("In Felix's Wallet : " + wallet + "$ Dollars");
		}

	}

}
