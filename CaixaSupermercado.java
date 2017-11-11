package caixasupermercado;

import java.util.Scanner;

public class CaixaSupermercado {

    public static void main(String[] args) {

        Registradora reg = new Registradora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja Bem Vindo ao SuperMercado Ruy Barbosa");

        
        
        while (true){
           
            System.out.println("Digite 1 para iniciar uma nova venda, 2 encerrar" );
            int num1 = 0;
            num1 = scanner.nextInt();
            
           if(num1 == 1){
                reg.iniciarVenda();       
            do{
                System.out.println("Digite 2 para incluir um novo item, 3 para concluir a venda ");
                int num = scanner.nextInt();
                                
                if (num == 2) {                    
                    System.out.println("Codigo");
                    int cod = scanner.nextInt();
                    System.out.println("Quantidade");
                    int qtd = scanner.nextInt();
                    reg.incluirVenda(cod, qtd);
                }else if (num == 3) {
                    float pagam = 0;
                    System.out.println("O total dá venda é " + reg.concluirVenda());
                    System.out.println("valor pago? ");
                    pagam = scanner.nextFloat();
                    reg.pagamento(pagam);
                    System.out.println("Troco: " + reg.getTroco());
                    break;
                } else if (num == 4) {
                    System.out.println("Qual valor do pagamento");
                
                float valor = scanner.nextInt();
                reg.valorPagamento(valor);
                }
                else if (num ==0)
                {
                    System.exit(0);
                } else {
                    System.out.println("Opção invalida.");
                }
             }while(true);
        } else if (num1 != 1){
               System.out.println("Sistema encerrado");
               break;
        }
      }   
    }
}
