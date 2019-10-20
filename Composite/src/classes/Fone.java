package classes;

/*
 * Classe Fone, herda a classe Item pois um fone pode ser um nó da árvore
 */
public class Fone extends Item {

	private static double VALOR_FONE = 100.0; 
	
	public Fone() {
		super.valor = VALOR_FONE;
	}

	public double calculaValor() {
		return super.valor;
	}
}
