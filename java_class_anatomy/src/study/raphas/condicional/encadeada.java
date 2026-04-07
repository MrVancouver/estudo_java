package study.raphas.condicional;

public class encadeada {
    public static void main(String[] args) {
        double nota = 12;

        if(nota < 5){
            System.out.println("Reprovado");
        }
        else if(nota >= 5 && nota < 7){
            System.out.println("Prova de recuperação");
        }
        else{
            System.out.println("Aprovado");
        }
    }
}
