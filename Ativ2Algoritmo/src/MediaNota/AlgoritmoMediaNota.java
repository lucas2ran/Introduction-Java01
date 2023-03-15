package MediaNota;

import java.util.Scanner;

public class AlgoritmoMediaNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a nota1: ");
		float nota1 =  leia.nextFloat();

		System.out.println("Digite a nota2: ");
		float nota2 = leia.nextFloat();

		System.out.println("Digite a nota3: ");
		float nota3 = leia.nextFloat();

		System.out.println("Digite a nota4: ");
		float nota4 = leia.nextFloat();

		float media = (nota1 + nota2+ nota3 + nota4) /4;

		System.out.println("Média final: " + media);
	}

}
