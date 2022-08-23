import java.util.Scanner;

/*Implementar um programa em Java que a partir de duas cores primárias informe a cor
resultante. Se as cores informadas não forem primárias, a função deve informar uma
mensagem dizendo que apenas cores primárias são aceitas.*/
public class Exerc08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Diga duas cores primárias, o retorno será a cor secundária resultante: ");
		
		String corSecundaria = informarCorSecundaria(input.next(), input.next());

		System.out.println(corSecundaria);

		input.close();
	} 

	public static String informarCorSecundaria(String primeiraCor, String segundaCor) {

		String resultante = "";

		if (primeiraCor.equalsIgnoreCase("amarelo") && segundaCor.equalsIgnoreCase("azul")) {
			resultante = "Verde";
		} else if (primeiraCor.equalsIgnoreCase("vermelho") && segundaCor.equalsIgnoreCase("azul")) {
			resultante = "Roxo";
		} else if (primeiraCor.equalsIgnoreCase("amarelo") && segundaCor.equalsIgnoreCase("vermelho")) {
			resultante = "Laranja";
		} else if (primeiraCor.equalsIgnoreCase(segundaCor)) {
			resultante = "A primeira e a segunda cor são iguais";
		} else {
			System.out.println("Apenas cores primárias são aceitas.");
		}

		return resultante;
	}
	
}
