# 📌 Implementação da Busca Binária em Java

Este repositório contém a implementação do algoritmo de **Busca Binária** em Java, um dos algoritmos mais eficientes para encontrar um elemento dentro de um **array ordenado**.

## 🚀 O que é a Busca Binária?
A **Busca Binária** é um algoritmo de busca baseado no conceito de **Divisão e Conquista**. Em vez de percorrer todos os elementos (como a busca linear), ele divide o array ao meio repetidamente até encontrar o elemento ou determinar que ele não está presente.

## 🛠️ Como funciona?
1. O algoritmo encontra o elemento **do meio** do array.
2. Compara esse elemento com o número procurado:
   - Se for igual, retorna o índice do número.
   - Se for **maior**, repete a busca na metade **esquerda** do array.
   - Se for **menor**, repete a busca na metade **direita** do array.
3. Esse processo continua até encontrar o número ou até que a faixa de busca se torne inválida.

## 🔢 Exemplo Prático
### **Array de entrada (ordenado):**
```plaintext
[6, 7, 8, 9, 10, 11, 14, 15, 16, 17, 19, 22, 23, 25, 28, 30]
```
Se procurarmos **19**, os passos serão:

1. **Elemento do meio:** `16` (posição 8) → `16 < 19`, busca na metade direita.
2. **Novo meio:** `22` (posição 11) → `22 > 19`, busca na metade esquerda.
3. **Novo meio:** `19` (posição 10) → Encontrado! ✅

## ⏳ Complexidade de Tempo (Big-O)
| Caso        | Complexidade |
|------------|-------------|
| Melhor caso | O(1) |
| Caso médio | O(log n) |
| Pior caso  | O(log n) |

A complexidade é **O(log n)** porque a cada passo o espaço de busca é reduzido pela metade.

## 🖥️ Implementação em Java

```java
public class Main {
    public static void main(String[] args) {
        int[] array = {6, 7, 8, 9, 10, 11, 14, 15, 16, 17, 19, 22, 23, 25, 28, 30};

        int numeroProcurado = 19;
        int resultado = binarySearch(array, numeroProcurado, 0, array.length - 1);

        if (resultado != -1) {
            System.out.println("Número encontrado no índice: " + resultado);
        } else {
            System.out.println("Número não encontrado.");
        }
    }

    private static int binarySearch(int[] array, int numeroProcurado, int start, int end) {
        if (start > end) {
            return -1;
        }

        int indiceMeio = (start + end) / 2;

        if (array[indiceMeio] == numeroProcurado) {
            return indiceMeio;
        }

        if (numeroProcurado < array[indiceMeio]) {
            return binarySearch(array, numeroProcurado, start, indiceMeio - 1);
        }

        return binarySearch(array, numeroProcurado, indiceMeio + 1, end);
    }
}
```

## 📚 Conceitos Fundamentais
- **Divisão e Conquista**: O problema é reduzido pela metade a cada iteração.
- **Necessidade de Ordenação**: O array deve estar ordenado antes da busca.
- **Eficiência Logarítmica**: A cada iteração, o espaço de busca é reduzido exponencialmente.

## 🏁 Conclusão
A **Busca Binária** é muito mais rápida que a **Busca Linear (O(n))**, tornando-se ideal para grandes volumes de dados **ordenados**. Seu tempo de execução cresce **logaritmicamente**, o que a torna altamente eficiente.

---

🔹 **Autor:** Daniel Azevedo de Oliveira Maia 
🔹 **Linguagem:** Java  
