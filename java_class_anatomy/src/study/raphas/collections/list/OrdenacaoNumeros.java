package study.raphas.collections.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    OrdenacaoNumeros(){this.numerosList = new ArrayList<>();}
    public void adicionarNumero(int num){
        numerosList.add(num);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numAsc = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(numAsc);
            return numAsc;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numDesc = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            numDesc.sort(Collections.reverseOrder());
            return numDesc;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(20);
        numeros.adicionarNumero(7);
        
        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
    }
}
