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

        System.out.print("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agencia é" + " " +
        + numeroAgencia + ", conta" + " " + agencia + " " + "e seu saldo de" + " " + saldo + " " + "já está disponível para saque.");
            
        scanner.close();

    }
}
