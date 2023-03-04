/*Menu de Atividades de estrutura de dados (Prof Leandro Colevati)
 * Aluna Stefanny Soares Conceição - 3ºADS Noite/2023
 * Descrição: Menu onde constam todas as atividades de estrutura de dados;
 */

package main; 
import javax.swing.JOptionPane;
import view.viewExrecursiva01;
import view.viewExrecursiva02;
import view.viewExrecursiva03;

 public class menu{
     public static void main (String [] args ){
       viewExrecursiva01 La = new viewExrecursiva01();
       viewExrecursiva02 Lb = new viewExrecursiva02();
       viewExrecursiva03 Lc = new viewExrecursiva03();

        int opc = 0;

        do {
            if (opc != 9){
                opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione qual lista de atividade deseja visualizar: \n 1 - Lista Seman 01 (sala) \n 2 - Lista Semana 01 (Casa) \n 3 - Lista Semana 02 (Sala)  \n 9 - Fechar Menu"));
            }

            switch (opc){
                case 1:
                   La.ListaA();
                   break;

                case 2:
                    Lb.ListaB();
                    break;

                case 3:
                    Lc.ListaC();
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
