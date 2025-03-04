package tema2;

import org.openqa.selenium.io.Zip;
import org.testng.annotations.Test;

//Tema 1
//
//Afiseaza pe ecran urmatoarele:
//PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI
//
//1. Hello World
//2. Varsta ta (numar)
//3. Numele si prenumele pe 2 randuri
//4. Adauga la "Salut" caracterul "M" la final
//5. Adauga la "Hello" caracterul "H" la inceput
//6. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"
//7. Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"
//8. Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;
//9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
//10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;
//
//
//! BONUS !
//Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3 ?
//  Rezultatul corect este: {rezultatul}

import java.util.Objects;

public class Tema1 {

    @Test
    public void afisam() {
        helloWorld("Hello world");
        varsta(26);
        numePrenume("Savu", "Andrei");
        adaugaFinal("Salut", 'M');
        adaugaInceput("Hello", 'H');


        afiseazaAndrei("Andrei");
        afiseazaAndrei("Matei");
        afiseazaAndrei(null);
        afisamIdDepartament("Popescu");
        afisamIdDepartament("Savu");
        afisamIdDepartament(null);
        numarDepartament(290);
        numarDepartament(100);

        rezultatEcuatie(2,3,4);

    }

    public void helloWorld(String mesaj) {
        System.out.println(mesaj);
    }

    public void varsta(int valoareVarsta) {
        System.out.println("Varsta mea este: " + valoareVarsta);
    }

    public void numePrenume(String nume, String prenume) {
        System.out.println("Numele meu este: " + nume);
        System.out.println("Prenumele meu este: " + prenume);
    }

    public void adaugaFinal(String cuvantFinal, char caracterFinal) {
        System.out.println(cuvantFinal + caracterFinal);
    }

    public void adaugaInceput(String cuvantInceput, char caracterInceput) {
        System.out.println(caracterInceput + cuvantInceput);
    }

    //6. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"

    public void adaugaDupaVocala(String propozitie) {
    }

    public void adaugaPropozitia(String propozitiaAdaugata) {

    }

    public void afiseazaAndrei(String prenumeAfiseazaAndrei) {
        if (Objects.equals(prenumeAfiseazaAndrei, "Andrei")) {
            System.out.println("Salariul angajatului este: " + 2500);
        } else if (prenumeAfiseazaAndrei==null) {
            System.out.println("Va rugam furnizati un prenume.");
        }else System.out.println("Prenume furnizat incorect.");
    }

    public void afisamIdDepartament(String prenumeIdDepartament) {
        if (Objects.equals(prenumeIdDepartament, "Popescu")) {
            int id = 12;
            String departament = "Testare";
            System.out.println("ID-ul angajatului este " + id + " si departamentul din care face parte este " + departament);
        } else if (prenumeIdDepartament==null) {
            System.out.println("Va rugam furnizati un prenume.");
        }else System.out.println("Prenumele furnizat nu este corect.");
    }

    public void numarDepartament(int nrDepartament){
        if (nrDepartament>287){
            System.out.println("Nr. Departament: "+nrDepartament);
        } else System.out.println("Numarul departamentului este prea mic.");
    }

    public void rezultatEcuatie(double a,double b, double c){
        double rezultat=((a + (b * c) - b) /b);
        System.out.println("Rezultatul corect este: "+rezultat);
    }


}
