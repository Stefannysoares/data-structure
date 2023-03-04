/* Exercicio F - Atividade para casa (Semana 02) - Lista (sala)
 * Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 * Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: uma função recursiva que solucione a função (Entrada limitada a 10):
 */
package controller;
public class Exrecursiva03F {
    public Exrecursiva03F(){
        super();
    }

    public double fFat (double n){
        if (n == 0){
            return 1;
        }
        else 
            return n*fFat(n-1);
    }



    public double SomaFat (double n){
        
        if (n < 2) //Condição de parada quando n for menor que dois
                return 1;
        else 
            return 1/fFat(n) + SomaFat(n-1); //Condição para chamada da próxima recursiva enquanto for diferente de zero chama a recursividade e subtrai um de n

    }
}
