package Estrutura_Repeticao_FOR;

public class Estrutura_Repeticao_For {

	
	public static void main(String[] args) {
		
		
		
		int res= 0;
		for(int i =1; i <=10; i++) {
			
			for(int p =1; p<=10; p++) {
				
				res = i * p;
				
				System.out.println(i + " * "+ p + " = " + res);
			}
			System.out.println("---------------------------------------------\n");
		}
	}
}
