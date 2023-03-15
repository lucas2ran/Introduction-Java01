package AlgoritmoSal;

import java.util.Scanner;

public class SalarioBruto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);


		System.out.println("Digite o salário bruto: ");
		float SalarioBruto = leia.nextFloat();

		System.out.println("Digite o adicional noturno:"); 
		float Adicional = leia.nextFloat();

		System.out.println("Digite as horas extras: ");
		float HorasExtras = leia.nextFloat();

		System.out.println("Digite os descontos: ");
		float Descontos = leia.nextFloat();

		float SalarioLiquido = SalarioBruto + Adicional + HorasExtras *5 - Descontos;

		System.out.println("Salário Líquido :" + SalarioLiquido);

	}

}
