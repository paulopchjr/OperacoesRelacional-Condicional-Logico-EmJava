package Divisoes_Resto_com_MOD;

import javax.swing.JOptionPane;

public class divisoes {
	
	public static void main(String[] args) {
		
		
		
		String n = JOptionPane.showInputDialog("Digite um número qualquer e olha se ele é impar ou par");
	
		double mod = Double.parseDouble(n);
		
		if(mod%2 == 0) {
			
			System.out.println(mod+" é um número Par");
		}else {
			System.out.println(mod + " é um numero Impar");
		}
	
	
	}
}

