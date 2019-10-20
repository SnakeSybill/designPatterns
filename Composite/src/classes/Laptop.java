package classes;

/*
 * Classe Laptop, herda a classe Item pois um Laptop pode ser um nó da árvore
 */
public class Laptop extends Item {

	private static double VALOR_LAPTOP = 2500.0;

	public Laptop() {
		super.valor = VALOR_LAPTOP;
	}
	
	public double calculaValor() {
		return super.valor;
	}
}
