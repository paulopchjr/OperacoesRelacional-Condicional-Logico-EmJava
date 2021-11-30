package Divisoes_Resto_com_MOD;

import javax.swing.JOptionPane;

public class resto {

	
	public static void main(String[] args) {
		
		
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de Pessoas para viagem?");
		String carros = JOptionPane.showInputDialog("Informe a quantidade de Carros?");
		
		
		double n1 = Double.parseDouble(pessoas);
		double n2 = Double.parseDouble(carros);
		double resto = n1 % n2;
		
		System.out.println("Sobrou "+ resto+ "pessoas");
			
	
	
	}
}
