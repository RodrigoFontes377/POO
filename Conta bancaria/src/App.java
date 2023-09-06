import java.util.Scanner;
public class App {

    private static double saldoContaBancaria = 1000.00; 
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Aplicativo Bancário");

        boolean sair = false;
        while (!sair) {
            exibirMenu();
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    informaçõesDoCliente();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    transferir();
                    break;
                case 5:
                    mostrarSaldo();
                    break;
                case 6:
                    sair = true;
                    System.out.println("Obrigado por usar o Aplicativo Bancário");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Informações do Cliente");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Transferir");
        System.out.println("5. Mostrar Saldo");
        System.out.println("6. Sair do Aplicativo");
    }

    private static void informacõesDoCliente() {
    
        System.out.println("Informações do Cliente: Nome, Número da Conta, etc.");
    }

    private static void depositar() {
        System.out.print("Digite o valor a depositar: R$");
        double valor = scanner.nextDouble();
        saldoContaBancaria += valor;
        System.out.println("Depósito efetuado com sucesso. Novo saldo: R$" + saldoContaBancaria);
    }

    private static void sacar() {
        System.out.print("Digite o valor a sacar: R$");
        double valor = scanner.nextDouble();
        if (valor <= saldoContaBancaria) {
            saldoContaBancaria -= valor;
            System.out.println("Saque efetuado com sucesso. Novo saldo: R$" + saldoContaBancaria);
        } else {
            System.out.println("Saldo insuficiente. Não foi possível concluir a transação.");
        }
    }

    private static void transferir() {
        System.out.print("Digite o valor a transferir: R$");
        double valor = scanner.nextDouble();
        if (valor <= saldoContaBancaria) {
            saldoContaBancaria -= valor;
            System.out.println("Transferência efetuada com sucesso. Novo saldo: R$" + saldoContaBancaria);
        } else {
            System.out.println("Saldo insuficiente. Não foi possível concluir a transferência.");
        }
    }

    private static void mostrarSaldo() {
        System.out.println("Saldo atual: R$" + saldoContaBancaria);
    }
}
