package classes;

/*
 * Classe caneta, herda a classe Item pois uma caneta pode ser um nó da árvore
 */
public class Caneta extends Item {

	private static double VALOR_CANETA = 1;

	public Caneta() {
		super.valor = VALOR_CANETA;
	}
	
	public double calculaValor() {
		return super.valor;
	}
}
