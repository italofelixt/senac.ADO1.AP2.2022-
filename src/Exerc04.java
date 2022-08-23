/*Implemente um programa em Java que calcule o total a se pagar em uma compra na sorveteria,
a partir do total de gramas comprado. O preço de 100g é R$ 3,50 mas se o total de gramas for
maior que 1kg, o preço das 100g diminui 50 centavos. Se o total de gramas for menor ou igual a
zero, enviar a mensagem “Inválido”*/
import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Qual o peso do sorvete em gramas (g)?");
		double precoTotal = calcularPreco(input.nextDouble());
		
		if (precoTotal > 0) {
			System.out.println(precoTotal);
		}else {
			System.out.println("Inválido");
		}
		
	}
	static double calcularPreco(double peso) {
		double precoPor100g = 3.5;

		if (peso >= 1000) {
			precoPor100g = 3.0;
		}
		
		double x = peso * precoPor100g / 100;
		return x;
	}
}
