package Operadores_While;

import javax.swing.JOptionPane;

public class Estrutura_Repeticao_While {
	
	public static void main(String[] args) {
	
		
		/*Enquanto tiver verdadeira ele escuta*/
		
		
		String n = JOptionPane.showInputDialog("Informe um numéro para o cálculo de uma taboada");
		
		
		int numero = Integer.parseInt(n);
		int multiplicador = 1;
		int  resultado =0;
		while(multiplicador <=10) {
			
			resultado = (numero * multiplicador);
			System.out.println(numero+" * "  +  multiplicador + " = " + resultado);
			multiplicador++;
			
			
			
		}
	}

}
