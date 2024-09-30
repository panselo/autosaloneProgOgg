package autosalone;

public class Main {
    public static void main(String[] args) {

        String marca = "bmw";
        String modello = "m4";
        double prezzo = 0.0;

        AutosaloneOggetti b1 = new AutosaloneOggetti (marca,modello,prezzo);

        System.out.println ("Marca:" + b1.getMarca());
        System.out.println ("Modello:" + b1.getModello());
        System.out.println ("prezzo:" + b1.getPrezzo());

    }
}