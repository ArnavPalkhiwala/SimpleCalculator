import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel();
	JTextField num1 = new JTextField("Number 1");
	JTextField num2 = new JTextField("Number 2");
	JLabel answer = new JLabel("Answer: ");
	JButton addition = new JButton("Addition");
	JButton subtraction = new JButton("Subtraction");
	JButton multiplication = new JButton("Multiplication");
	JButton division = new JButton("Divison");
	JButton square = new JButton("Square");
	GridLayout gl = new GridLayout(4, 0);

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.calculate();
	}

	void calculate() {
		frame.add(panel);
		JOptionPane.showMessageDialog(null,
				"Since this is a very basic calculator, you can only complete operations on two numbers. \nYou will choose your numbers by highlighting and replacing the texts for number 1 and number 2. \nFor the squaring, it will square number 1 by default so make sure to set the text of number 1 to the value you would like.");
		num1.setHorizontalAlignment(SwingConstants.CENTER );
		num2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(num1);
		panel.add(num2);
		num1.addActionListener(this);
		num2.addActionListener(this);
		addition.setHorizontalAlignment(SwingConstants.CENTER);
		subtraction.setHorizontalAlignment(SwingConstants.CENTER);
		multiplication.setHorizontalAlignment(SwingConstants.CENTER);
		division.setHorizontalAlignment(SwingConstants.CENTER);
		square.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(addition);
		panel.add(subtraction);
		panel.add(multiplication);
		panel.add(division);
		panel.add(square);
		addition.addActionListener(this);
		subtraction.addActionListener(this);
		multiplication.addActionListener(this);
		division.addActionListener(this);
		square.addActionListener(this);
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(answer);
		panel.setLayout(gl);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addition) {
			try {
				String firstNumber = num1.getText();
				String secondNumber = num2.getText();
				double firstNum = Double.parseDouble(firstNumber);
				double secondNum = Double.parseDouble(secondNumber);
				double sum = firstNum + secondNum;
				String value = Double.toString(sum);
				answer.setText("Answer: " + value);

			}

			catch (Exception a) {
				JOptionPane.showMessageDialog(null, "Make sure to set number 1 and number 2 to actual numbers");
			}
		} else if (e.getSource() == subtraction) {
			try {
				String firstNumber = num1.getText();
				String secondNumber = num2.getText();
				double firstNum = Double.parseDouble(firstNumber);
				double secondNum = Double.parseDouble(secondNumber);
				double difference = firstNum - secondNum;
				String value = Double.toString(difference);
				answer.setText("Answer: " + value);

			}

			catch (Exception a) {
				JOptionPane.showMessageDialog(null, "Make sure to set number 1 and number 2 to actual numbers");
			}

		}

		else if (e.getSource() == multiplication) {
			try {
				String firstNumber = num1.getText();
				String secondNumber = num2.getText();
				double firstNum = Double.parseDouble(firstNumber);
				double secondNum = Double.parseDouble(secondNumber);
				double product = firstNum * secondNum;
				String value = Double.toString(product);
				answer.setText("Answer: " + value);

			}

			catch (Exception a) {
				JOptionPane.showMessageDialog(null, "Make sure to set number 1 and number 2 to actual numbers");
			}
		}

		else if (e.getSource() == division) {
			try {
			
				String firstNumber = num1.getText();
				String secondNumber = num2.getText();
				double firstNum = Double.parseDouble(firstNumber);
				double secondNum = Double.parseDouble(secondNumber);
				if (secondNum != 0) {
					double quotient = firstNum / secondNum;
					String value = Double.toString(quotient);
					answer.setText("Answer: " + value);

				}
				
				else {
					answer.setText("Answer: Undefined");
				}
			}

			catch (Exception a) {
				JOptionPane.showMessageDialog(null, "Make sure to set number 1 and number 2 to actual numbers");
			}
		}
		
		else {
			
			try {
			String firstNumber = num1.getText();
			double firstNum = Double.parseDouble(firstNumber);
			double product = firstNum * firstNum;
			answer.setText("Answer: " + product);
			}
			
			catch(Exception f) {
				JOptionPane.showMessageDialog(null, "Make sure you set a the value of the number 1 to the number you would like to square.");

					
				}
			
			
			
			
		}
	}

}