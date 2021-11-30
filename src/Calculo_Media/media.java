package Calculo_Media;

import javax.swing.JOptionPane;

public class media {
	
	public static void main(String[] args) {
		
	String n1 = JOptionPane.showInputDialog("Informe a nota 1");
	String n2 = JOptionPane.showInputDialog("Informe a nota 2");
	String n3 = JOptionPane.showInputDialog("Informe a nota 3");
	String n4 = JOptionPane.showInputDialog("Informe a nota 4");
	
	double dn1 = Double.parseDouble(n1);
	double dn2 = Double.parseDouble(n2);
	double dn3 = Double.parseDouble(n3);
	double dn4 = Double.parseDouble(n4);
	
	double media = (dn1 + dn2 + dn3 + dn4) / 4;
	
	if(media >= 4) {
		 if( media >9){
			JOptionPane.showMessageDialog(null, "Parabéns Aluno, aprovado com nota Máxima");
		}else if( media >7){
			JOptionPane.showMessageDialog(null, "Aluno aprovado!");
			}else {
			JOptionPane.showInternalMessageDialog(null, "Aluno Recuperação");
		}
	}else {
		JOptionPane.showInternalMessageDialog(null, "Aluno Reprovado");
	}
	
	}

}
