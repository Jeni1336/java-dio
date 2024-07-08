public class Usuario {
    public static void main (String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println( "canal atual: " + smartTV.canal);
        smartTV.mudarCanal(13);
        System.out.println( "canal atual: " + smartTV.canal);
        System.out.println( "volume atual: " + smartTV.volume);

        System.out.println( "tv ligada: " + smartTV.ligada);
     
        System.out.println( "volume atual: " + smartTV.volume);


        smartTV.ligar();
       System.out.println( "Novo status -> Tv ligada? " + smartTV.ligada);

       smartTV.desligar();
       System.out.println( "Novo status -> Tv desligada? " + smartTV.ligada);
       
    }
}
