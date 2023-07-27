package com.conversor.modelo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JList;
import javax.swing.JTextArea;

public class Conversor {

	private JFrame frame;
	private JButton submitBtn;
	private JTextField text;
	private JComboBox listSelect;
	private JLabel resultBox;

	public double dolar = 16.84;
	public double euro = 18.67;
	public double libra = 21.80;

	public double valorInput = 00.00;
	
	public enum Monedas{
		peso_dolar,
		peso_euro,
		peso_libra,
		dolar_peso,
		euro_peso,
		libra_peso
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor window = new Conversor();
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
	public Conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		text = new JTextField();
		text.setBounds(35, 31, 161, 19);
		frame.getContentPane().add(text);
		text.setColumns(10);

		listSelect = new JComboBox<Monedas>();
		listSelect.setModel(new DefaultComboBoxModel<>(Monedas.values()));
		listSelect.setBounds(35, 62, 161, 24);
		frame.getContentPane().add(listSelect);

		submitBtn = new JButton("Submit");
		submitBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Convertir();
			}
		});
		submitBtn.setBounds(58, 98, 117, 25);
		frame.getContentPane().add(submitBtn);

		resultBox = new JLabel("0.00");
		resultBox.setBounds(87, 139, 70, 15);
		frame.getContentPane().add(resultBox);
		
		
		JLabel lblNewLabel = new JLabel("Peso");
		lblNewLabel.setBounds(310, 33, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso");
		lblNewLabel_1.setBounds(310, 62, 70, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Peso");
		lblNewLabel_1_1.setBounds(310, 89, 70, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
	
	public void Convertir() {
		if(Validacion(text.getText())) {
			

		Monedas moneda = (Monedas) listSelect.getSelectedItem();
		
		switch (moneda) {
		 case peso_dolar: 
			 PesosAMoneda(dolar);
			 break;
		 case peso_euro: 
			 PesosAMoneda(euro);
			 break;
		 case peso_libra: 
			 PesosAMoneda(libra);
			 break;
		 case dolar_peso: 
			 MonedaAPesos(dolar);
			 break;	 			 	
			}
		} 
	}
	
	public void PesosAMoneda(double value) {
		double resultado = valorInput / value;
		resultBox.setText(Redondear(resultado));
	}
	
	public void MonedaAPesos(double value) {
		double resultado = valorInput * value;
		resultBox.setText(Redondear(resultado));
	}
	
	public String Redondear(double value) {
		DecimalFormat redondear = new DecimalFormat("0.00");
		redondear.setRoundingMode(RoundingMode.HALF_UP);
		return redondear.format(value);
	}
	
	public boolean Validacion(String txt) {
	try {
		double x = Double.parseDouble(txt);
		if(x>0)
			valorInput = x;
			return true;
		} catch (NumberFormatException e) {
			text.setText("Solamente numeros");
			return false;
		}
	}
}
