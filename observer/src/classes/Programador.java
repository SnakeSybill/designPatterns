package classes;

import java.util.concurrent.TimeUnit;

import enums.Eventos;
import interfaces.EventListener;

public class Programador implements EventListener {

	private String nome;

	public void atualiza(Cafe dados, String tipoEvento) throws InterruptedException {
		if (Eventos.ACABOU_CAFE.getDescricao().equals(tipoEvento)) {
			dados.setFazendoCafe(true);
			System.out.printf(String.format("%s foi fazer café", nome));
			System.out.println();
			TimeUnit.SECONDS.sleep(1);
		} else if (Eventos.SAIU_CAFE_NOVO.getDescricao().equals(tipoEvento)) {
			dados.dimCounterCafe();
			System.out.printf(String.format("%s tá tomando café", nome));
			System.out.println();
			TimeUnit.SECONDS.sleep(1);
		}
	}

	public Programador(String nome) {
		super();
		this.nome = nome;
	}

}
