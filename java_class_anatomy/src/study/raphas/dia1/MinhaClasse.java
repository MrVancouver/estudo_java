package study.raphas.dia1;
public class MinhaClasse {
    public static void main(String[] args) {
        final int ANO = 2020;
        double pi = 3.14;
        short small_num = 10;
        long large_num = 999999999; 
        boolean verdade = true;
        boolean mentira = false;

        String nome = "Raphael";
        String sobrenome = "Setubal";
        String [] gay_completo = {"Thalles","Sampaio","de Paula","Martins","Paulakkkk"};
        String nome_completo = nomeCompleto(nome, sobrenome);
        System.out.print(nome_completo + " ");

        String media_final = media(6);
        System.out.println(media_final);
}
    public static String nomeCompleto(String primero_nome, String segundo_nome){
        return "Seu nome é "+primero_nome.concat(" ").concat(segundo_nome);
    }
    public static String media (float media_boletim){
        if (media_boletim > 6)
            return "aprovado";
        else if(media_boletim < 6)
            return "reprovado";
        else
            return "por pouco ein seu merda, fudido";
    }
    
}

