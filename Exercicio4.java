/* 
Exercício 4: Organizando uma Lista de Espera Dinâmica

Em um restaurante, há uma lista de espera para os clientes. 
Implemente um programa que permita adicionar e remover clientes dessa lista dinâmica. 
A cada alteração, exiba a lista atualizada para que os funcionários saibam quantos clientes estão aguardando.
*/

// ArrayList em Java: Para listas que precisam crescer e encolher dinamicamente (como a lista de espera), 
// Java nos oferece a classe ArrayList do pacote java.util. 
// Ela é muito mais parecida com os arrays do JavaScript em termos de flexibilidade.

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    // Constantes ANSI para cores e reset (se o terminal suportar)
    public static final String RESET = "\u001B[0m"; // O RESET é sempre usado para garantir que a cor não seja aplicada para o texto seguinte.
    public static final String VERMELHO = "\u001B[31m";
    public static final String AZUL = "\u001B[34m";
    public static final String VERDE = "\u001B[32m";

    public static void main(String[] args) {

        // Lista Dinâmica (ArrayList)
        ArrayList<String> listaEspera = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Mensagem de boas-vindas e início do programa
        System.out.println(VERDE + "--- Gerenciador de Lista de Espera ---" + RESET);
        System.out.println(); // Quebra de linha para espaçamento

        while (true) {
            System.out.println("Opções:"); // println para menu simples (ao invés de format, que é apropriado para mensagens formatadas)
            System.out.println("  1 - Adicionar cliente");
            System.out.println("  2 - Remover cliente");
            System.out.println("  3 - Sair do programa");
            System.out.print("Escolha uma opção: "); // print mantém o cursor na mesma linha

            int opcao;
            try {
                opcao = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println(VERMELHO + "Entrada inválida! Por favor, digite um número." + RESET);
                scanner.nextLine(); // Limpa a linha de entrada inválida
                System.out.println(); // Quebra de linha para espaçamento
                continue; // O continue, no catch faz o loop reiniciar, pedindo a opção novamente.
            }
            scanner.nextLine(); // Limpa o buffer do scanner (o Enter após o nextInt())
            System.out.println(); // Quebra de linha para espaçamento

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente a ser adicionado: ");
                    String nomeClienteAdicionar = scanner.nextLine();
                    listaEspera.add(nomeClienteAdicionar);
                    // Usando format para inserir a variável nomeClienteAdicionar
                    System.out.format(VERDE + "Cliente \"%s\" adicionado à lista de espera.%n" + RESET, nomeClienteAdicionar);
                    break;

                case 2:
                    if (listaEspera.isEmpty()) {
                        System.out.println(VERMELHO + "A lista de espera está vazia. Nenhum cliente para remover." + RESET);
                    } else {
                        System.out.print("Digite o nome do cliente a ser removido: ");
                        String nomeClienteRemover = scanner.nextLine();

                        if (listaEspera.remove(nomeClienteRemover)) {                          
                            System.out.format(VERDE + "Cliente \"%s\" removido da lista de espera.%n" + RESET, nomeClienteRemover);
                        } else {                          
                            System.out.format(VERMELHO + "Cliente \"%s\" não encontrado na lista de espera.%n" + RESET, nomeClienteRemover);
                        }
                    }
                    break;

                case 3:
                    System.out.println(AZUL + "Saindo do programa. Até mais!" + RESET);
                    break;
                    
                default:
                    System.out.println(VERMELHO + "Opção inválida. Tente novamente." + RESET);
                    break;
            }

            // Apenas exibe a lista se a opção não foi sair
            if (opcao != 3) {
                System.out.println(); // Quebra de linha antes de exibir a lista
                System.out.println(AZUL + "--- Lista de Espera Atualizada ---" + RESET);

                if (listaEspera.isEmpty()) {
                    System.out.println(VERDE + "(Vazia)" + RESET);
                } else {
                    for (String cliente : listaEspera) {
                        
                        System.out.format(AZUL + "- %s%n" + RESET, cliente);
                    }
                }
                System.out.println(); 

            } else { // Se a opção for 3 (SAIR), não exibe a lista e encerra o programa              
                break; 
            }

            // >>>>>> Fim do switch case e do if com a "opção" numérica selecionada pelo usuário  <<<<<<

        } // Fim do loop principal "while (true)"

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
