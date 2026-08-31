import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op = 0;

        try {
            Agencia c1 = new Agencia(1, 100, "Sede", 1);

            System.out.println("Bem-vindo ao Banco!");
            System.out.println(c1.consultarSaldo());

            while (op != 4 && op != 5) {

                System.out.println("\n===== MENU =====");
                System.out.println("1 - Creditar");
                System.out.println("2 - Debitar");
                System.out.println("3 - Consultar Saldo");
                System.out.println("4 - Encerrar Conta");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opcao: ");

                op = sc.nextInt();

                switch (op) {

                    case 1:
                        if (c1.getTipo() == 4) {
                            System.out.println("ERRO: a conta esta encerrada!");
                        } else {
                            System.out.print("Valor a creditar: R$ ");
                            double credito = lerValor(sc);

                            if (credito <= 0) {
                                System.out.println("ERRO: o valor deve ser maior que zero!");
                            } else {
                                c1.creditar(credito);
                                System.out.println("Novo saldo: R$ " + String.format("%.2f", c1.getSaldo()));
                            }
                        }
                        break;

                    case 2:
                        if (c1.getTipo() == 4) {
                            System.out.println("ERRO: a conta esta encerrada!");
                        } else {
                            System.out.print("Valor a debitar: R$ ");
                            double debito = lerValor(sc);

                            if (debito <= 0) {
                                System.out.println("ERRO: o valor deve ser maior que zero!");
                            } else {
                                c1.debitar(debito);
                                System.out.println("Novo saldo: R$ " + String.format("%.2f", c1.getSaldo()));
                            }
                        }
                        break;

                    case 3:
                        System.out.println(c1.consultarSaldo());
                        break;

                    case 4:
                        if (c1.getSaldo() < 0) {
                            System.out.println("ERRO: nao e possivel encerrar uma conta com saldo negativo!");
                            op = 0;
                        } else {
                            c1.encerrarConta();
                            System.out.println(c1.textoEncerrar());
                        }
                        break;

                    case 5:
                        System.out.println("Saindo do sistema...");
                        break;

                    default:
                        System.out.println("ERRO: opcao invalida! Digite um numero de 1 a 5.");
                        break;
                }
            }

        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("ERRO: digite apenas numeros!");
        } catch (Exception e) {
            System.out.println("ERRO inesperado: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("\nPrograma finalizado.");
        }
    }
    
    private static double lerValor(Scanner sc) {
        return Double.parseDouble(sc.next().replace(",", "."));
    }
}
