package ConversorMonedas;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String opciones = (JOptionPane.showInputDialog(null, 
				"Seleccione una opción de conversión ", 
				"Menu", 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				new Object[] {"Conversor de Moneda", "Conversor de Temperatura"},
				"Seleccion")).toString();
	}
}
