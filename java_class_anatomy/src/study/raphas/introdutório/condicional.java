package study.raphas.introdutório;

public class condicional {
    public static void main(String[] args) {
        boolean logico1 = true;
        boolean logico2 = false;

        if (logico1 && logico2){
            System.out.println("Aplicou o gap");
        }
        else if (logico1 || logico2){
            System.out.println("Meio gap aplicado");
        }
        else{
            System.out.println("Não aplicou o gap");
        }

    }
}
