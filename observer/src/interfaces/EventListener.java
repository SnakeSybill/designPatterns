package interfaces;

import classes.Cafe;

public interface EventListener {

	public void atualiza(Cafe dados, String evento) throws InterruptedException;
}
