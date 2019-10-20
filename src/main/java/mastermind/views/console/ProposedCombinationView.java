package mastermind.views.console;

import java.util.List;

import mastermind.types.Color;
import mastermind.views.console.ColorView;
import santaTecla.utils.WithConsoleView;
import mastermind.views.MessageView;

public class ProposedCombinationView extends WithConsoleView {
	
	
	public ProposedCombinationView() {
	}
	
	void write(List<Color> colorList) {
		for (Color color : colorList) {
			new ColorView(color).write();
		}
	}

	public String read() {
		String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
		
		return characters;
	}

	public void writeln(String message) {
		this.console.writeln(message);
		
	}
	
}
