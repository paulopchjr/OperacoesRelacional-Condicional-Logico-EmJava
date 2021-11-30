package Criando_Entrada_de_Dados;

import javax.swing.JOptionPane;

public class entrada {

	
	public static void main(String[] args) {
		
		
		String pessoas = JOptionPane.showInputDialog("Informe  a quantidade de pessoas?");
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		
		
		
		double p = Double.parseDouble(pessoas);
		double c = Double.parseDouble(carros);
		int div = (int)(p/c);
		
		double resto = p % c;
		
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		
		if(resposta ==0) {
			JOptionPane.showMessageDialog(null, "Dvisão para pessoas deu "
					+ ""+div+"carros e sobrou" +resto+" carros" );
		
		}
	}
}
