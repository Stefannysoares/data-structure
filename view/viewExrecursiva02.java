package view;
import javax.swing.JOptionPane;
import controller.Exrecursiva02A;
import controller.Exrecursiva02B;
//import controller.Exrecursiva02C;
//import controller.Exrecursiva02D;


public class viewExrecursiva02 {
    
    public viewExrecursiva02 (){
        super();
    }

    public void ListaB (){

        Exrecursiva02A opA = new Exrecursiva02A();
        Exrecursiva02B opB = new Exrecursiva02B();
      //  Exrecursiva02C opC = new Exrecursiva02C();
      //  Exrecursiva02D opD = new Exrecursiva02D();

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
                   
                case 2:
                    int tam = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor: "));
                    int vet [] = new int [tam];
                    for (int y = 0 ; y< tam ; y++){
                        vet[y] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro, positivo o negativo: "));
                    } int i = 0; int c =0;
                    int rB = opB.nVet(vet, i, tam, c);
                    System.out.println("A quantidade de numeros negativos no vetor é de: "+rB);
                    break;

                case 3:
                    // Em construção
                    break;

                case 4:
                    // Em construção
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
