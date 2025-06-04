/* 
Exercício 3: Contagem de Clientes em um Estabelecimento

Imagine que você é responsável por registrar quantos clientes entram na loja a cada hora. 
Crie um programa que imprima os números de 1 a 10, simulando a contagem de clientes ao longo de uma hora.
*/

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("--- Contagem de Clientes (1 a 10) ---");

        for (int i = 1; i <= 10; i++) {
            // Usando %d para o número inteiro 'i'
            // Usando %n para a quebra de linha
            System.out.format("%nCliente %d entrou na loja.%n", i);
        }

        System.out.format("%nFim da contagem da hora.");
    }
}
