package autosalone;

public class AutosaloneOggetti {

    private String marca;
    private String modello;
    private double prezzo;




    public String getMarca(){
        return marca;
    }
    public void setMarca(String marc){
        marca = marc;
    }



    public String getModello(){
        return modello;
    }
    public void setModello(String model){
        modello = model;
    }



    public double getPrezzo(){
        return prezzo;
    }
    public void setPrezzo(double prez){
        prezzo = prez;
    }



    public AutosaloneOggetti(String marcaA, String modelloA, double prezzoA) {
        marca = marcaA;
        modello = modelloA;
        prezzo = prezzoA;
    }
    public AutosaloneOggetti (){
        marca = null;
        modello = null;
        prezzo = 0.0;
    }
}
