package Operacoes_Swicth_e_Case;

import javax.swing.JOptionPane;

public class OperacoesExatas {
	
	public static void main(String[] args) {
		
		
		
		String  n = JOptionPane.showInputDialog(null, "Informe um n�mero para, para compaprar o dia da semana?");
		
		int numero = Integer.parseInt(n);
		
		
		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda-Feira");
			break;

		case 3:
			System.out.println("Ter�a-Feira");
			break;

		case 4:
			System.out.println("Quarta-Feira");
			break;

		case 5:
			System.out.println("Quinta-Feira");
			break;

		case 6:
			System.out.println("Sexta-Feira");
			break;

		case 7:
			System.out.println("Sab�do");
			break;

		default: System.out.println("N�o existe a numera��o para o dia");
			break;
		}
		
		
		
		
	}

}
