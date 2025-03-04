package oopAbstractizare;

public class Persoana {

    //Abstractizare = Conceptul prin care putem definii comportamentul unei clase
    //Abstractizarea se poate face in doua feluri: Folosind INTERFETE sau CLASE ABSTRACTE
    //O INTERFATA contine doar metode abstracte (metode care nu au body)
    //Recunoastem o interfata pe baza cuvantului INTERFACE
    //Toate metodele din Interfata sunt publice
    //O Interfata nu poate sa contina un constructor => nu putem face un obiect
    //O Intrefata se IMPLEMENTEAZA
    //O Clasa poate sa implementeze o interfata => Trebuie sa implementeze toate metodele din interfata
    //O Clasa poate implementa mai multe interfete
    //O Interfata poate extinde o alta interfata
    //O Clasa Abstracta poate implementa o Interfata insa Interfata nu poate extinde o Clasa Abstracta

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele peroanei este: "+nume);
        System.out.println("Prenumele persoanei este: "+prenume);
        System.out.println("Varsta persoanei este: "+varsta);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
