package educ.lucas.curso01;

public class Usuario {
    public static void main(String[] args) {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("=========STATUS INICIAL===========");
        System.out.println("TV Ligada ? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarVolume();
       
        smartTv.mudarCanal(13);
        
        System.out.println("TV Ligada ? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status -> TV Ligada ? "+smartTv.ligada);
    }
}
