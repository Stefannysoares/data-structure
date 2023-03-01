/* Exercicio A - Atividade para casa (Semana 02) - Lista (sala)
 * Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 * Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: uma aplicação em Java que tenha uma função recursiva que
calcule o somatório do N primeiros número NATURAIS (a função deve
retornar zero para números negativos)
 */
package controller;

public class Exrecursiva03A {
    public Exrecursiva03A(){
        super();
    }

    public int SomaN (int num){

         if (num >= 1){ // Chamada da recursiva, enquanto N for >= 1
            return num + SomaN(num-1);
         }
         else //Condição de parada N<1
            return 0;
    }
    
}
