/*Exercicio B - Atividade para casa (Semana 01) - Lista Recursivida 02
 *Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 *Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: Uma função recursiva que exiba o total de elementos negativos de um vetor de inteiros,de N posições, passado como parâmetro:
 */
package controller;

public class Exrecursiva02B {
    public Exrecursiva02B(){
        super();
    }

    public int nVet (int vet [], int i, int t, int c){
        if (i == t){ //ponto de parada (quando o contador do indice do vetor for igual ao tamanho do vetor)
            return c; 
        }
            
       else if (vet[i] < 0){  //condição para a chamada da próxima recursiva
            return  nVet (vet, i+1, t, c+1);
            
       }   
        else
            return nVet(vet, i+1, t, c);
    }
}
