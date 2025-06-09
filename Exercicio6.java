/* 
Exercício 6: Seleção de Números Primos para Criptografia

Em um sistema de segurança, números primos são utilizados como base para a criptografia. 
Escreva um programa que encontre e exiba todos os números primos entre 1 e 100, 
ajudando a equipe de segurança a selecionar números para esse propósito.
*/

public class Exercicio6 {
    public static void main(String[] args) {
        // Mensagem de boas-vindas
        System.out.println("Números primos entre 1 e 100:");

        // 1 não é primo por definição matemática, então começamos do 2
        for (int i = 2; i <= 100; i++) {

            // Chama a função ehPrimo para verificar se o número é primo
            if (ehPrimo(i)) {
                // print() não quebra linha, println() quebra
                System.out.print(i + " ");
            }
        }
    }
    
    // Função separada para melhor organização e legibilidade do código
    public static boolean ehPrimo(int numero) {
        // Números menores que 2 não são primos (0, 1, negativos)
        if (numero < 2) return false;

        // Otimização: Só precisamos verificar divisores até a raiz quadrada do número.
        // Se um número tem um divisor maior que sua raiz quadrada, ele necessariamente
        // terá um divisor menor que sua raiz quadrada, que já teria sido encontrado.
        // Exemplo: Para 100, testa só até 10 (não até 99)
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false; // Se encontrar um divisor, não é primo
        }

        // Se não encontrou nenhum divisor, é primo
        return true;
    }
}
