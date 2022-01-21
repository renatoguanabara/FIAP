import java.util.Scanner;

public class VerificarSeEhParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis
		int numero = 0;
		
		//Declarando o leitor.
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		
		
		//Le numero digitado
		numero = leitor.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Seu numero eh par");
		} else {
			System.out.println("Seu numero eh impar");
		}

	}

}
