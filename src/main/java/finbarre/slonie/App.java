package finbarre.slonie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Scanner;

/**
 * Słonie
 *
 */
public class App {
	public static void main(String[] args) {
		Slonie slonie = new Slonie();
		long wynik = 0;
//		Scanner in = new Scanner(System.in);
		List<String> inString= new ArrayList<>();
//		while (in.hasNextLine()) {
//			inString.add(in.nextLine());
//		}
//		in.close();

//		inString.add("6");
//		inString.add("2400 2000 1200 2400 1600 4000");
//		inString.add("1 4 5 3 6 2");
//		inString.add("5 3 2 4 6 1");
		inString.add("10");
		inString.add("3015 4728 4802 4361 135 4444 4313 1413 4581 546");
		inString.add("3 10 1 8 9 4 2 7 6 5");
		inString.add("4 9 5 3 1 6 10 7 8 2");
		wynik = slonie.policz(inString);
		System.out.println("Wynik=" + wynik);
	}
}
