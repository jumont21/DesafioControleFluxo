package DesafioControleFluxo;

import java.util.Scanner;

/*
 * ETAPAS:
 * 
 * 1. Definir a classe "ParâmetrosInvalidosException"
 * 2. Configurar a entrada de dados
 * 3. Tratando exceções (try - catch)
 * 4. Implementar a lógica de contagem (método contar)
 * 
 */

public class Contador {

public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			// leitura do primeiro parâmetro
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			// leitura do segundo parâmetro
			int parametroDois = terminal.nextInt();
			
			try {
				//chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
			
			}catch (ParametrosInvalidosException excecao) {
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro");
			}
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		// verifica se o 1° parâmetro é maior ou igual ao 2°
		if (parametroUm >= parametroDois) {
			
			// Se for, envia uma exceção personalizada com uma mensagem de erro
			throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro");
		}
		
		// calcula a contagem de números subtraindo o 2° parâmetro do 1°
		int contagem = parametroDois - parametroUm;
		
		// realiza o for para imprimir os números com base na variável contagem
		// loop para imprimir os números incrementados - iterar de 1 até a contagem total de números
		for (int x = 1; x <= contagem; x++) {
			
			/* - imprime cada número com uma mensagem
			   - a variavel "x" representa o n° atual no loop
			 * - este loop é usado para imprimir sequencialmente os números de 1 até a contagem 
			 */
			System.out.println("\nImprimindo o número: " + x);
			
		}
		
	}
}


