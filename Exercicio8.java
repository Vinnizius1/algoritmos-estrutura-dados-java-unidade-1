/* 
Exercício 8: Análise de Frequência de Pedidos no Delivery - Versão com Map

RESUMO DA ABORDAGEM (para quem vem do JavaScript):
=================================================
- PROBLEMA: Encontrar o item mais pedido em uma lista
- SOLUÇÃO: Usar Map para contar frequências automaticamente
- VANTAGEM: Apenas 1 loop principal (O(n)) vs 3 loops aninhados (O(n²))

COMPARAÇÃO JS vs JAVA:
- JS: let map = new Map()              → Java: Map<Integer, Integer> map = new HashMap<>()
- JS: map.set(key, value)              → Java: map.put(key, value)  
- JS: map.get(key) || 0                → Java: map.getOrDefault(key, 0)
- JS: for(let [k,v] of map.entries())  → Java: for(Map.Entry<K,V> entry : map.entrySet())
- JS: k (chave), v (valor)             → Java: entry.getKey(), entry.getValue()

COMO FUNCIONA:
1. Map conta automaticamente quantas vezes cada número aparece
2. Um loop percorre o Map para encontrar a maior frequência
3. Resultado: item mais frequente sem repetições!

MUDANÇA IMPORTANTE:
- Trocamos HashMap<> por Map<> na declaração da variável
- Segue boas práticas de programação (interface vs implementação)
- Código fica mais flexível e profissional
*/

import java.util.HashMap; // Ainda precisamos importar HashMap para o new HashMap<>()
import java.util.Map;     // Importa interface Map

public class Exercicio8 {
    public static void main(String[] args) {
        // Array com códigos dos pedidos (simulando dados de entrada)
        int[] pedidos = {101, 102, 101, 103, 102, 101, 104};
        
        // Map para contar frequências - equivale ao Map do JS
        // Em JS seria: let frequencias = new Map()
        // <Integer, Integer> = <TipoChave, TipoValor>
        // Chave: código do pedido, Valor: frequência do pedido
        // MUDANÇA: Map<> em vez de HashMap<> (boa prática!)
        Map<Integer, Integer> frequencias = new HashMap<>();
        
        // Mostra os pedidos que serão analisados
        System.out.println("Analisando os pedidos: ");
        for (int pedido : pedidos) { // for-each: para cada pedido no array pedidos
            System.out.print(pedido + " ");
        }
        System.out.println("\n");
        
        // ===== ETAPA 1: CONTAR FREQUÊNCIAS (APENAS 1 LOOP!) =====
        for (int pedido : pedidos) {
            // getOrDefault(chave, valorPadrao):
            // - Se a chave JÁ existe no Map: retorna o valor atual
            // - Se a chave NÃO existe: retorna 0 (valor padrão)
            // Depois soma +1 e guarda no Map
            // Em JS seria: frequencias.set(pedido, (frequencias.get(pedido) || 0) + 1)
            frequencias.put(pedido, frequencias.getOrDefault(pedido, 0) + 1);
        }
        
        // ===== ETAPA 2: MOSTRAR TODAS AS FREQUÊNCIAS =====
        System.out.println("--- FREQUÊNCIAS ---");
        // entrySet() retorna todas as entradas (pares chave-valor) do Map
        // Map.Entry<Integer, Integer> = cada entrada tem uma chave Integer e valor Integer
        // Em JS seria: for (let [pedido, freq] of frequencias.entries())
        for (Map.Entry<Integer, Integer> entrada : frequencias.entrySet()) {
            // entrada.getKey() = a chave (código do pedido)
            // entrada.getValue() = o valor (quantas vezes aparece)
            System.out.println("Pedido " + entrada.getKey() + " aparece " + entrada.getValue() + " vez(es)");
        }
        
        // ===== ETAPA 3: ENCONTRAR O ITEM MAIS FREQUENTE =====
        int itemMaisFrequente = 0;   // Guarda qual item aparece mais
        int maiorFrequencia = 0;     // Guarda quantas vezes aparece
        
        // Percorre o Map novamente para encontrar a maior frequência
        for (Map.Entry<Integer, Integer> entrada : frequencias.entrySet()) {
            // Se a frequência atual for maior que a maior encontrada até agora
            if (entrada.getValue() > maiorFrequencia) {
                maiorFrequencia = entrada.getValue();    // Atualiza maior frequência
                itemMaisFrequente = entrada.getKey();    // Atualiza qual item é o mais frequente
            }
        }
        
        // ===== RESULTADO FINAL =====
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Item mais pedido: " + itemMaisFrequente);
        System.out.println("Frequência: " + maiorFrequencia + " vezes");
    }
}

/*
EXEMPLO DE EXECUÇÃO:
===================
Array: {101, 102, 101, 103, 102, 101, 104}

Depois do primeiro loop, o Map fica:
{101=3, 102=2, 103=1, 104=1}

Resultado: Item 101 aparece 3 vezes (é o mais frequente)

VANTAGENS desta abordagem com Map<>:
- Código mais limpo e legível
- Performance melhor (O(n) vs O(n²))
- Não há repetições na saída
- Segue boas práticas profissionais
- Mais flexível (pode trocar implementação facilmente)
- Interface vs implementação (princípio SOLID)
*/