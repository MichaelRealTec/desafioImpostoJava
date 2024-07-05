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
		Double gastosEducacionais;
		Double imposto;
		Double impostoRendaServico;
		Double impostoCapital;
		Double impostoSalario;
		Double impostoBruto;
		Double maxDedutivel;
		Double gastosDedutiveis;
		Double rendaPrestacaoServico;
		Double abatimento;
		Double impostoDevido;

		
		
		System.out.print("Renda anual com salário: "); // Escrevendo uma mensagem na tela
		salarioAnual = leia.nextDouble(); // Capturando via teclado o próximo número double digitado
		salario = salarioAnual / 12;
		System.out.print("Renda anual com prestação de serviço: ");
		rendaPrestacaoServico = leia.nextDouble();
		if (rendaPrestacaoServico > 0) {
			impostoRendaServico = (rendaPrestacaoServico * 0.15);
		} else {
			impostoRendaServico = 0.00;
		}
		
		System.out.print("Renda anual com ganho de capital: ");
		ganhoCapital = leia.nextDouble();
		
		if(ganhoCapital > 0) {
			impostoCapital = (ganhoCapital * 0.20);
		} else {
			impostoCapital = 0.00;
		}
		
		System.out.print("Gastos médicos: ");
		gastosMedicos = leia.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = leia.nextDouble();
		System.out.println();
		// Relátório
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		
		System.out.println();
		System.out.print("CONSOLIDADO DE RENDA: \n");
		if(salario < 3000) {
			imposto = 0.00;
		} else if(salario < 5000) {
			imposto = 0.10;
		} else {
			imposto = 0.20;
		}
		impostoSalario = (salario * 12) * imposto;
		// Condicional para verificar o cálculo do imposto sobre a Pessoa física
		System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f\n",impostoRendaServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f\n",impostoCapital);
		
		System.out.println();
		// Deduções
		System.out.println("DEDUÇÕES:");
		
		maxDedutivel = (impostoSalario + impostoCapital + impostoRendaServico) * 0.30;
		impostoBruto = (impostoSalario + impostoCapital + impostoRendaServico);
		
		System.out.printf("Máximo dedutível: %.2f%n",maxDedutivel);
		gastosDedutiveis = gastosMedicos + gastosEducacionais;
		if(gastosDedutiveis < maxDedutivel) {
			abatimento = gastosDedutiveis;
		} else {
			abatimento = maxDedutivel;
		}
		System.out.printf("Gastos dedutíveis: %.2f%n",gastosDedutiveis);
		
		// Resumo
		System.out.println();
		//impostoBruto = (impostoBruto);
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n",impostoBruto);
		System.out.printf("Abatimento: %.2f%n", abatimento);
		impostoDevido = (impostoBruto - abatimento);
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);
		
		
		
		
		
		
		
		
		leia.close(); // fechando o Scanner para economizar recursos e finalizar a captura pelo teclado
	}

}
