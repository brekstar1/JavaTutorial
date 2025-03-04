package oopAbstractizare;

public class AngajatPersoana extends Persoana implements Angajat{

    private String firma;
    private String experienta;
    private int salariu;

    public AngajatPersoana(String nume, String prenume, int varsta,
                           String firma, String experienta, int salariu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.salariu = salariu;
    }

    public void infoAngajat() {
        infoPersoana();
        System.out.println("Frima la care lucraza angajatul este: " + firma);
        System.out.println("Experienta pe care o are anhajatule este: " + experienta);
        System.out.println("Salariul angajatului este: " + salariu);
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public void mergeLaLucru() {

    }

    @Override
    public void primestiSalariu() {

    }

    @Override
    public void pauzaDeMasa() {

    }

    @Override
    public void mergeInConcediu() {

    }
}
