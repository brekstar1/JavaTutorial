package oop;

public class Masina {
    //OOP concepte: Mostenire, Incapsulare, Polimorfism, Abstractizare
    //Mostenire = Conceptul prin care o Clasa mosteneste o alta Clasa
    //Clasa care mosteneste se numeste Clasa Copil
    //Clasa care se mosteneste se numeste Clasa Parinte
    //In Java o Clasa poate mostenii doar o singura Clasa
    //In momentul cand Copilul mosteneste Parintele trebuie sa apeleze constructorul din Parinte cu super()
    //In momentul can Copilul mosteneste Parintele, Copilul are acces la variabile/metode din Parinte (daca sunt publice/protected)
    //Incapsularea este Conceptul prin care restrictionam unele variabile/metode in momentul cand ies din zona din care au fost declarate
    //Restrictionarea se poate face folosind access control de tipul: PRIVATE sau PROTECTED
    //Polimorfism = conceptul prin care o metoda poate suferii modificari la nivel de continut sau definitie
    //Polimorfismul este de 2 feluri= DINAMIC(OVERRIGHT) si STATIC(OVERLOAD)
    //Polimorfismul Dinamic = Intr-o ierarhie de Clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Polimorfismul Static = Conceptul pe baza careia o metoda poate fii definita in functie de numarul/tipul de parametrii
    //Polimorfismul Dinamic se aplica in momentul in care avem o legatura parinta-copil
    //Polimorfismul Static se aplica in orice circumstanta

    private String marca;
    private String model;
    private String culoare;
    private int an;
    private double pret;

    public Masina(String marca, String model, String culoare, int an, double pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
        this.pret = pret;
    }

    public Masina(String marca, String model, String culoare, int an) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
    }

    public void infoMasina() {
        System.out.println("Marca Masini este: " + marca);
        System.out.println("Modelul masini este: " + model);
        System.out.println("Culoarea masini este: " + culoare);
        System.out.println("Anul de fabricatie al masini este: " + an);
        if (pret != 0) {
            System.out.println("Pretul masini este: " + pret);
        }
    }

    //Polimorfism Dinamic

    public void pornesteMasina(){
        System.out.println("Masina porneste cu cheie.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public double getPret() {
        return pret;
    }
}