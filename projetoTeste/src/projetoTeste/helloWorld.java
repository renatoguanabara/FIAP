package projetoTeste;

import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ler entrada do teclado 
		Scanner leitor = new Scanner(System.in);
		
		
		//declaracao de variaveis 
		int pesoDoUsuario = 0;
		double alturaDoUsuario = 0,imc;
		String nomeDoUsuario;
		
		System.out.println("qual eh o seu nome");
		nomeDoUsuario = leitor.nextLine();
		
		// Criando Variaveis para calculo
		System.out.println( nomeDoUsuario +"Digite seu peso" );
		pesoDoUsuario = leitor.nextInt();
		
		//Craindo altura
		System.out.println("Digite sua altura");
		alturaDoUsuario = leitor.nextDouble();
		
		//calculo do imc
		imc = pesoDoUsuario / (alturaDoUsuario * alturaDoUsuario);
		
		leitor.close();
		
		//Print nome e peso do usuario 
		System.out.println(nomeDoUsuario + "seu IMC eh " + imc);
		

		
		System.out.println("O peso do usuario eh  " + pesoDoUsuario);
		
		
		//Determinar classificacao IMC
		if (imc < 18.5) {
			System.out.println("vc esta abaixo do peso");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Seu peso eh normal");
		} else if(imc >= 25 && imc <= 29.9) {
			System.out.println('Ësta com sobre peso');
		} else if() {
			
		}
		

	}

}
