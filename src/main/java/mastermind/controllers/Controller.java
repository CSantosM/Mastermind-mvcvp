package mastermind.controllers;

import mastermind.models.Combination;
import mastermind.models.Session;

public abstract class Controller {

	protected final Session session;

	Controller(Session session) {
		this.session = session;
	}

	public abstract void control();

	public int getWidth() {
		return Combination.getWidth();
	}

}
