package operacoes_IF_ELSE;

public class Media {
	
	public static void main(String[] args) {
		
		int  mediaAluno = 7;
		String nome="Paulo";
		if(mediaAluno >= 7 && nome.equalsIgnoreCase("Paulo")) {
			
			System.out.println( nome + ", Parab�ns! voc� est� Aprovado");
		}else {
			System.out.println("Aluno n�o existe");
		}
	}

}
