package study.raphas.collections.set;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;
    public ConjuntoPalavrasUnicas(){this.palavrasUnicas = new HashSet<>();}
    
    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra.toLowerCase());
    }
    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
                    palavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
            } 
        else{
      System.out.println("O conjunto está vazio!");
        }
    }
    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }
    public void exibirPalavras(){
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoP = new ConjuntoPalavrasUnicas();
        conjuntoP.adicionarPalavra("abacate");
        conjuntoP.adicionarPalavra("pao");

        conjuntoP.exibirPalavras();
        System.out.println(conjuntoP.verificarPalavra("abacate")  );
        conjuntoP.removerPalavra("pao");
        conjuntoP.exibirPalavras();
        System.out.println(conjuntoP.verificarPalavra("pao"));
    }

}
