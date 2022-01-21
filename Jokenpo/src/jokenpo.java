import java.util.Arrays;
import java.util.Scanner;

public class jokenpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis
		String playerHumano;
		String[] arrOpcoesDeJogada = {"pe", "pa", "te"};
		String playerComputador = arrOpcoesDeJogada[1];
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Jokenpo :");
		System.out.println("Ëscolha sua jogada:");
		System.out.println("pe = Pedra, pa = Papel, te = Tesoura");
		
		playerHumano = leitor.nextLine();
		
		while (!playerHumano.equals("pe") && !playerHumano.equals("pa") && !playerHumano.equals("te") ) {
			System.out.println("digite um valor recomendado: ");
			playerHumano = leitor.next();
		}
		
		if(playerHumano.equals("pe") && playerComputador.equals("pe")) {
			System.out.println("O jogo empatou");
			
		}else if (playerHumano.equals("pe") && playerComputador.equals("pa")) {
			System.out.println("Computador ganhou");
	
		}else if (playerHumano.equals("pe") && playerComputador.equals("te")) {
			System.out.println("vc ganhou");
			
		}else if (playerHumano.equals("pa") && playerComputador.equals("pe")) {
			System.out.println("vc ganhou");
			
		}else if (playerHumano.equals("pa") && playerComputador.equals("pa")) {
			System.out.println("ö jogo empatou");
			
		}else if (playerHumano.equals("pa") && playerComputador.equals("te")) {
			System.out.println("Computador ganhou");
			
		}else if (playerHumano.equals("te") && playerComputador.equals("pe")) {
			System.out.println("Computador ganhou");
			
		}else if (playerHumano.equals("te") && playerComputador.equals("pa")) {
			System.out.println("vc ganhou");
			
		}else if (playerHumano.equals("te") && playerComputador.equals("te")) {
			System.out.println("O jogo empatou ");
		}
		
	}

}
