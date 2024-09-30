package autosalone;

public class AutosaloneOggetti {

    private String marca;
    private String modello;
    private double prezzo;



    public String getMarca(){
        return marca;
    }

    public String getModello(){
        return modello;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public AutosaloneOggetti(String marcaA, String modelloA, double prezzoA) {
        marca = marcaA;
        modello = modelloA;
        prezzo = prezzoA;
    }
}
