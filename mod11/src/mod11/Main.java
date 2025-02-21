package mod11;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//Recebendo notas:
		System.out.println("Digite a primeira nota:");
		Integer nota1 = sc.nextInt();
		System.out.println("Digite a segunda nota:");
		Integer nota2 = sc.nextInt();
		System.out.println("Digite a terceira nota:");
		Integer nota3 = sc.nextInt();
		System.out.println("Digite a primeira nota:");
		Integer nota4 = sc.nextInt();
		
		//Soma e divisão da media:
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//Controle de fluxo:
		if(media >= 7) {
			System.out.println("Parabens você passou com a media: " + media);
		}else if(media <= 5) {
			System.out.println("Você está em recuperação: " + media);
		}else {
			System.out.println("Reprovado: " + media);
		}
		
		sc.close();
	}
}
