/* 
Exercício 2: Verificador de Características de Um Produto

Em uma loja, os produtos têm códigos específicos. 
Escreva um programa que, ao ler o código de um produto, indique se o número é par ou ímpar. 
Imprima o resultado na tela para ajudar o setor de inventário a identificar características básicas dos produtos.
*/

import java.util.Scanner;

public class Exercicio2 {
    // Códigos ANSI para formatação de texto
    public static final String RESET = "\u001B[0m"; // Reseta a formatação
    public static final String VERMELHO = "\u001B[31m"; // Cor vermelha
    public static final String AZUL = "\u001B[34m"; // Cor azul

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        System.out.print("Digite o código do produto: "); 
        int codigoProduto = scanner.nextInt(); // Lê o código do produto como um número inteiro

        System.out.println(); // Quebra de linha antes

        // Verifica se o código do produto é par ou ímpar
        if (codigoProduto % 2 == 0) {
            // Para números pares, usaremos a cor azul
            System.out.format("O código do produto " + AZUL + "%d" + RESET + " é um número PAR.%n", codigoProduto); 
        } else {
            // Para números ímpares, usaremos a cor vermelha
            System.out.format("O código do produto " + VERMELHO + "%d" + RESET + " é um número ÍMPAR.%n", codigoProduto); 
        }

        System.out.println(); // Adiciona uma quebra de linha depois

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
    
}
