package Divisoes_Resto_com_MOD;

import javax.swing.JOptionPane;

public class divisoes {
	
	public static void main(String[] args) {
		
		
		
		String n = JOptionPane.showInputDialog("Digite um n�mero qualquer e olha se ele � impar ou par");
	
		double mod = Double.parseDouble(n);
		
		if(mod%2 == 0) {
			
			System.out.println(mod+" � um n�mero Par");
		}else {
			System.out.println(mod + " � um numero Impar");
		}
	
	
	}
}

