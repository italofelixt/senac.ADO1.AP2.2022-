/*2. Implementar uma função que informe a situação de um orçamento familiar baseado no total de ganhos e gastos. 
 *Se o total de ganhos for maior ou igual o total de gastos, deve ser exibido a mensagem: 
 *"Você está dentro do orçamento!", senão "Você está fora do orçamento! Não gaste mais!"*/

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Diga seus GANHOS e seus GASTOS para saber se está dentro do orçamento: ");

		if (saberOrcamento(input.nextDouble(), input.nextDouble())) {
			System.out.println("Você está dentro do orçamento!");
		} else {
			System.out.println("Você está fora do orçamento! Não gaste mais!");
		}
		input.close();
	}

	static public boolean saberOrcamento(double ganhos, double gastos) {
		boolean x = ganhos >= gastos;

		return x;
	}

}
