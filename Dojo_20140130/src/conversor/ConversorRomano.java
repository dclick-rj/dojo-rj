package conversor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConversorRomano {

	private Map<String, Integer> mapHinduArabico = new HashMap<String, Integer>();
	private Set<String> excecoes = new HashSet<String>();

	public ConversorRomano() {
		mapHinduArabico.put("I", 1);
		mapHinduArabico.put("V", 5);
		mapHinduArabico.put("X", 10);
		mapHinduArabico.put("L", 50);
		mapHinduArabico.put("C", 100);
		mapHinduArabico.put("D", 500);
		mapHinduArabico.put("M", 1000);

		excecoes.add("IIII");
		excecoes.add("VV");
		excecoes.add("XXXX");
		excecoes.add("LL");
		excecoes.add("CCCC");
		excecoes.add("DD");
		excecoes.add("MMMM");
		excecoes.add("VL");
	}

	public Integer converterParaHinduArabico(String caractere) {
		for (String excecao : excecoes) {
			if (caractere.indexOf(excecao) >= 0) {
				throw new RuntimeException();
			}
		}
		Integer valor = new Integer(0);
		
		for (int i = 0; i < caractere.length(); i++) {
			String c = String.valueOf(caractere.charAt(i));
			String charAnterior = i > 0 ? String.valueOf(caractere.charAt(i - 1)) : null;
			if(charAnterior != null && 
					(mapHinduArabico.get(c) > mapHinduArabico.get(charAnterior))){
				valor -= mapHinduArabico.get(c);
				valor = valor * (-1);
			}else{
				valor += mapHinduArabico.get(c);
			}
		}
		return valor;
	}

}
