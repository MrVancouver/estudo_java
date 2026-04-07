package study.raphas.repeticao;

public class Para_For {
    public static void main(String[] args) {
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println("Contando Carneirinhos " + carneirinhos);
        }
        String alunos [] = {"carlos","felipe","julia","jeremias"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("Aluno do indice "+ x +" é "+alunos[x]);
        }
        for(String aluno:alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        for(int numero=1; numero<=5;numero ++){
            if(numero == 3){
                continue;
            }
            System.out.println(numero);
        }
    }
}
