package Operacoes_Repeticao_Continue;

public class Encontre_Numero_Continue {

	public static void main(String[] args) {
		
		
		
		for(int pos =1; pos <=100; pos++) {
			
			if(pos == 25 || pos ==50 || pos ==75) {
				System.out.println("Numéro "+ pos + " encontrado!");
				continue;
			}
			System.out.println(pos);
		}
	}
	
	
}
