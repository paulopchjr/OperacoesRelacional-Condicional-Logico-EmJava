package Operacoes_Swicth_e_Case;

import javax.swing.JOptionPane;

public class OperacoesExatas {
	
	public static void main(String[] args) {
		
		
		
		String  n = JOptionPane.showInputDialog(null, "Informe um número para, para compaprar o dia da semana?");
		
		int numero = Integer.parseInt(n);
		
		
		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda-Feira");
			break;

		case 3:
			System.out.println("Terça-Feira");
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
			System.out.println("Sabádo");
			break;

		default: System.out.println("Não existe a numeração para o dia");
			break;
		}
		
		
		
		
	}

}
