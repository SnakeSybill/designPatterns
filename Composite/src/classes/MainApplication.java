package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApplication {

	public static void main(String[] args) {
		
		Caixa caixaPrincipal = montaArvore();
		double valorFinal = caixaPrincipal.calculaValor();
		System.out.println(valorFinal);
	}
	
	/*
	 * Monta a árvore proposta em resources/DesignPatterns.pptx
	 */
	private static Caixa montaArvore() {
		Item fone1 = new Fone();
		Item fone2 = new Fone();
		Item laptop = new Laptop();
		List<Item> canetas = new ArrayList<Item>();
		
		for(int i = 0; i<80; i++) {
			canetas.add(new Caneta());
		}
		
		Caixa caixa1 = new Caixa();
		Caixa caixa2 = new Caixa();
		Caixa caixa3 = new Caixa();
		Caixa caixa4 = new Caixa();
		Caixa caixa5 = new Caixa();
		
		caixa5.addItens(canetas);
		caixa4.addItem(fone2);
		caixa3.addItem(caixa5);
		caixa2.addItem(fone1);
		caixa1.addItens(Arrays.asList(caixa2, caixa3, caixa4, laptop));
		
		return caixa1;
	}

}
