/* Exercicio D - Atividade para casa (Semana 01) - Lista Recursivida 02
 * Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 * Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres (Ex.:entrada=teste; saída = etset):
Deve se utilizar a função SUBSTRING da Java
 */
package controller;

public class Exrecursiva02D {
    public Exrecursiva02D (){
        super();
    }
    public String contrario (String word){
        
        if (word.length() <= 1) { // condição de parada
            return word;
        } else {
            char primeiro = word.charAt(0); // pega o primeiro caractere
            String resto = word.substring(1); // pega o restante da string
            String invertido = contrario(resto); // chama recursivamente a função para o restante da string
            return invertido + primeiro; // concatena o resultado invertido com o primeiro caractere
        }
    }
}
