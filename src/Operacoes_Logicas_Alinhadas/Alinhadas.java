package Operacoes_Logicas_Alinhadas;

public class Alinhadas {
	
	public static void main(String[] args) {
		
		
		int nota1=10;
		
		int nota2 =10;
		
		int nota3 =10;
		
		int nota4 =10;
		
		int media =0;
	 
		
		media=(nota1 +nota2 + nota3 + nota4) /4;
		
		
		/*Operra��es logicas alinhadas: S�o operaoc�es dentro de operao��es*/
		System.out.println("M�dia do Aluno � :" + media);
		
		if(media >=4) {
			
			
			
			
			if(media >=7 && media <=9) {
				System.out.println("Aluno Aprovado");
			}else if(media == 10)  {
				System.out.println("Aluno, meus Parab�ns voc� passou com nota M�xima");
			}else {
				System.out.println("Aluno est� em recupera��o");
			}
		}
		else {
			System.out.println("Aluno, voc� est� reprovado");
		}
		
	}

}
