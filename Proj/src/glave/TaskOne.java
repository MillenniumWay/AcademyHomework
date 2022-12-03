package glave;

import java.util.Scanner;

public class TaskOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Price Product
		double sumscan;

		// Age of Client
		int agescan;
		

		System.out.println("Введите ваш возраст: ");
		agescan = sc.nextInt();

		System.out.println("Введите сумму покупки : ");
		sumscan = sc.nextDouble();

		if (1 < agescan && agescan < 18 && 1 < sumscan && sumscan < 100) {

			double Formula = sumscan / 100;
			double Skidka = Formula * 2;
			double all = sumscan - Skidka;
			System.out.print(" Ваша скидка 2% (5% -3%) " + " К опалте c учетом скидки : " + all);
		} else if (agescan > 18 && 1 < sumscan && sumscan < 100) {

			double Formula = sumscan / 100;
			double Skidka = Formula * 9;
			double all = sumscan - Skidka;
			System.out.print("Ваша скидка 9% (5% + 4%) " + "C учетом того что вы старше 18и лет "
					+ "К опалте c учетом скидки : " + all);

		}

		if (1 < agescan && agescan < 18 && 100 < sumscan && sumscan < 199) {
			double Formula = sumscan / 100;
			double Skidka = Formula * 4;
			double all = sumscan - Skidka;
			System.out.print("Ваша скидка 4% (7% -3%)" + "К опалте c учетом скидки : " + all);
		} else if (agescan > 18 && 100 < sumscan && sumscan < 199) {

			double Formula = sumscan / 100;
			double Skidka = Formula * 11;
			double all = sumscan - Skidka;
			System.out.print("Ваша скидка 11% (7% + 4%) " + "C учетом того что вы старше 18и лет"
					+ " К опалте c учетом скидки : " + all);
		}

		if (1 < agescan && agescan < 18 && 200 < sumscan && sumscan < 299) {
			double Formula = sumscan / 100;
			double Skidka = Formula * 9;
			double all = sumscan - Skidka;
			System.out.print("Ваша скидка 9% (12% - 3%) " + "К опалте c учетом скидки : " + all);
		} else if (agescan > 18 && 200 < sumscan && sumscan < 299) {

			double Formula = sumscan / 100;
			double Skidka = Formula * 16;
			double all = sumscan - Skidka;
			System.out.print("Ваша скидка 16% (12% + 4%) " + "C учетом того что вы старше 18и лет"
					+ " К опалте c учетом скидки : " + all);

		}
		if (1 < agescan && agescan < 18 && 300 < sumscan && sumscan < 399) {
			double Formula = sumscan / 100;
			double Skidka = Formula * 12;
			double all = sumscan - Skidka;
			System.out.print("Ваша скидка 12% (15% - 3%)" + "К опалте c учетом скидки : " + all);
		} else if (agescan > 18 && 300 < sumscan && sumscan < 399) {

			double Formula = sumscan / 100;
			double Skidka = Formula * 19;
			double all = sumscan - Skidka;
			System.out.print("Ваша скидка 19% (15% + 4%) " + "C учетом того что вы старше 18и лет"
					+ " К опалте c учетом скидки : " + all);

		}
		if (1 < agescan && agescan < 18 && 400 < sumscan) {

			double Formula = sumscan / 100;
			double Skidka = Formula * 17;
			double all = sumscan - Skidka;
			System.out.print("Ваша скидка 17% (20% - 3%)" + "К опалте c учетом скидки : " + all);
		} else if (agescan > 18 && 400 < sumscan) {

			double Formula = sumscan / 100;
			double Skidka = Formula * 24;
			double all = sumscan - Skidka;
			System.out.print("Ваша скидка 24% (20% + 4%) " + "C учетом того что вы старше 18и лет"
					+ " К опалте c учетом скидки : " + all);

		} else {
			sc.close();

		}
	}
}
