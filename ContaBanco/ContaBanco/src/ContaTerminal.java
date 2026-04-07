import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o número da conta: ");
        int num = scanner.nextInt();

        System.out.println("Digite a Agência: ");
        String ag = scanner.next();

        System.out.println("Digite seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ ag+", conta" + num +" e seu saldo "+ saldo + " já está disponível para saque.");
    }
}

