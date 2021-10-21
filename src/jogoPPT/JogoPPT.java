package jogoPPT;
import java.util.Scanner;
import java.util.Random;

public class JogoPPT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random ();
		Scanner sc = new Scanner (System.in);
		
		
		int player1, ComPlayer;
		System.out.println("------------------");
		System.out.println("[ 1 ] - Pedra");
		System.out.println("[ 2 ] - Papel");
		System.out.println("[ 3 ] - Tesoura");
		System.out.println("==================");
		System.out.println("");
		System.out.println("Faça sua jogada!");
		player1 = sc.nextInt();
		
		switch (player1) {
			case 1:
				System.out.println("Você escolheu Pedra");
				break;
			case 2: 
				System.out.println("Você escolheu Papel");
				break;
			case 3:
				System.out.println("Você escolheu Tesoura");
				break;
			default:
				System.out.println("Escolha um número entre 1 e 3 para jogar!");
		}
		sc.close();
		System.out.println("");
		for (int i = 0; i < 1; i++) {
			ComPlayer = (rd.nextInt(3)+1);
		System.out.println(ComPlayer);
		
		switch (ComPlayer) {
		case 1:
			System.out.println("O computador jogou Pedra");
			break;
		case 2: 
			System.out.println("O computador jogou Papel");
			break;
		case 3:
			System.out.println("O computador jogou Tesoura");
			break;		
	}
		if (ComPlayer == 1 && player1 == 3){
			System.out.println("Computador ganhou: Pedra quebra Tesoura");
		}
		else if (ComPlayer == 2 && player1 == 1) {
			System.out.println("Computador ganhou: Papel embrulha Pedra");
		}
		else if (ComPlayer == 3 && player1 == 2) {
			System.out.println("Computador ganhou: Tesoura corta Papel");			
		}
		else if (ComPlayer == 1 && player1 == 1){
			System.out.println("Empate! Jogue novamente..");
		}
		else if (ComPlayer == 2 && player1 == 2) {
			System.out.println("Empate! Jogue novamente..");
		}
		else if (ComPlayer == 3 && player1 == 3) {
			System.out.println("Empate! Jogue novamente..");
		}		
		else {
			System.out.println("Você ganhou!");
		}
	}			
		}
	}

