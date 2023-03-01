/* Exercicio D - Atividade para casa (Semana 02) - Lista (sala)
 * Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 * Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: uma aplicação em Java que tenha uma função recursiva que,
recebendo um numero inteiro de 10 a 999999 e recebendo um 2º
número inteiro (de 0 a 9), tenha uma função recursiva que apresente
quantas vezes o 2º número aparece no primeiro.
 */
package controller;

public class Exrecursiva03D {
    public Exrecursiva03D(){
        super();
    }

   public  int Busca (int n, int ind, int c){
            if (n == 0){
                return 0;
            }
            else if (n%10 == ind){
                return c+ Busca(n/10, ind, c+1);
            }
            else 
                return Busca(n/10, ind, c);
    }

}
