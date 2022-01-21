package condicionais;

import java.util.Scanner;

public class LogicaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis 
		int idade = 0;
		
		//Scaner leitor de teclado 
		Scanner leitor =  new Scanner(System.in);
		
		System.out.print("Qual a sua idade");
		
		idade = leitor.nextInt();
		
		//Verifica se eh maior de idade
		if(idade >= 18) {
			System.out.println("vc eh maior de idade ");
		} else {
			System.out.println("Vc eh menor de idade");
		}

	}

}
