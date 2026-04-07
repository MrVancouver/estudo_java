package study.raphas.dia3;

public class usuario {
    public static void main(String[] args) throws Exception{
        televisao smartTv = new televisao();
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada? "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada? "+ smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentar volume " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Diminuir Volume " + smartTv.volume);

        smartTv.mudarCanal(22);
        System.out.println("Canal ataul: "+ smartTv.canal);
    }
}
