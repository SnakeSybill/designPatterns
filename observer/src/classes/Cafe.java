package classes;

import java.util.concurrent.TimeUnit;

import enums.Eventos;

public class Cafe {

	public static int GARRAFA_CHEIA = 3;
	
	public static int TEMPO_PRA_FAZER = 3;
	
	public GerenciadorDeEventos gerente;

	private int counterCafe;
	
	private boolean fazendoCafe;

	public Cafe() {
		gerente = new GerenciadorDeEventos();
		counterCafe = 0;
		fazendoCafe = false;
	}

	public void checaSeTemCafe() throws InterruptedException {
		if (this.counterCafe == 0 && !fazendoCafe) {
			System.out.printf("Acabou o café!");
			System.out.println();
			gerente.notify(Eventos.ACABOU_CAFE.getDescricao(), this);
		} else if(this.counterCafe < GARRAFA_CHEIA && this.fazendoCafe) {
			this.counterCafe++;
			System.out.printf(".");
			TimeUnit.SECONDS.sleep(TEMPO_PRA_FAZER);
		} else if(this.counterCafe == GARRAFA_CHEIA) {
			fazendoCafe = false;
			System.out.printf("Café pronto!");
			System.out.println();
			gerente.notify(Eventos.SAIU_CAFE_NOVO.getDescricao(), this);
		} else {
			counterCafe--;
			TimeUnit.SECONDS.sleep(TEMPO_PRA_FAZER);
		}
	}

	public int getCounterCafe() {
		return counterCafe;
	}

	public void addCounterCafe() {
		this.counterCafe++;
	}
	public void dimCounterCafe() {
		this.counterCafe--;
	}

	public boolean isFazendoCafe() {
		return fazendoCafe;
	}

	public void setFazendoCafe(boolean fazendoCafe) {
		this.fazendoCafe = fazendoCafe;
	}

	
}
