package study.raphas.condicional;

public class simples {
    public static void main(String[] args){
        double saldo = 7;
        double valor_solicitado = 12;

        if(valor_solicitado<saldo){
            saldo = saldo - valor_solicitado;
            System.out.println("Seu novol saldo é de: "+saldo);
        }
        System.out.println(saldo);
    }
}
