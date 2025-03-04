package obiectConstructor;

public class Telefon {

    public String marca;
    public String model;
    public int an;
    public String operatingSystem;
    public String capacitateBaterie;
    public int pret;

    public Telefon(String marca, String model, int an, String operatingSystem, String capacitateBaterie, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.operatingSystem = operatingSystem;
        this.capacitateBaterie = capacitateBaterie;
        this.pret = pret;
    }

    public Telefon(String marca, String model, int an, String operatingSystem, String capacitateBaterie) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.operatingSystem = operatingSystem;
        this.capacitateBaterie = capacitateBaterie;
    }

    public void prezentareTelefon() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelul: " + model);
        System.out.println("Anul de fabricatie: " + an);
        System.out.println("Sistemul de operare: " + operatingSystem);
        System.out.println("Capacitate baterie: " + capacitateBaterie);
        if (pret != 0) {
            System.out.println("Pretul masini este: " + pret);
        }
    }
}
