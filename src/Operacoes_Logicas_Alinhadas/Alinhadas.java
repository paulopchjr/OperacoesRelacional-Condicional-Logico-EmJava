package Operacoes_Logicas_Alinhadas;

public class Alinhadas {
	
	public static void main(String[] args) {
		
		
		int nota1=10;
		
		int nota2 =10;
		
		int nota3 =10;
		
		int nota4 =10;
		
		int media =0;
	 
		
		media=(nota1 +nota2 + nota3 + nota4) /4;
		
		
		/*Operrações logicas alinhadas: São operaocões dentro de operaoções*/
		System.out.println("Média do Aluno é :" + media);
		
		if(media >=4) {
			
			
			
			
			if(media >=7 && media <=9) {
				System.out.println("Aluno Aprovado");
			}else if(media == 10)  {
				System.out.println("Aluno, meus Parabéns você passou com nota Máxima");
			}else {
				System.out.println("Aluno está em recuperação");
			}
		}
		else {
			System.out.println("Aluno, você está reprovado");
		}
		
	}

}
