package ConversorMonedas;

import javax.swing.JOptionPane;

public class Funcion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMonedas(double valorRecibido) {
		String opciones = (JOptionPane.showInputDialog(null, 
				"Elija la moneda a la que desea convertir tu dinero ", "Monedas", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"De Pesos a Dolar", 
				 "De Pesos a Euro",
				 "De Pesos a Libras", 
				 "De Pesos a Yen",
				 "De Pesos a Won Coreano", 
				 "De Dolar a Pesos", 
				 "De Euro a Pesos", 
				 "De Libras a Pesos", 
				 "De Yen a Pesos", 
				 "De Won Coreano a Pesos"
				 },
				"Seleccion")).toString();
		
		switch (opciones) {
		case "De Pesos a Dolar" : {
			monedas.ConvertirPesosColombianosADolares(valorRecibido);
			break;
		}
		case "De Pesos a Euro" :{
			monedas.ConvertirPesosColombianosAEuros(valorRecibido);
			break;
		}
		case "De Pesos a Libras" : {
			monedas.ConvertirPesosColombianosALibras(valorRecibido);
			break;
		}
		case "De Pesos a Yen" :{
			monedas.ConvertirPesosColombianosAYenes(valorRecibido);
			break;
		}
		case "De Pesos a Won Coreano" :{
			monedas.ConvertirPesosColombianosAYenes(valorRecibido);
			break;
		}
		case "De Dolar a Pesos" : {
			monedas.ConvertirPesosColombianosADolares(valorRecibido);
			break;
		}
		case "De Euro a Pesos" :{
			monedas.ConvertirPesosColombianosAEuros(valorRecibido);
			break;
		}
		case "De Libras a Pesos" : {
			monedas.ConvertirPesosColombianosALibras(valorRecibido);
			break;
		}
		case "De Yen a Pesos" :{
			monedas.ConvertirPesosColombianosAYenes(valorRecibido);
			break;
		}
		case "De Won Coreano a Pesos" :{
			monedas.ConvertirPesosColombianosAYenes(valorRecibido);
			break;
		}

		}
	}
}
