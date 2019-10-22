package classes;

import enums.Eventos;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		Cafe cafezin = new Cafe();
		
		Programador tomadorDeCafe = new Programador("O cara que toma o café");
		Programador fazedorDeCafe = new Programador("O cara que faz o café");
		
		cafezin.gerente.inscrever(Eventos.ACABOU_CAFE.getDescricao(), fazedorDeCafe);
		cafezin.gerente.inscrever(Eventos.SAIU_CAFE_NOVO.getDescricao(), tomadorDeCafe);
		
		for(int i = 0; i <= 10; i++) {
			cafezin.checaSeTemCafe();
		}

	}

}
