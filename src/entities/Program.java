package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	

	public static void main(String[] args) {
		// Desafio Imposto Java
		Locale.setDefault(Locale.US);  // Definindo teclado configuração Estados Unidos
		Scanner leia = new Scanner(System.in); // Chamando a Classe Scanner para capturar informação pelo teclado
		
		Double salarioAnual;
		Double salario;
		Double ganhoCapital;
		Double gastosMedicos;
		Double imposto;
		Double rendaPrestacaoServico;
		
		
		System.out.print("Renda anual com salário: "); // Escrevendo uma mensagem na tela
		salarioAnual = leia.nextDouble(); // Capturando via teclado o número double digitado
		salario = salarioAnual / 12;
		System.out.print("Renda anual com prestação de serviço: ");
		rendaPrestacaoServico = leia.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		ganhoCapital = leia.nextDouble();
		System.out.print("Gastos médicos: ");
		gastosMedicos = leia.nextDouble();
		System.out.print("Gastos educacionais: ");
		
		
		
		if(salario < 3000) {
			imposto = 0.00;
			System.out.print("isento");
		} else if(salario < 5000) {
			imposto = 10.00;
			System.out.print(imposto+"%");
		} else {
			imposto = 20.00;
			System.out.print(imposto+"%");
		}// Condicional para verificar o cálculo do imposto sobre a Pessoa física
		
		
		
		
		
		leia.close(); // fechando o Scanner para economizar recursos e finalizar a captura pelo teclado
	}

}
