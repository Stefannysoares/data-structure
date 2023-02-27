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

        if (a > 1){
            System.out.println("o valor de a: " + a);
            return a = a* fat(a-1);
        }

        else {
            return 1;
        }
            
    }

}
