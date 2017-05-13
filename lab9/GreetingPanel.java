import javax.swing.*;

	public class GreetingPanel extends JPanel {

		private JLabel greeting; //display a greeting

		public GreetingPanel() {
			//Create the label
			greeting = new JLabel("Travel Expenses Calculator");
			add(greeting);
		}
	}
