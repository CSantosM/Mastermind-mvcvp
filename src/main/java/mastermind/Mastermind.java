package mastermind;

import java.util.Map;

import mastermind.controllers.Controller;
import mastermind.controllers.ProposalController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.models.Session;
import mastermind.models.StateValue;

class Mastermind {

	private Session session;

	private Map<StateValue, Controller> controllers;

	Mastermind() {
		this.session = new Session();
		this.controllers.put(StateValue.INITIAL, new StartController(this.session));
		this.controllers.put(StateValue.IN_GAME, new ProposalController(this.session));
		this.controllers.put(StateValue.FINAL, new ResumeController(this.session));
		this.controllers.put(StateValue.EXIT, null);
	}

	void play() {
		Controller controller;

		do {
			controller = this.controllers.get(this.session.getStateValue());
			if (controller != null) {
				controller.control();
			}
		} while (controller != null);
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

}
