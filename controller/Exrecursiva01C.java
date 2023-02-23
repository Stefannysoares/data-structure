/*Exercicio C - Atividade em sala de aula (Semana 01) - Lista Recursivida 01
 *Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 *Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: uma função recursiva que recebe o dividendo e o divisor de uma operação de divisão e, por subtrações, exibe o resto da divisão.
 */
package controller;
public class Exrecursiva01C {
    public Exrecursiva01C(){
        super();
    }
    
    int c =0;
    public int ParVetor (int vet [], int i, int t){
        
        if (vet[i]< t){
            return c; //Ainda esta retornando zero Preciso arrumar
        }
            
       else if (vet[i]%2==0){
            c=c+1;
            return ParVetor(vet, i+1, t);
       }   
        else
             return ParVetor(vet, i+1, t);

    }


    


}
