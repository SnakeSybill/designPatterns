package classes;

import java.util.ArrayList;
import java.util.List;

/*
 * Classe caixa, herda a classe Item pois uma caixa pode ser um nó da árvore
 */
public class Caixa extends Item {

	private static double VALOR_CAIXA = 0;

	private List<Item> itens;

	public double calculaValor() {
		if (this.itens.size() > 0) {
			for (Item item : itens) {
				super.valor += item.calculaValor();
			}
		} 
		return super.valor;
	}

	public Caixa() {
		this.itens = new ArrayList<Item>();
		super.valor = VALOR_CAIXA;
	}

	public void addItem(Item item) {
		this.itens.add(item);
	}

	public void addItens(List<Item> itens) {
		this.itens.addAll(itens);
	}
}
