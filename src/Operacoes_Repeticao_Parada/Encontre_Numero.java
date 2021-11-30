package Operacoes_Repeticao_Parada;

public class Encontre_Numero {
	
	public static void main(String[] args) {
		
		
		for(int n=1; n<=100; n++) {
			
			System.out.println(n);
			if(n == 50) {
			System.out.println("Número encontrado, valor dele é " + n);
			break;
			}
		}
	}

}
