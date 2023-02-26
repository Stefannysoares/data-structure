/*Exercicio B - Atividade em sala de aula (Semana 01) - Lista Recursivida 01
 *Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 *Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: uma função recursiva que recebe o dividendo e o divisor de uma operação de divisão e, por subtrações, exibe o resto da divisão.
 */
package controller;
public class Exrecursiva01B {
    public Exrecursiva01B(){
        super();
    }

    public int resto (int a, int b){
        if (a<b)
            return a;
        else 
            return resto (a-b,b);
    }

}
