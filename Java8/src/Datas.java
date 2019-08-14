import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		LocalDate olimpiadasDoJapao = LocalDate.of(2020, Month.JULY, 24);
		
		int anos = olimpiadasDoJapao.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasDoJapao);
		
		System.out.println("Meses: " + periodo.getMonths() + ", dias: " + periodo.getDays());

		LocalDate proximaOlimpiada = hoje.plusYears(4);
		
		System.out.println(proximaOlimpiada);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Hoje: " + formatador.format(olimpiadasDoJapao));
		
		LocalDate eras = LocalDate.of(-2000000, Month.JANUARY, 1);
		
		System.out.println(eras.getEra());
		System.out.println(hoje.getEra().getValue());
				
	}

}
