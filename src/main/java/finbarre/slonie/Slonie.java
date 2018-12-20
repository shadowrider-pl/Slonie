package finbarre.slonie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class Slonie {

	public long policz(List<String> in) {

		String[] masyStr = in.get(1).split(" ");
		long[] masy = Arrays.stream(masyStr).mapToLong(Long::parseLong).toArray();

		List<Long> docelowe = Arrays.asList(in.get(2).split(" ")).stream().map(s -> Long.parseLong(s.trim()))
				.collect(Collectors.toList());
		List<Long> aktualne = Arrays.asList(in.get(3).split(" ")).stream().map(s -> Long.parseLong(s.trim()))
				.collect(Collectors.toList());

		
		long wynik = 0;
		List<List<Long>> cykle = new ArrayList<>();
		List<Long> uzyte = new ArrayList<>();
		long sumaMasSloni = 0;
		long najmniejszySlonWCyklu = 1000000000;
		LongSummaryStatistics najmniejszySlonWOgoleStat = Arrays.stream(masy).summaryStatistics();
		long najmniejszySlonWOgole = najmniejszySlonWOgoleStat.getMin();
		long metoda1 = 0;
		long metoda2 = 0;

		while (aktualne.size() > 0) {
			List<Long> cykl = new ArrayList<>();
			boolean pierwszy = true;
			boolean koniecCyklu = false;
			long szukaj = 0;
			long pierwszyWCyklu = 0;
			long znalezione = 0;
			long r1=aktualne.get(0);
			long r2=docelowe.get(0);
			if (r1 == r2) {
				aktualne.remove(0);
				docelowe.remove(0);
				pierwszy = false;
				koniecCyklu = true;
			}
			if (pierwszy) {
				pierwszyWCyklu = r1;
				cykl.add(r1);
				szukaj = r2;
				pierwszy = false;
				aktualne.remove(0);
				docelowe.remove(0);
			}

			while (!koniecCyklu) {
				cykl.add(szukaj);
				znalezione = szukaj;
				try {
					int indexOf = aktualne.indexOf(szukaj);
					szukaj = docelowe.get(indexOf);
					aktualne.remove(indexOf);
					docelowe.remove(indexOf);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				if (szukaj == pierwszyWCyklu) {
					koniecCyklu = true;
					cykle.add(cykl);
				}
			}

		}

		for (List<Long> cykl : cykle) {
			sumaMasSloni = 0;
			najmniejszySlonWCyklu = 1000000000;
			int wielkoscCyklu=cykl.size();
			for (long i : cykl) {
				long masa=masy[(int) (i - 1)];
				sumaMasSloni = sumaMasSloni + masa;
				if (masa < najmniejszySlonWCyklu)
					najmniejszySlonWCyklu = masa;

			}
			metoda1 = sumaMasSloni + ((wielkoscCyklu - 2) * najmniejszySlonWCyklu);
			metoda2 = sumaMasSloni + najmniejszySlonWCyklu + ((wielkoscCyklu + 1) * najmniejszySlonWOgole);
			wynik = wynik + Math.min(metoda1, metoda2);
		}
		return wynik;
	}
}
