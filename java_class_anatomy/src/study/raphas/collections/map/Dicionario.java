package study.raphas.collections.map;
import java.util.Map;
import java.util.HashMap;
public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }
    public void AdicionarPalavra(String palavra, String descricao){
        dicionarioMap.put(palavra,descricao);
    }
    public void RemoverPalavra(String palavra){
        dicionarioMap.remove(palavra);
    }
    public void ExibirPalavras(){
        System.out.println(dicionarioMap);
    }
    public String PesquisarPorPalavra(String palavra){
        String palavraBuscada = null;
        if (!dicionarioMap.isEmpty()){
            palavraBuscada = dicionarioMap.get(palavra);
        }
        return palavraBuscada;
    }
    public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    // Adicionar palavras (linguagens de programação)
    dicionario.AdicionarPalavra("java", "Linguagem de programação orientada a objetos.");
    dicionario.AdicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
    dicionario.AdicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

    // Exibir todas as palavras
    dicionario.ExibirPalavras();

    // Pesquisar palavras
    String definicaoJava = dicionario.PesquisarPorPalavra("java");
    System.out.println("Definição da linguagem 'java': " + definicaoJava);

    String definicaoCSharp = dicionario.PesquisarPorPalavra("csharp");
    System.out.println(definicaoCSharp);

    // Remover uma palavra
    dicionario.RemoverPalavra("typescript");
    dicionario.ExibirPalavras();
  }
}
