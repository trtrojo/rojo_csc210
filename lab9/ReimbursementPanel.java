import javax.swing.*;
import java.awt.*;

public class ReimbursementPanel extends JPanel {

	private JLabel totalExpensesLabel;
	private JTextField totalExpensesTextField;

	private JLabel totalAllowableExpensesLabel;
	private JTextField totalAllowableExpensesTextField;

	private JLabel excessExpensesLabel;
	private JTextField excessExpensesTextField;

	private JLabel savedExpensesLabel;
	private JTextField savedExpensesTextField;


	public ReimbursementPanel() {

		/* TODO: Implement:
 		 * total expenses incurred by business person
 		 * total allowable expenes
 		 * excess business person needs to pay
 		 * amount saved by person if under the amount
 		 */

		setLayout(new GridLayout(4,2));
		setBorder(BorderFactory.createTitledBorder("Reimbursements"));

		totalExpensesLabel = new JLabel("Total Expenses:");
		totalExpensesTextField = new JTextField(10);

		totalAllowableExpensesLabel = new JLabel("Total Allowable Expenses:");
		totalAllowableExpensesTextField = new JTextField(10);

		excessExpensesLabel = new JLabel("Excess Expenses (You Pay):");
		excessExpensesTextField = new JTextField(10);

		savedExpensesLabel = new JLabel("Expenses amount remaining:");
		savedExpensesTextField = new JTextField(10);

		add(totalExpensesLabel);
		add(totalExpensesTextField);
		
		add(totalAllowableExpensesLabel);
		add(totalAllowableExpensesTextField);

		add(excessExpensesLabel);
		add(excessExpensesTextField);

		add(savedExpensesLabel);
		add(savedExpensesTextField);

		
		//This side should NOT BE EDITABLE
		totalExpensesTextField.setEditable(false);
		totalAllowableExpensesTextField.setEditable(false);
		excessExpensesTextField.setEditable(false);
		savedExpensesTextField.setEditable(false);

	}

	/*Set the ability to modify totalExpenses
 	 *
 	 * @param text -- Amount to place in box
 	 */
	public void setTotalExpenses(String text) {
		totalExpensesTextField.setText(text);
	}

	/* Set the totalAllowableExpensesTextField Text field
 	 *
 	 * @param text - text to be shown in box
 	 */
	public void setTotalAllowableExpenses(String text) {
		totalAllowableExpensesTextField.setText(text);
	}

	/* Set the excessExpensesTextField Text Field
 	 *
 	 * @param text - Text to show in box
 	 */
	public void setExcessExpenses(String text) {
		excessExpensesTextField.setText(text);
	}

	/*Set the savedExpensesTextField Text Field
 	 *
 	 * @param text - text to show in box
 	 */
	public void setSavedExpenses(String text) {
		savedExpensesTextField.setText(text);
	}

	/* Clears all text fields in the form.
 	 *
 	 */
	public void clearForm() {
		totalExpensesTextField.setText("");
		totalAllowableExpensesTextField.setText("");
		excessExpensesTextField.setText("");
		savedExpensesTextField.setText("");
	}

	
}
