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
    
    public int ParVetor (int vet [], int i, int t, int c){
        
        if (i == t){
            return c; 
        }
            
       else if (vet[i]!=0 && vet[i]%2==0){
            return  ParVetor(vet, i+1, t, c+1);
            
       }   
        else
            return  ParVetor(vet, i+1, t, c);

    }


    


}
