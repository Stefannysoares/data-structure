/*Menu de Atividades de estrutura de dados (Prof Leandro Colevati)
 * Aluna Stefanny Soares Conceição - 3ºADS Noite/2023
 * Descrição: Menu onde constam todas as atividades de estrutura de dados;
 */

package main; 
import javax.swing.JOptionPane;
import view.viewExrecuriva01;

 public class menu{
     public static void main (String [] args ){
       viewExrecuriva01 La = new viewExrecuriva01();

        int opc = 0;

        do {
            if (opc != 9){
                opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione qual lista de atividade deseja visualizar: \n 1 - Lista Recursiva (sala) \n 2 - Lista Recursiva (Casa)  \n 9 - Fechar Menu"));
            }

            switch (opc){
                case 1:
                   La.ListaA();
                   break;

                case 2:
                    System.out.println("Lista B (Recursiva)- Em construção");
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO!");  
                    System.exit(0);
                    break;

                    default: JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!");
            }
         }while(opc !=9);

    }
 }
