/*Exercicio A - Atividade em sala de aula (Semana 01) - Lista Recursivida 01
 *Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 *Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: uma função recursiva que recebe 2 valores A e B e, por somas, apresenta o resultado da mul􀆟plicação de A por B.
 */

package controller;
public class Exrecursiva01A {
   
    public Exrecursiva01A (){
        super();
    }

    public int Soma (int a, int b){
        if (b==0)
            return 0;
        else
            return a + Soma(a,b-1);
    }

}


