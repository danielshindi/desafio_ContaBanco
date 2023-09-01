import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("en", "US"));
        //TODO: conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Exibir a mensagem conta criada

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.next();
        
        System.out.println("Por favor, digite o número da conta: ");
        numero = sc.nextInt();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

    }
}
