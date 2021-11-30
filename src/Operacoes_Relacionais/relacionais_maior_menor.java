package Operacoes_Relacionais;

public class relacionais_maior_menor {

	
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for( int i = 1; i<= 10; i++) {
			
			if(i > n) {
				System.out.println(i +" é maior que " + n);
			
			}else if(i < n) {
				System.out.println( i +" É MENOR QUE "+ n);
			}
			else{
				System.out.println( i + " É IGUAL A " + n);
			}
		}
	}
}
