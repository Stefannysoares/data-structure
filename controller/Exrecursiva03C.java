/* Exercicio C - Atividade para casa (Semana 02) - Lista (sala)
 * Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 * Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro (N), apresente a saída da somatória.
 */
package controller;

public class Exrecursiva03C {
    public Exrecursiva03C(){
        super ();
    }

    
    public double sSomatoria (int n){
        
        if (n != 0){ // Condição de parada quando n for igual a 0
           double s = (double) 1/n;
           s = s + sSomatoria(n-1); // Condição para chamada da próxima recursiva enquanto for diferente de zero chama a recursividade e subtrai um de n
           return s;
        }
            else 
                return 0;
    }

}
