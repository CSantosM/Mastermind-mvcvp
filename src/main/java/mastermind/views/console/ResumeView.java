package mastermind.views.console;

import mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;
import santaTecla.utils.YesNoDialog;

public class ResumeView extends WithConsoleView {

	public ResumeView() {
	}

	public boolean newGame() {
		return new YesNoDialog().read(MessageView.RESUME.getMessage());
	}

}
