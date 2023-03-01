/* Exercicio B - Atividade para casa (Semana 02) - Lista (sala)
 * Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 * Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: uma aplicação em Java que tenha uma função recursiva que,
recebendo um número inteiro, converta para binário. Entrada
limitada a 2000.
 */

package controller;
public class Exrecursiva03B {
    public Exrecursiva03B(){
        super();
    }
    public String Binario (int n) {

        if (n > 0){ // Condição de parada quando n <= (Nesse caso quando ele cai no else)

            String s = String.valueOf(n%2);
            String f = String.valueOf(Binario(n/2))+s; // Chamando a recursividade convertendo para string e concatenando com o anterior
            return (f);
        
        }
        else 
            return "";
    }

}
