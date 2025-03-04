package oopAbstractizare;

public class ElevAngajat extends Persoana implements Elev,Angajat{

    private String scoala;
    private int clasa;
    private String firma;
    private String experienta;
    private int salariu;

    public ElevAngajat(String nume, String prenume, int varsta, String scoala,
                       int clasa, String firma, String experienta, int salariu) {
        super(nume, prenume, varsta);
        this.scoala = scoala;
        this.clasa = clasa;
        this.firma = firma;
        this.experienta = experienta;
        this.salariu = salariu;
    }



    public String getScoala() {
        return scoala;
    }

    public void setScoala(String scoala) {
        this.scoala = scoala;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
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

    @Override
    public void mergeLaScoala() {

    }

    @Override
    public void isiFaceTemele() {

    }

    @Override
    public void mergeInPauza() {

    }
}
