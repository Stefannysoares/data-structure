package view;
import controller.ExOrdenacao01A;

import java.util.Arrays;

import javax.swing.JOptionPane;
public class viewOrdenacao01 {

    public void ListaE(){

        ExOrdenacao01A opA = new ExOrdenacao01A();

        int opc = 7;
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor que deseja criar: "));
        int vet [] = new int [tam];
        for (int i = 0; i < tam; i ++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro para a posição  " + i + "do vetor:"));
        }

        do{
            if (opc != 9){
                opc = Integer.parseInt(JOptionPane.showInputDialog("MENU \n Selecione de qual forma você deseja ordenar o vetor: \n 1 - Bubble Sort \n 2 - Merge Sort \n 3 - Quick Sort\n 8 - Retornar ao programa Principal \n 9 - Fechar programa"));
            }

        switch (opc){

            case 1:
                int Ra [] = new int [tam];
                Ra = opA.bubble(vet, tam);
                System.out.println("O vetor ordenado é: " );
                for (int c = 0; c< tam; c++){
                    System.out.print(vet[c] + " ");
                }
            break;

            case 2:
                ExOrdenacao01A ms = new ExOrdenacao01A();
                ms.mergeSort(vet, 0, vet.length - 1);
                System.out.println(Arrays.toString(vet));
            break;

            case 3:
                System.out.println("Em construção!");
            break;

            case 8:
                     JOptionPane.showMessageDialog(null, "Retornando ao Menu Principal!");  
            break;

            case 9:
            JOptionPane.showMessageDialog(null, "Programa Encerrado!");  
                    System.exit(0);
                    break;

                    default: JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!");
            break;

        }


        }while (opc != 9 && opc !=8);



    }
    
}
