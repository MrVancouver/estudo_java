package study.raphas.collections;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

    private List<Item> carrinho;

    public CarrinhoCompra(){
        this.carrinho = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.carrinho.add(item);
    }
    public void removerItem(String nome){
        if(carrinho.isEmpty()){
            System.out.println("Carrinho Vazio");
        }
        else{
            List<Item> ItemParaRemover = new ArrayList<>();
            for (Item i : carrinho){
                if(i.getNome().equalsIgnoreCase(nome)){
                    ItemParaRemover.add(i);
                }
            }
            carrinho.removeAll(ItemParaRemover);
        }
    }
    public double calcularValorTotal(){
        double total = 0, now = 0;
        if(carrinho.isEmpty()){
            System.out.println("Carrinho Vazio!");
        }
        else{
            for (Item i: carrinho){
                now = i.getPreco() * i.getQuantidade();
                total += now;
            }
            System.out.println("O total da sua compra é de: " + total);
        }
        return total;
    }
    public void exibirItens(){
        if (carrinho.isEmpty()) {
            System.out.println("Carrinho vazio!");
            return;
        }

        for (Item item : carrinho) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        CarrinhoCompra carrinhoMeu = new CarrinhoCompra();

        carrinhoMeu.adicionarItem("feijão",27.2,2);
        carrinhoMeu.adicionarItem("Arroz", 22, 3);
        carrinhoMeu.exibirItens();
        carrinhoMeu.calcularValorTotal();
    }
}
