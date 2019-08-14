import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		palavras.add("abaixo");
		
		Collections.sort(palavras);
		System.out.println(palavras);
		
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		palavras.forEach(palavra -> System.out.println(palavra));
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(String::length));
		
		palavras.sort(Comparator.naturalOrder()); // .comparing(s -> s.length()));
		
		palavras.forEach(p -> System.out.println(p));
		
		System.out.println("------------------------");
		
		palavras.forEach(System.out::println);
	}

}
