package study.raphas.condicional;

public class ternario {
    public static void main(String[] args) {
        double nota = 34;

        String resultado = nota >= 7 ? "Aprovado":nota >= 5 && nota<7 ? "Recuperação":"Reprovado";
        System.out.println(resultado);
}
}

