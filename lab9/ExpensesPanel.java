import javax.swing.*;
import java.awt.*;

public class ExpensesPanel extends JPanel {
	
	private JPanel panel;
	private JLabel daysTripLabel;
	private JLabel airfareLabel;
	private JLabel carRentalLabel;
	private JLabel carMilesDrivenLabel;
	private JLabel carParkFeesLabel;
	private JLabel taxiChargeLabel;
	private JLabel confFeesLabel;
	private JLabel lodgingChargesLabel;
	
	private JTextField daysTripTextField;
	private JTextField airfareTextField;
	private JTextField carRentalTextField;
	private JTextField carMilesDrivenTextField;
	private JTextField carParkFeesTextField;
	private JTextField taxiChargeTextField;
	private JTextField confFeesTextField;
	private JTextField lodgingChargesTextField;

	public ExpensesPanel() {
		setLayout(new GridLayout(8,2));

		setBorder(BorderFactory.createTitledBorder("Expenses"));


	daysTripLabel = new JLabel("Days on trip:");
	daysTripTextField = new JTextField(10);

	airfareLabel = new JLabel("Airfare amount:");
	airfareTextField = new JTextField(10);

	carRentalLabel = new JLabel("Car Rental Fees:");
	carRentalTextField = new JTextField(10);

	carMilesDrivenLabel = new JLabel("Miles Driven (Personal Vehicle):");
	carMilesDrivenTextField = new JTextField(10);

	carParkFeesLabel = new JLabel("Parking Fees:");
	carParkFeesTextField = new JTextField(10);

	taxiChargeLabel = new JLabel("Taxi Fees:");
	taxiChargeTextField = new JTextField(10);

	confFeesLabel = new JLabel("Conference/Seminar Registration Fees:");
	confFeesTextField = new JTextField(10);

	lodgingChargesLabel = new JLabel("Lodging charges/night:");
	lodgingChargesTextField = new JTextField(10);

		add(daysTripLabel);
		add(daysTripTextField);

		add(airfareLabel);
		add(airfareTextField);

		add(carRentalLabel);
		add(carRentalTextField);

		add(carMilesDrivenLabel);
		add(carMilesDrivenTextField);

		add(carParkFeesLabel);
		add(carParkFeesTextField);

		add(taxiChargeLabel);
		add(taxiChargeTextField);

		add(confFeesLabel);
		add(confFeesTextField);

		add(lodgingChargesLabel);
		add(lodgingChargesTextField);


	}

	public double getDaysTrip() {
		try {
			return Double.parseDouble(daysTripTextField.getText());
		} catch  (NumberFormatException asdf){
			System.out.println("Exception caught, expensesPanel.getDaysTrip()");
			JOptionPane.showMessageDialog(null,"Error, Please only enter numbers","error",JOptionPane.ERROR_MESSAGE);
			return 0;
		}
	}

	/*Clears all Fields in the form
 	 *
 	 */
	public void clearForm() {
		daysTripTextField.setText("");
		airfareTextField.setText("");
		carRentalTextField.setText("");
		carMilesDrivenTextField.setText("");
		carParkFeesTextField.setText("");
		taxiChargeTextField.setText("");
		confFeesTextField.setText("");
		lodgingChargesTextField.setText("");
	}
}

