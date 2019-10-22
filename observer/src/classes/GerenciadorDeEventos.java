package classes;

import java.util.HashMap;
import java.util.Map;

import interfaces.EventListener;

public class GerenciadorDeEventos {

	private Map<String, EventListener> listeners = new HashMap<String, EventListener>();

	public void inscrever(String tipoEvento, EventListener listener) {
		this.listeners.put(tipoEvento, listener);
	}

	public void desInscrever(String tipoEvento, EventListener listener) {
		this.listeners.remove(tipoEvento, listener);
	}

	public void notify(String tipoEvento, Cafe cafe) throws InterruptedException {
		for (Map.Entry<String, EventListener> entry : listeners.entrySet()) {
			if(tipoEvento.contentEquals(entry.getKey()))
				entry.getValue().atualiza(cafe, tipoEvento);
		}
	}

}
