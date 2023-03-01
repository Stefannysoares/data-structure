package view;
import javax.swing.JOptionPane;
import controller.Exrecursiva03A;
import controller.Exrecursiva03B;
import controller.Exrecursiva03C;
import controller.Exrecursiva03D;

public class viewExrecursiva03 {
    
    public viewExrecursiva03(){
        super();
    }

    public void ListaC (){
        Exrecursiva03A opA = new Exrecursiva03A();
        Exrecursiva03B opB = new Exrecursiva03B();
        Exrecursiva03C opC = new Exrecursiva03C();
        Exrecursiva03D opD = new Exrecursiva03D();

        int opc = 0;

        do {

            if (opc != 9){
                opc = Integer.parseInt(JOptionPane.showInputDialog("Lista de Exercicios 03 \n Selecione qual recursividade deseja executar: \n 1 - Soma nNaturias \n 2 - Converte Binario \n 3 - Somatória N \n 4 - Consulta f em N \n 5 - Em construção \n 6 - Em construção \n 8 - Retornar ao Menu Principal \n 9 - Fechar Programa"));
                
            }

            switch (opc) {

                case 1:
                    int num = -1;
                    while (num <= 0){
                        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor INTEIRO e POSITIVO: "));
                    }
                    int somaF = opA.SomaN(num);
                    System.out.println("A soma dos " + num + " primeiros números naturais do número  é " + somaF);
                     
                break;

                case 2:
                    int v = 2001;
                    while (v < 0 || v > 2000){
                        v = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor entre 0 e 2000, para ser convertido para binário: "));
                    }
                    String bin = opB.Binario(v);
                    System.out.println("O valor " + v + " em números binários é: "+ bin);
                break;

                case 3:
                    int ns = -1;
                    while (ns < 0 ){
                        ns = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro e positivo: "));
                    }
                    double sSoma = opC.sSomatoria(ns);
                    System.out.println("Resultado da soma da sequencia: " + sSoma);
                    //Em construção
                break;

                case 4:
                    int nD = 9;
                    int m = 10;
                    while (nD < 10 || nD > 999999){
                        nD = Integer.parseInt (JOptionPane.showInputDialog("Insira um valor entre 10 e 999999: "));
                    }

                    while (m > 9 || m < 0 ){
                        m = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor entre 0 e 9: "));
                    }
                    int c =0;
                    int rD = opD.Busca(nD, m, c);
                    System.out.println("A quantidade de vezes que o número" + m + " aparece no número " + nD + " é: "+ rD);
                break;

                case 5:
                    System.out.println("Em construção!");
                break;

                case 6:
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
            }

        }while (opc != 9 && opc != 8);
    } 
                
}

