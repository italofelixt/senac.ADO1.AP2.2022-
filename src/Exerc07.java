
/*Implementar um programa em Java para converter dólares em reais.*/
import java.util.Scanner;

public class Exerc07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor do Dólar em seguida quantos dólares para fazer a conversão para o Real: ");

		double valorEmReal = converterDolarEmReal(input.nextDouble(), input.nextDouble());

		System.out.print("O valor em real é: R$" + valorEmReal);

	}

	public static double converterDolarEmReal(double valorDoDolar, double dolares) {

		double real = dolares * valorDoDolar;

		return real;
	}
	
}
