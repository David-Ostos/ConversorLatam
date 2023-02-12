package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosColombianosADolares(double valorRecibido) {
		double monedaDolar = valorRecibido / 4801.53;
		monedaDolar = (double) Math.round(monedaDolar *100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	public void ConvertirPesosColombianosAEuros(double valorRecibido) {
		double moneda = valorRecibido / 5068.89;
		moneda = (double) Math.round(moneda *100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Euros");
	}
	
	
	public void ConvertirPesosColombianosALibras(double valorRecibido) {
		
		double moneda = valorRecibido / 5721.96;
		moneda = (double) Math.round(moneda *100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Libras");
	}
	
	public void ConvertirPesosColombianosAYenes(double valorRecibido) {
		
		double moneda = valorRecibido / 696.54;
		moneda = (double) Math.round(moneda *100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Yenes");
	}
	
	public void ConvertirPesosColombianosAWonCoreanos(double valorRecibido) {
		
		double moneda = valorRecibido / 3.74;
		moneda = (double) Math.round(moneda *100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Wones Coreanos");
	}
	
	public void ConvertirDolarAPesosColombianos(double valorRecibido) {
		
		double moneda = 4801.53 / valorRecibido;
		moneda = (double) Math.round(moneda *100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Pesos");
	}
	
	public void ConvertirEuroAPesosColombianos(double valorRecibido) {
		
		double moneda = 5068.89 / valorRecibido;
		moneda = (double) Math.round(moneda *100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Pesos");
	}
	
	public void ConvertirLibrasAPesosColombianos(double valorRecibido) {
		
		double moneda = 5721.96 / valorRecibido;
		moneda = (double) Math.round(moneda *100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Pesos");
	}
	
	public void ConvertirYenAPesosColombianos(double valorRecibido) {
		
		double moneda = 696.54 / valorRecibido;
		moneda = (double) Math.round(moneda *100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Pesos");
	}
	
	public void ConvertirWonCoreanosAPesosColombianos(double valorRecibido) {
		
		double moneda = 3.74 / valorRecibido;
		moneda = (double) Math.round(moneda *100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Pesos");
	}

}
