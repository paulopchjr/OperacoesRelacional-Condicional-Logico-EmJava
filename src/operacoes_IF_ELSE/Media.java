package operacoes_IF_ELSE;

public class Media {
	
	public static void main(String[] args) {
		
		int  mediaAluno = 7;
		String nome="Paulo";
		if(mediaAluno >= 7 && nome.equalsIgnoreCase("Paulo")) {
			
			System.out.println( nome + ", Parabéns! você está Aprovado");
		}else {
			System.out.println("Aluno não existe");
		}
	}

}
