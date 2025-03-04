package variabilaMetoda;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Student {
    //clasa= sablon pe baza caruia putem definii un exemplu din viata reala
    //intr-un fisiere Java recunoastem o clasa dupa cuvantul class
    //este obligatoriu pentru o clasa sa aiba un nume
    //intr-un fisier Java putem avea mai multe clase diferntiate prin numele acestora
    //nu este un best pactive in Java sa avem mai multe clase intr-un fisier
    //o clasa cotine variabile si metode
    //variabila=proprietatea unei clase
    //o variabila poate sau nu sa aibe o valoare
    //o variabila isi poate modifica valoarea
    //valoarea unei variabile se stabileste in functie de tipul de data dorita
    //exista 2 tipuri de variabile: globala si locala
    //o variabila globala se difineste specificand nivelul de vizibilitate(acces control)
    //o variabila globala este vizibila peste tot in aceasta clasa
    //o variabila locala se dfineste specificand tipul de data si un nume
    //o variabila locala este vizibila doar in locul in care am definit-o
    //metoda= actiunea specifica unei clase
    //intr-o clasa putem avea mai multe metode
    //exista 2 tipuri de metode: void si return
    //recunoastem o metoda dupa acces control, tipul metodei, nume, (), {}
    //CTRL+ALT+L aranjeaza codul

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char gen;
    public boolean areRestante;

    @Test
    public void prezentareStudent() {
        nume = "Savu";
        prenume = "Andrei";
        varsta = 26;
        adresa = "Bucuresti, Str. Ionescu, nr. 22";
        inaltime = 1.78;
        greutate = 90.2f;
        gen = 'M';
        areRestante = false;

        System.out.println("Prezentarea studentului este:" + nume + ' ' + prenume + ',' + varsta);
        System.out.println("Adresa studentului este:" + adresa);
        System.out.println("Inaltimea Studentului este:" + inaltime);
        System.out.println("Greutatea studentului este:" + greutate);
        System.out.println("Genul studentului este:" + gen);
        System.out.println("Studentul are restante?" + areRestante);

        calculmedie(6, 7);
        calculmedie(9, 10);
        calculMedie3(7, 10, 5);
    }


    //Facem o metoda cu variabile locale
    public void calculmedie(double nota1, double nota2) {
        double sum = (nota1 + nota2) / 2;

        System.out.println("Media studentului este " + sum);

    }

    public void calculMedie3(double nota1, double nota2, double nota3) {
        double sum = (nota1 + nota2 + nota3) / 3;

        System.out.println("Media este " + sum);
    }


}
