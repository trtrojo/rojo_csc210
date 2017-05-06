//RetailPriceCalc.java
/* RetailPriceCalc.java
 *
 * Tommy Rojo <tommy.rojo@stu.bmcc.cuny.edu>
 * 
 * Follow the prompt on page (845/846)
 */


import javax.swing.*;
import java.awt.event.*;


public class RetailPriceCalc extends JFrame 
{
	private JPanel panel;

	private JLabel priceTextLabel;
	private JLabel percentageTextLabel;
	private JLabel totalTextLabel;

	private JTextField priceTextField;
	private JTextField percentageTextField;
	private JTextField totalTextField;

	private JButton calcButton;


	private final int WINDOW_WIDTH = 800;
	private final int WINDOW_HEIGHT = 100;

	public RetailPriceCalc(){

		setTitle("Retail Price Calculator");

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));

		buildPanel();

		add(panel);

		pack();
		setVisible(true);


	}

	private void buildPanel() {

		priceTextLabel = new JLabel("Wholesale Price:");
		percentageTextLabel = new JLabel("Percentage:");
		totalTextLabel = new JLabel("Total Price:");
		calcButton = new JButton("Calculate");
		
		priceTextField = new JTextField(10);
		percentageTextField = new JTextField(10);
		totalTextField = new JTextField(10);
		totalTextField.setEditable(false);

		//calcButton.addActionListener(new CalcButtonListener());

		calcButton.addActionListener(calcButtonPreformer);

		panel = new JPanel();


		panel.add(priceTextLabel);
		panel.add(priceTextField);

		panel.add(percentageTextLabel);
		panel.add(percentageTextField);

		panel.add(totalTextLabel);
		panel.add(totalTextField);
		panel.add(calcButton);

		

	}

	public static ActionListener calcButtonPreformer = new ActionListener() {
		public void actionPreformed(ActionEvent e) {

		}
	};

	private class CalcButtonListener implements ActionListener {
	
		public void actionPreformed(java.awt.event.ActionEvent e) {
			String price, percentage;
			double total;

			price = priceTextField.getText();
			percentage = percentageTextField.getText();
			
			total = Double.parseDouble(price) * Double.parseDouble(percentage);
			System.out.println(total);
		}
	}

	public static void main(String[] args) {
		new RetailPriceCalc();
	}

}
