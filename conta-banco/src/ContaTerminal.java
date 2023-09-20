import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.print("Por favor, digite a Agência ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Por favor, digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Por favor, digite seu saldo: ");
        float saldo = scanner.nextFloat();

        System.out.printf(
                "Olá %s %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, sua conta é %s e seu saldo de %s já está disponível para saque",
                nome, sobrenome, numeroAgencia, agencia, saldo);

        scanner.close();

    }
}
