package Operadores_Ternarios;

import java.awt.Dialog;

public class media {

	public static void main(String[] args) {
		
		
		int nota1 = 10;
		int nota2 = 8;
		int nota3 = 9;
		int nota4 = 10;
		int media =0;
		
		media = nota1 + nota2 + nota3 + nota4 /4;
		
		
		String resultadoTernario;
		
		
		resultadoTernario = media >= 7 ? "Aluno Aprovado" : "Aluno Reprovado"; 
		
		System.out.println(resultadoTernario);
	
	}
}
