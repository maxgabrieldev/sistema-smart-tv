public class Usuario {
    public static void main(String[] args) throws Exception {
        
            SmartTv smartTv = new SmartTv();

            System.out.println("TV Ligada?" + " " + smartTv.ligada);
            System.out.println("Canal Atual?" + " " + smartTv.canal);
            System.out.println("Volume atual?" + " " + smartTv.volume);

                // botão LIGAR/DESLIGAR
            smartTv.ligar();
            System.out.println("Novo status -> TV Ligada?" + " " + smartTv.ligada);

            smartTv.desligar();
            System.out.println("Novo status -> TV Ligada?" + " " + smartTv.ligada);
                // ==================================

                //botão de VOLUME
            smartTv.aumentarVolume();
            System.out.println("Aumentando o volume para: "+ smartTv.volume);
            smartTv.diminuirVolume();
            System.out.print("Diminuindo o volume para: "+ smartTv.volume);
                // ================================

            smartTv.mudarCanal(11);
            System.out.println("Canal Atual: " + " " + smartTv.canal);
    }
}
