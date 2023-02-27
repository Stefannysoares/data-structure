package view;
import javax.swing.JOptionPane;
import controller.Exrecursiva02A;


public class viewExrecursiva02 {
    
    public viewExrecursiva02 (){
        super();
    }

    public void ListaB (){

        Exrecursiva02A opA = new Exrecursiva02A();

        int opc = 0;

        do {

            if (opc != 9){
                opc = Integer.parseInt(JOptionPane.showInputDialog("Lista de Exercicios 02 \n Selecione qual recursividade deseja executar: \n 1 - Fatorial de N \n 2 - aguarde \n 3 - aguarde \n 4 - aguarde \n 8 - Retornar ao Menu Principal \n 9 - Fechar Programa"));
                
            }

            switch (opc) {

                case 1:
                    int n = 12;
                    while (n >= 12){
                        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor Positivo e Inteiro MENOR QUE DOZE: "));
                    }
                    int rA = opA.fat(n);
                    System.out.println("O fatorial de " + n + " é " + rA);
                   break;           
                     
                case 8: 
                    JOptionPane.showMessageDialog(null, "Retornando ao Menu Principal!");  
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Programa Encerrado!");  
                    System.exit(0);
                    break;

                    default: JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!");
            }

        }while (opc != 9 && opc != 8);
    }
}
