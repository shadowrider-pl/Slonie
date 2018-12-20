package finbarre.slonie;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;


public class SlonieTest {

	@Test
	public void slo0() {
		String fileName = "slo0";
		try {
			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
			long out = Long.valueOf(
					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
			Slonie slonie = new Slonie();
			long wynik = slonie.policz(in);
			assertThat(wynik).isEqualTo(out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void slo1() {
		String fileName = "slo1";
		try {
			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
			long out = Long.valueOf(
					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
			Slonie slonie = new Slonie();
			long wynik = slonie.policz(in);
			assertThat(wynik).isEqualTo(out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void slo1ocen() {
		String fileName = "slo1ocen";
		try {
			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
			long out = Long.valueOf(
					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
			Slonie slonie = new Slonie();
			long wynik = slonie.policz(in);
			assertThat(wynik).isEqualTo(out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void slo2() {
		String fileName = "slo2";
		try {
			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
			long out = Long.valueOf(
					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
			Slonie slonie = new Slonie();
			long wynik = slonie.policz(in);
			assertThat(wynik).isEqualTo(out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void slo2ocen() {
		String fileName = "slo2ocen";
		try {
			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
			long out = Long.valueOf(
					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
			Slonie slonie = new Slonie();
			long wynik = slonie.policz(in);
			assertThat(wynik).isEqualTo(out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void slo3() {
		String fileName = "slo3";
		try {
			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
			long out = Long.valueOf(
					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
			Slonie slonie = new Slonie();
			long wynik = slonie.policz(in);
			assertThat(wynik).isEqualTo(out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void slo3ocen() {
		String fileName = "slo3ocen";
		try {
			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
			long out = Long.valueOf(
					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
			Slonie slonie = new Slonie();
			long wynik = slonie.policz(in);
			assertThat(wynik).isEqualTo(out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void slo4() {
		String fileName = "slo4";
		try {
			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
			long out = Long.valueOf(
					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
			Slonie slonie = new Slonie();
			long wynik = slonie.policz(in);
			assertThat(wynik).isEqualTo(out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void slo4ocen() {
		String fileName = "slo4ocen";
		try {
			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
			long out = Long.valueOf(
					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
			Slonie slonie = new Slonie();
			long wynik = slonie.policz(in);
			assertThat(wynik).isEqualTo(out);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//
//	@Test
//	public void slo5() {
//		String fileName = "slo5";
//		try {
//			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
//			long out = Long.valueOf(
//					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
//			Slonie slonie = new Slonie();
//			long wynik = slonie.policz(in);
//			assertThat(wynik).isEqualTo(out);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void slo6() {
//		String fileName = "slo6";
//		try {
//			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
//			long out = Long.valueOf(
//					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
//			Slonie slonie = new Slonie();
//			long wynik = slonie.policz(in);
//			assertThat(wynik).isEqualTo(out);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void slo7() {
//		String fileName = "slo7";
//		try {
//			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
//			long out = Long.valueOf(
//					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
//			Slonie slonie = new Slonie();
//			long wynik = slonie.policz(in);
//			assertThat(wynik).isEqualTo(out);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void slo8a() {
//		String fileName = "slo8a";
//		try {
//			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
//			long out = Long.valueOf(
//					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
//			Slonie slonie = new Slonie();
//			long wynik = slonie.policz(in);
//			assertThat(wynik).isEqualTo(out);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void slo8b() {
//		String fileName = "slo8b";
//		try {
//			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
//			long out = Long.valueOf(
//					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
//			Slonie slonie = new Slonie();
//			long wynik = slonie.policz(in);
//			assertThat(wynik).isEqualTo(out);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void slo9a() {
//		String fileName = "slo9a";
//		try {
//			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
//			long out = Long.valueOf(
//					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
//			Slonie slonie = new Slonie();
//			long wynik = slonie.policz(in);
//			assertThat(wynik).isEqualTo(out);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void slo9b() {
//		String fileName = "slo9b";
//		try {
//			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
//			long out = Long.valueOf(
//					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
//			Slonie slonie = new Slonie();
//			long wynik = slonie.policz(in);
//			assertThat(wynik).isEqualTo(out);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void slo10a() {
//		String fileName = "slo10a";
//		try {
//			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
//			long out = Long.valueOf(
//					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
//			Slonie slonie = new Slonie();
//			long wynik = slonie.policz(in);
//			assertThat(wynik).isEqualTo(out);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void slo10b() {
//		String fileName = "slo10b";
//		try {
//			List<String> in = Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".in"));
//			long out = Long.valueOf(
//					Files.readAllLines(Paths.get("src/main/java/finbarre/slonie/dane/" + fileName + ".out")).get(0));
//			Slonie slonie = new Slonie();
//			long wynik = slonie.policz(in);
//			assertThat(wynik).isEqualTo(out);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
