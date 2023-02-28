/* Exercicio C - Atividade para casa (Semana 01) - Lista Recursivida 02
 * Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 * Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: uma função recursiva que exiba a quantidade de dígitos de um número inteiro passado como parâmetro:
 */
package controller;
public class Exrecursiva02C {
    public Exrecursiva02C (){
        super ();
    }
   // int numero = 12345678;
   // String s = Integer.toString(numero);
   // System.out.println(s.length());

    public int nInt (int n, int m){

        if (n<m){// ponto de parada
            m = m/10;
            
            String s = Integer.toString(m);
            int dig = s.length(); 
            return dig;
        }
        if (n / m >= 1){ // condição para a chamada da próxima recursiva
            return nInt(n, m*10);

        }
        return 0;
        
    }
}
