/*Exercicio A - Atividade para casa (Semana 01) - Lista Recursivida 02
 *Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 *Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: uma função recursiva que exiba o resultado do fatorial de um número.
 */
package controller;

public class Exrecursiva02A {
    public Exrecursiva02A (){
        super();
    }

    public int fat (int a ){

        if (a > 1) //Ponto de parada enquanto a for maior que 1
            return a = a* fat(a-1); //chamada da recursiva 

        else {
            return 1;
        }
            
            
    }

}
