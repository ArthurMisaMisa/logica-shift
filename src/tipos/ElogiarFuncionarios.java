package tipos;

import java.util.Scanner;

public class ElogiarFuncionarios {

	public static void main(String[] args) {

		System.out.println("Insira o seu nome: ");
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine();
		short opcao;
		
		System.out.println("Selecione uma das opções abaixo: ");
		System.out.println("1-Elogio Físico");
		System.out.println("2-Elogio Profissional");
		System.out.println("3-Elogio Pessoal");
		
		opcao = leitor.nextShort();
		
		switch(opcao) {
		case 1 -> System.out.println("A senhoria esta muito bela hoje");
		
		case 2 -> System.out.println("A senhorita foi muito eficiente no trabalho de hoje");
		
		case 3 -> System.out.println("Você é demais");
		
		
		}

	}

}
