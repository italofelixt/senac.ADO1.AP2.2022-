import java.util.Scanner;

/*Implementar um programa em Java que retorne uma mensagem formatada com o valor das
parcelas de uma compra, a partir do valor total da compra e da quantidade do parcelamento.
Exemplo da mensagem de resposta:
"Sua compra de R$ 1200 em 10x de R$ 120 foi concluída"*/


public class Exerc06 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Valor da Compra: ");
		double valorCompra= input.nextDouble();
		
		System.out.print("Parcelas: ");
		int parcelas = input.nextInt();
	
		double valorParcela = valorCompra / parcelas;
		
		
		
		System.out.printf("Sua compra de R$ %.2f em %dx de R$ %.2f foi concluída.", valorCompra, parcelas, valorParcela );
	
	}	
}
