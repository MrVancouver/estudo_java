package study.raphas.collections.set;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }
    public Set<Produto> exibirPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(); // HashSet não permite ordenação, 
        produtosPorNome.addAll(produtoSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
    // Criando uma instância do CadastroProdutos
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    // Adicionando produtos ao cadastro
    cadastroProdutos.adicionarProduto("Smartphone",1L, 1000d, 10);
    cadastroProdutos.adicionarProduto("Notebook",2L, 1500d, 5);
    cadastroProdutos.adicionarProduto("Mouse",3L, 30d, 20);
    cadastroProdutos.adicionarProduto("Teclado",4L, 50d, 15);

    // Exibindo todos os produtos no cadastro
    System.out.println(cadastroProdutos.produtoSet);

    // Exibindo produtos ordenados por nome
    System.out.println(cadastroProdutos.exibirPorNome());

    // Exibindo produtos ordenados por preço
    System.out.println(cadastroProdutos.exibirPorPreco());
  }

}
