package caixa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CaixaEletronico {

	private List<Integer> notasDisponiveis;

	public CaixaEletronico() {
		notasDisponiveis = new ArrayList<>();
		notasDisponiveis.add(Integer.valueOf(100));
		notasDisponiveis.add(Integer.valueOf(50));
		notasDisponiveis.add(Integer.valueOf(20));
		notasDisponiveis.add(Integer.valueOf(10));
	}

	public Map<Integer, Integer> sacar(int valorSacado) {

		Map<Integer, Integer> saque = new HashMap<Integer, Integer>();
		Integer resto = valorSacado;
		
		resto = sacarRecursivo(saque, resto);
		if(resto != 0){
			throw new RuntimeException();
		}
		return saque;
	}

	private Integer sacarRecursivo(Map<Integer, Integer> saque, Integer resto) {
		
		if (resto < 10){
			return resto;
		}
		
		for (Integer valorNota : this.notasDisponiveis) {
			if(valorNota <= resto) {
				saque.put(valorNota, saque.get(valorNota) != null ? saque.get(valorNota) + 1 : 1);
				resto -= valorNota;
				break;
			}
		}
		return sacarRecursivo(saque, resto);
	}

	private Integer calculaResto(int valorSacado, Map<Integer, Integer> saque) {
		Integer resto = 0;
		for (int i = 0; i < notasDisponiveis.size(); i++) {
			Integer maiorNota = notasDisponiveis.get(i);
			if (valorSacado > maiorNota) {
				saque.put(maiorNota, 1);
				resto = valorSacado - maiorNota;
				break;
			}
		}
		return resto;
	}

}
