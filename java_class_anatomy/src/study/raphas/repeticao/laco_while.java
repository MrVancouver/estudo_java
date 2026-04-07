package study.raphas.repeticao;
import java.util.concurrent.ThreadLocalRandom;

public class laco_while {
    public static void main(String[] args) {
        double mesada  = 50;

        while (mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: "+ valorDoce + " Adicionado na bolsa.");
            mesada = mesada - valorDoce;
            System.out.println("Mesada no momento da compra: "+ mesada);
        }
        System.out.println("Mesada: "+ mesada);
        System.out.println("Gastou toda a mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
