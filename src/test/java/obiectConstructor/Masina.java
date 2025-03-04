package obiectConstructor;

public class Masina {

    public String marca;
    public String model;
    public String motorizare;
    public int an;
    public int pret;

    public Masina(String marca, String model, String motorizare, int an, int pret) {
        this.marca = marca;
        this.model = model;
        this.motorizare = motorizare;
        this.an = an;
        this.pret = pret;
    }

    public Masina(String marca, int an, String motorizare, String model) {
        this.marca = marca;
        this.an = an;
        this.motorizare = motorizare;
        this.model = model;
    }

    public void prezentareMasina() {
        System.out.println("Marca Masini este: " + marca);
        System.out.println("Modelul masini este: " + model);
        System.out.println("Anul de fabricatie al masini este: " + an);
        System.out.println("Motorizarea masini este: " + motorizare);
        if (pret != 0) {
            System.out.println("Pretul masini este: " + pret);
        }
    }
}