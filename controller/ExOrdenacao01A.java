/*Exercicio Ordenação - Atividade em sala para casa (Semana 03) - Lista 01 - Exercicios de Ordenacao e recursividade
 *Aluna Stefanny Soares Conceição - 3º ADS Noite/2023
 *Matéria: Estrutura de Dados / Professor: Leandro Colevati
 * Descrição da classe: Exercicios  algoritmos de ordenacao Bubble sort, merge sort e quick sort.
 */

package controller;

public class ExOrdenacao01A {
    
    public ExOrdenacao01A(){
        super();
    }

    public int [] bubble (int vet [], int t){
        int aux = 0;
            for (int i = 0; i < t; i ++){
                for (int j = i+ 1; j < t ; j ++ ){
                    if (vet[i] > vet[j]){
                        aux = vet [i];
                        vet [i] = vet[j];
                        vet [j] = aux;
                    }
                }
            }
        
        return vet; 
    }


      
        public void mergeSort(int[] array, int inicio, int fim) {
            if (inicio < fim) {
                int meio = (inicio + fim) / 2;
                mergeSort(array, inicio, meio);
                mergeSort(array, meio + 1, fim);
                merge(array, inicio, meio, fim);
            }
        }
        
        public void merge(int[] array, int inicio, int meio, int fim) {
            int[] aux = new int[array.length];
            for (int i = inicio; i <= fim; i++) {
                aux[i] = array[i];
            }
            
            int esquerda = inicio;
            int direita = meio + 1;
            
            for (int i = inicio; i <= fim; i++) {
                if (esquerda > meio) {
                    array[i] = aux[direita];
                    direita++;
                } else if (direita > fim) {
                    array[i] = aux[esquerda];
                    esquerda++;
                } else if (aux[esquerda] < aux[direita]) {
                    array[i] = aux[esquerda];
                    esquerda++;
                } else {
                    array[i] = aux[direita];
                    direita++;
                }
            }
        }

}
