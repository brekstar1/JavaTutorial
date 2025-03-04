package tema;

import org.testng.annotations.Test;

public class Telefon {

    public String marca;
    public String model;
    public int anLansare;
    public String procesor;
    public String ram;
    public double diagonala;
    public String sistemOperare;
    public boolean areBluetooth;
    public char nrcamere;
    public String portIncarcare;
    public int capacitateBaterie;

    @Test
    public void prezentareTelefon() {

        marca = "Apple";
        model = "Iphone 16";
        anLansare = 2024;
        procesor = "Apple A18";
        ram = "8GB";
        diagonala = 6.1;
        sistemOperare = "iOS 18";
        areBluetooth = true;
        nrcamere = '3';
        portIncarcare = "USB Type-C 2.0";
        capacitateBaterie = 3561;

        System.out.println("Telefonul selectat este: " + marca + ' ' + model);
        System.out.println(model + " este un telefon marca " + marca + " lansat in anul " + anLansare + '.');
        System.out.println("Specificatii principale:");
        System.out.println("Procesor: " + procesor);
        System.out.println("Capacitate memorie: " + ram);
        System.out.println("Numar de camere: " + nrcamere);
        System.out.println("Diagonala: " + diagonala + " inch");
        System.out.println("Sistemul de operare: " + sistemOperare);
        System.out.println("Capacitatea Bluetooth: " + areBluetooth);
        System.out.println("Capaciatea Bateriei: " + capacitateBaterie + " mAh");
        System.out.println("Port de incarcare: " + portIncarcare);


    }


}