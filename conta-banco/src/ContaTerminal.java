import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome.");
        final String nome = terminal.next();

        System.out.println("Por favor, digite o número da conta.");
        final int numeroConta = terminal.nextInt();

        System.out.println("Por favor, digite o número da agência.");
        final String numeroAgencia = terminal.next();

        System.out.println("Por favor, digite o saldo inicial");
        final float saldo = terminal.nextFloat();

        Conta conta = new Conta(
                nome,
                numeroConta,
                numeroAgencia,
                saldo);
        conta.exibirInformacoes();

        terminal.close();
    }
}
