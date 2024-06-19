public class MinhaClasse{

    public static void main (String [] args){
       //System.out.println("ola!! me chamo jeni e sou dev fullstack");
       String primeiroNome = "Jeni";
       String segundoNome = "Lima";

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
       System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

