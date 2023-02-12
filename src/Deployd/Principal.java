package Deployd;


import javax.swing.JOptionPane;

import ConversorMonedas.Funcion;
import ConversorTemperatura.FuncionT;

public class Principal {

	public static void main(String[] args) {
		
		Funcion monedas = new Funcion();
		FuncionT temperatura = new FuncionT();
		
		boolean confirmar = true ;
		
		 while(confirmar == true) {
		
		String opciones = (JOptionPane.showInputDialog(
				null, "Seleccione una opción de conversión ","Menu",
				JOptionPane.QUESTION_MESSAGE,null, new Object[] 
				{"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
		
		switch (opciones) {
			case "Conversor de Moneda":{ 
				String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
				
				if(ValidarNumero(input) == true) {
					
					double valorRecibido = Double.parseDouble(input);
					monedas.ConvertirMonedas(valorRecibido);	
					
					int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					
					if (JOptionPane.OK_OPTION == seleccion) {
						
						System.out.println("selecciona opción Afirmativa");
						confirmar = true;
					}else {
						
						JOptionPane.showMessageDialog(null, "Programa terminado");
						confirmar = false;
					
					}
				}else {
					
					JOptionPane.showMessageDialog(null, "Valor invalido, Solo valores numericos");
				}
							
				break;
			}
			case "Conversor de Temperatura":{ 
				String input = JOptionPane.showInputDialog("Ingrese un valor para convertir la temperatura");
				
				if(ValidarNumero(input) == true) {
					
					double valorRecibido = Double.parseDouble(input);
					temperatura.ConvertirTemperatura(valorRecibido);
					
					int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					
					if (JOptionPane.OK_OPTION == seleccion) {
						
						System.out.println("selecciona opción Afirmativa");
					}else {
						
						JOptionPane.showMessageDialog(null, "Programa terminado");
						confirmar = false;
					
					}
				}else {
					
					JOptionPane.showMessageDialog(null, "Valor invalido, Solo valores numericos");
				}
							
				break;
			}
			

		}
	}
	}
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >= 0 || x < 0);
				return true;
		}catch(NumberFormatException e) {
			System.out.println(e);
			return false;
		}
	}

}


