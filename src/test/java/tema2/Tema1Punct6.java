package tema2;

import org.testng.annotations.Test;

import java.util.Arrays;

//Ana are mere,pere,prune

public class Tema1Punct6 {

    @Test
    public void afisamRezultate(){
        adaugaDupaVocala("Ana are mere");

    }

    public void adaugaDupaVocala(String propozitie) {
        String[] cuvinte= propozitie.split("\\s+");
        for (int index=0;index< cuvinte.length;index++) {
            cuvinte[index]=cuvinte[index].replaceAll("[\\w]","");
        }
        System.out.println(cuvinte[1]);
    }
}
