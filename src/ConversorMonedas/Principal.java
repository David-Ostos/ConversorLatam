package ConversorMonedas;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Funcion monedas = new Funcion();
		
		
		String opciones = (JOptionPane.showInputDialog(null, 
				"Seleccione una opción de conversión ", 
				"Menu", 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				new Object[] {"Conversor de Moneda", "Conversor de Temperatura"},
				"Seleccion")).toString();
		
		switch (opciones) {
		case "Conversor de Moneda":{ 
			String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
			double valorRecibido = Double.parseDouble(input);
			monedas.ConvertirMonedas(valorRecibido);
			break;
		}
		case "Conversor de Temperatura":{ 
			String input = JOptionPane.showInputDialog("Ingrese un valor para convertir la temperatura");
			double valorRecibido = Double.parseDouble(input);
			break;
		}
		
		
		

		
		}
	}
}
