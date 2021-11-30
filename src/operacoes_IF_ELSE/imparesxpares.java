package operacoes_IF_ELSE;

public class imparesxpares {

	public static void main(String[] args) {
		
		
		for(int pos =1; pos <= 10; pos++) {
			
			if(pos%2 == 0) {
				System.out.println(pos + ", é Par");
			}else {
				
				System.out.println(pos + ", é Ímpar!");
			}
		}
	}
}
