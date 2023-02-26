package view;
import javax.swing.JOptionPane;
import controller.Exrecursiva01A;
import controller.Exrecursiva01B;
import controller.Exrecursiva01C;

public class viewExrecuriva01 {

    public viewExrecuriva01(){
        super();
    }

    public void  ListaA (){
        Exrecursiva01A opA = new Exrecursiva01A();
        Exrecursiva01B opB = new Exrecursiva01B();
        Exrecursiva01C opC = new Exrecursiva01C();

        int opc = 0;

        do {
            if (opc != 9){
                opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione qual recursividade deseja executar: \n 1 - Multiplica dois valores \n 2 - Mostra resto \n 3 - N de pares do vetor \n 9 - Fechar Menu"));
            }

            switch (opc){

                case 1:
                    int a = Integer.parseInt(JOptionPane.showInputDialog("Insira uma valor Inteiro Positivo: "));
                    int b = Integer.parseInt(JOptionPane.showInputDialog("Insira outro valor Inteiro epositivo : "));
                    int resultado = opA.Soma(a,b);
                    System.out.println("O resultado da multiplicação dos dois valores inseridos é: "+ resultado);
                    break;

                case 2:
                    int c = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro positivo:"));
                    int d = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro positivo MENOR DO QUE O ANTERIOR:"));
                    int resultadob = opB.resto(c,d);
                    System.out.println("O resto da divisão dos dois valores é: " + resultadob);
                    break;

                case 3: //Falta ajustar o retorno da recursiva
                     int n = Integer.parseInt(JOptionPane.showInputDialog("Defina o tamanho so vetor:"));
                     int vetor [] = new int [n];
                     int cont = 0;
                     for (int i =0; i < n; i++){
                        vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro e positivo: "));
                     }
                     int f =0;
                     int resultadoc =opC.ParVetor(vetor, f, n, cont);
                     System.out.println("A quantidades de numeros pares no vetor é: " + resultadoc);
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

