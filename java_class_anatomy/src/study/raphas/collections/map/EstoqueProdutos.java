package study.raphas.collections.map;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    
    private Map<Long, Produto> estoqueProdutosMap;
    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void AdicionarProdutos(long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }
    public void ExibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double CalcularValorTotalEstoque(){
        double valorTotal = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }
    public Produto ObterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorValor){
                    produtoMaisCaro = p;
                    maiorValor = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }
    public Produto ObterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorValor = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() < menorValor){
                    produtoMaisBarato = p;
                    menorValor = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }
    public Produto ObterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto escolhido = null;
        double calculo = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if((p.getPreco() * p.getQuantidade()) > calculo){
                    escolhido = p;
                    calculo = p.getPreco() * p.getQuantidade();
                }
            }
        }
        return escolhido;        
    }
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        // estoque.ExibirProdutos();

        // Adiciona produtos ao estoque
        estoque.AdicionarProdutos(1L, "Notebook", 1500.0,1);
        estoque.AdicionarProdutos(2L, "Mouse", 25.0, 5);
        estoque.AdicionarProdutos(3L, "Monitor", 400.0, 10);
        estoque.AdicionarProdutos(4L, "Teclado", 40.0, 2);

        // Exibe os produtos no estoque
        estoque.ExibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.CalcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.ObterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.ObterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.ObterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }

}
