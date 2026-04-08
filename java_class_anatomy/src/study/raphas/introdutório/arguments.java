package study.raphas.introdutório;

public class arguments {
    public static void main(String[] args){
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá meu nome é "+ nome + " "+ sobrenome);
        System.out.println("Tenho "+ idade +" anos");
        System.out.println("E minha altura é de "+ altura +" metros");
    }

}
