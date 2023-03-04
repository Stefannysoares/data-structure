/* Exercicio E - Atividade para casa (Semana 02) - Lista (sala)
 * Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 * Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: uma função recursiva que, dado uma posição da série, a função retorne seu valor. Entrada limitada a 20.
 */
package controller;

public class Exrecursiva03E {
    
    public Exrecursiva03E(){
        super();
    }

    public int fibonacci (int n){

        if (n == 1 || n == 0){ // Se n for igual a 0 ou 1, a função retorna o próprio n, pois os valores das duas primeiras posições são 0 e 1.
            return n;
        }
        else { // A função retorna a soma dos valores das duas posições anteriores da sequência, calculados de forma recursiva através de chamadas à própria função fibonacci.
            return fibonacci(n-1) + fibonacci(n-2);
        }
            
    }
}
