package study.raphas.condicional;

public class switch_case {
    public static void main(String[] args) {
        String sigla = "A";

        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }

}
