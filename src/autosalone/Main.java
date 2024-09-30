package autosalone;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);


        AutosaloneOggetti b1 = new AutosaloneOggetti();
        AutosaloneOggetti b2 = new AutosaloneOggetti();
        AutosaloneOggetti b3 = new AutosaloneOggetti();
        AutosaloneOggetti b4 = new AutosaloneOggetti();

        System.out.println ("Marca1:"); b1.setMarca(in.nextLine());
        System.out.println ("Modello1:"); b1.setModello(in.nextLine());
        System.out.println ("prezzo1:"); b1.setPrezzo(in.nextDouble());
        in.nextLine();

        System.out.println ("Marca2:"); b2.setMarca(in.nextLine());
        System.out.println ("Modello2:"); b2.setModello(in.nextLine());
        System.out.println ("prezzo2:"); b2.setPrezzo(in.nextDouble());
        in.nextLine();

        System.out.println ("Marca3:"); b3.setMarca(in.nextLine());
        System.out.println ("Modello3:"); b3.setModello(in.nextLine());
        System.out.println ("prezzo3:"); b3.setPrezzo(in.nextDouble());
        in.nextLine();

        System.out.println ("Marca4:"); b4.setMarca(in.nextLine());
        System.out.println ("Modello4:"); b4.setModello(in.nextLine());
        System.out.println ("prezzo4:"); b4.setPrezzo(in.nextDouble());
        in.nextLine();

        System.out.println("Macchina 1: " + b1.getMarca() + "\t" + b1.getModello() + "\t" + b1.getPrezzo());
        System.out.println("Macchina 2: " + b2.getMarca() + "\t" + b2.getModello() + "\t" + b2.getPrezzo());
        System.out.println("Macchina 3: " + b3.getMarca() + "\t" + b3.getModello() + "\t" + b3.getPrezzo());
        System.out.println("Macchina 4: " + b4.getMarca() + "\t" + b4.getModello() + "\t" + b4.getPrezzo());
    }
}