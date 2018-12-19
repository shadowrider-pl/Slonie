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
		Scanner in = new Scanner(System.in);
		List<String> inString= new ArrayList<>();
		while (in.hasNextLine()) {
			inString.add(in.nextLine());
		}
		in.close();
		wynik = slonie.policz(inString);
		System.out.println("Wynik=" + wynik);
	}
}
