import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Dados do Cliente
        String mensagemInicial = """
                ###############################################
                Dados inicias do cliente:
                
                Nome:               Jeovane Peralez
                Tipo conta:         Corrente
                Saldo inicial:      R$ 2500,00
                ###############################################
                """;
        System.out.println(mensagemInicial);

        // Variaveis
        double saldoAtual = 2500;
        double valorRecebido = 0;
        double valorTransferencia = 0;
        int opc = 0;


        // Menu de Opções
        while (opc != 4){
            String menu = """
                    Operações:
                    1- Consultar saldo atual
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    \nDigite a opção desejada:
                    """;
            System.out.println(menu);
            opc = scan.nextInt();
            if(opc < 1 || opc > 4){
                System.out.println("Digite uma opção existente!\n");
            }

            // Verificações
            switch(opc){
                case 1:
                    System.out.println("\nO seu saldo atual é R$ " + saldoAtual);
                    break;

                case 2:
                    System.out.println("Quanto você vai receber?:");
                    valorRecebido = scan.nextDouble();

                    if(valorRecebido > 0){
                        saldoAtual += valorRecebido;
                        System.out.println("\nAgora, seu saldo atual é de R$ " + saldoAtual);
                    }else{
                        System.out.println("\nVocê não pode receber um valor nulo ou negativo!");
                    }
                    break;

                case 3:
                    System.out.println("Quanto deseja transferir?:");
                    valorTransferencia = scan.nextDouble();

                    if(valorTransferencia > 0 || valorTransferencia < saldoAtual){
                        saldoAtual -= valorTransferencia;
                        System.out.println("\nAgora, seu saldo atual é de R$ " + saldoAtual);
                    }else{
                        System.out.println("\nVocê não pode transferir um valor nulo, negativo ou que você não tenha disponível!");
                    }
                    break;
                }
            }
        }

    }