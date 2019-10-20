package mastermind.views.console;

import mastermind.models.Session;
import santaTecla.utils.WithConsoleView;

public class GameView extends WithConsoleView {

	public GameView() {
	}

	public void wtrite(Session session) {
		new AttemptsView().writeln(session.getAttempts());
		new SecretCombinationView().writeln(session.getGameWidth());

		for (int i = 0; i < session.getAttempts(); i++) {
			new ProposedCombinationView().write(session.getColors(i));

			new ResultView().writeln(session.getBlacks(i), session.getWhites(i));

		}

	}

}
