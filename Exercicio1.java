/* 
Exercício 1: Explorando Variáveis no Sistema de Reservas de um Hotel

Imagine que você está desenvolvendo um sistema de reservas para um hotel. 
Comece declarando variáveis que armazenem o número do quarto (número inteiro), o valor da diária (número com ponto flutuante) e 
o nome do hóspede (string). 
Atribua valores de exemplo a essas variáveis e exiba-os na tela. 
*/

public class Exercicio1 {
    public static void main(String[] args) { // Método principal, onde o programa começa
        // Declaração das variáveis
        int numeroQuarto = 5; // Número do quarto
        double valorDiaria = 199.9999; // Valor da diária
        String nomeHospede = "João Silva Matos"; // Nome do hóspede

        // Exibição dos valores na tela
        // O println adiciona uma nova linha no final (se não quiser a nova linha, use System.out.print())
        System.out.println("Número do Quarto: " + numeroQuarto);
        System.out.println("Valor da Diária: R$ " + valorDiaria);
        System.out.println("Nome do Hóspede: " + nomeHospede); 

        // FORMATAÇÃO MELHORADA
        System.out.println("\n--- Resumo da Reserva ---");
        System.out.format("Quarto: %d%n", numeroQuarto);
        System.out.format("Diária: R$ %.2f%n", valorDiaria); // %.2f formata para 2 casas decimais
        System.out.format("Hóspede: %s%n", nomeHospede);
    }
}