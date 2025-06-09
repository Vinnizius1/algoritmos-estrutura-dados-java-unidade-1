/* 
Exercício 5: Avaliação de Notas dos Alunos

Você é responsável por calcular o desempenho dos alunos em uma avaliação. 
Crie uma matriz (array) com as notas dos alunos em uma prova e encontre a maior nota da turma, exibindo-a ao final.
*/

public class Exercicio5 {
    public static void main(String[] args) {
        // Em Java, arrays são declarados com [] após o tipo
        double[] notas = {7.5, 8.0, 9.2, 6}; 

        // Inicialização: assumimos que o primeiro elemento é o maior
        // Isso garante que sempre temos um valor válido para comparar
        double maiorNota = notas[0];

        // Loop começando do índice 1 (segundo elemento)
        // i = 1: porque já pegamos notas[0] na inicialização
        // i < notas.length: evita ArrayIndexOutOfBoundsException
        for (int i = 1; i < notas.length; i++) {
            
            // Comparação: se o elemento atual for maior que o maior encontrado
            if (notas[i] > maiorNota) {
                // Atualiza a variável com o novo maior valor
                maiorNota = notas[i];
            }
            // Se não for maior, continua com o valor atual de maiorNota
        }

        System.out.println("A maior nota da turma é: " + maiorNota);
    }
}
