package BMIapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import USERLOGIN.BMI;

import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMIapp {

	private JFrame frame;
	private JTextField text1;
	private JTextField text3;
	private JTextField text2;
	private JTextField text4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMIapp window = new BMIapp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BMIapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 485, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BMI CALCULATOR");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 48));
		lblNewLabel.setBounds(10, 11, 452, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your height (cm):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(20, 71, 188, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		text1 = new JTextField();
		text1.setFont(new Font("Tahoma", Font.BOLD, 18));
		text1.setForeground(Color.BLACK);
		text1.setBounds(218, 70, 143, 36);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Your BMI Value is :");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(44, 191, 143, 31);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		text3 = new JTextField();
		text3.setToolTipText("");
		text3.setForeground(Color.GREEN);
		text3.setFont(new Font("Tahoma", Font.BOLD, 20));
		text3.setColumns(10);
		text3.setBounds(218, 191, 143, 35);
		frame.getContentPane().add(text3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter your weight (Kg):");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(20, 130, 175, 31);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		text2 = new JTextField();
		text2.setFont(new Font("Tahoma", Font.BOLD, 18));
		text2.setColumns(10);
		text2.setBounds(218, 129, 143, 36);
		frame.getContentPane().add(text2);
		
		JButton button1 = new JButton("CALCULATE");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double height = Double.parseDouble(text1.getText());
				double weight = Double.parseDouble(text2.getText());
				double BMI = weight / (height/100 * height/100);
				
				String calbmi = String.format("%.2f", BMI);
				text3.setText(calbmi);
				if(BMI <=18.5) {
					text4.setText("     \"You are under weight...\"");
				}
				else if(BMI <= 24.9) {
					text4.setText("     \"You are healthy weight...\"");
				}
				else if(BMI <= 29.9) {
					text4.setText("     \"You are over weight...\"");
				}
				else {
					text4.setText("     \"You are obese...\" ");
				}
				
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button1.setBounds(20, 304, 143, 31);
		frame.getContentPane().add(button1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(328, 304, 102, 31);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(0, 278, 607, 1);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 59, 627, 1);
		frame.getContentPane().add(separator_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
				text4.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(183, 304, 114, 31);
		frame.getContentPane().add(btnReset);
		
		text4 = new JTextField();
		text4.setForeground(Color.MAGENTA);
		text4.setFont(new Font("Sylfaen", Font.BOLD, 23));
		text4.setColumns(10);
		text4.setBounds(37, 236, 342, 31);
		frame.getContentPane().add(text4);
		
		JLabel lblNewLabel_2 = new JLabel("*");
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(20, 226, 22, 31);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
