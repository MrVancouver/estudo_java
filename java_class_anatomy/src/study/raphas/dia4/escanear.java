package study.raphas.dia4;
import java.util.Scanner;
import java.util.Locale;

public class escanear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println(nome+" "+sobrenome+" "+idade+" "+altura);
    }
}
