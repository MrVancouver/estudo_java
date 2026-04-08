package study.raphas.collections.list;
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros(){this.numerosList = new ArrayList<>();}
    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }
    public int calcularSoma(){
        int  total = 0;
        if(!numerosList.isEmpty()){
            for(Integer n : numerosList){
                total += n;
            }
        return total;
        }
        else {
            throw new RuntimeException("A lista está vazia!");}
        
    }
    public int encontrarMaiorNum(){
        int maior = 0;
        if(!numerosList.isEmpty()){
            for (Integer n : numerosList){
                if(maior < n){
                    maior = n;
                }
            }
            return maior;
        }
        else {
            throw new RuntimeException("A lista está vazia!");}
    }
    public int encontrarMenorNum(){
        int menor = Integer.MAX_VALUE;
        if(!numerosList.isEmpty()){
            for (Integer n : numerosList){
                if(menor > n){
                    menor = n;
                }
            }
        return menor;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
    }
    }
    public List<Integer> exibirNumeros(){
    if (!numerosList.isEmpty()){
     return numerosList;   
    }
    else{
        throw new RuntimeException("A lista está vazia!");
    }
    }
    public static void main(String[] args) {
        SomaNumeros somarnumeros = new SomaNumeros();
    
        somarnumeros.adicionarNumero(4);
        somarnumeros.adicionarNumero(7);
        somarnumeros.adicionarNumero(1);
        System.out.println(somarnumeros.calcularSoma());
        System.out.println(somarnumeros.encontrarMaiorNum());
        System.out.println(somarnumeros.encontrarMenorNum());
        System.out.println(somarnumeros.exibirNumeros());
    }



}
