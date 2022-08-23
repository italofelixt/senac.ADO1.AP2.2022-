/*Implemente um programa em Java que informe o dia da semana por extenso a partir do número
 *do dia, sabendo que a semana começa no Domingo como dia zero. Se o número do dia não
 *estiver entre 0 e 6, deve ser enviada a mensagem: "Dia da semana inválido".*/

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int hojeEh = 0;

		String[] diaSemana = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };

		System.out.print("Digite o dia da semana (sendo domingo o dia zero): ");

		hojeEh = input.nextInt();
		if (hojeEh > 6 || hojeEh < 0) {
			System.out.println("Dia da semana inválido!");
			return;
		}

		System.out.println("O dia da semana é: " + diaSemana[hojeEh]);

	}
}
