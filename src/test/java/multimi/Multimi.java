package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {
    //multimi = array, list, set, map

    @Test
    public void metodaTest() {

        //numeCursantiArray();
        //numeCursantiLista();
        //exemplu1Map();
        //exemplu2Map();
        exemplu3Map();
    }

    //Afisam numele cursantilor de la curs
    public void numeCursantiArray() {
        String[] cursanti = new String[10];//definim o multime goala
        cursanti[0] = "Carmen";
        cursanti[1] = "Andrei";
        cursanti[2] = "Adriana";
        cursanti[3] = "Alex";
        cursanti[4] = "Cristi";

        int index = 0;
        while (index < cursanti.length) {
            if (index < 5) {
                System.out.println("Numele cursantului este: " + cursanti[index]);
            }

            index++;
        }
    }

    public void numeCursantiLista() {
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Carmen");
        cursanti.add("Andrei");
        cursanti.add("Adriana");
        cursanti.add("Alex");
        cursanti.add("Cristi");

        int index = 0;
        while (index < cursanti.size()) {
            System.out.println("Numele cursantului este: " + cursanti.get(index));
            index++;
        }
    }

    //Definim niste categorii de valori
    public void exemplu1Map() {
        Map<String, String> obiecte = new HashMap<>();
        obiecte.put("Telefon", "Iphone");
        obiecte.put("Masina", "Toyota");
        obiecte.put("Fruct", "Mar");

        for (String key : obiecte.keySet()) {
            System.out.println("Cheia curenta este: " + key);
            System.out.println("Valoarea pe baza cheii este: " + obiecte.get(key));
        }
    }

    //Afisam orasele cu tara din care provin
    public void exemplu2Map() {
        Map<String, List<String>> tariOrase = new HashMap<>();

        List<String> oraseRomania = Arrays.asList("Cluj", "Bistrita", "Bacau");
        List<String> oraseItalia = Arrays.asList("Roma", "Milano", "Rimini", "Bologna");
        List<String> oraseSpania = Arrays.asList("Valencia", "Madrid", "Barcelona");

        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Italia", oraseItalia);
        tariOrase.put("Spania", oraseSpania);

        for (String key : tariOrase.keySet()) {
            System.out.println("Tara curenta este: " + key);
            System.out.println("Orasele sunt: " + tariOrase.get(key));
        }
        //tema ne uitam pe filmare
        //metoda exemplu3Map in care facem o carte de retete pentru gatit (ex supa de pui , lista ingrediente si categorie supa, felul 2 ..
        //

    }

    public void exemplu3Map(){
        Map<String, List<String>> CarteDeRetete = new HashMap<>();

        List<String> ingredienteSupaPui = Arrays.asList("3l apa","2 morcovi taiati rondele","400gr pui taiat cubulete","o ceapa","taitei","un ardei");
        List<String> ingredienteClatite = Arrays.asList("Apa minerala","Faina","Lapte","Zahar","Esenta Vanilie");
        List<String> ingredienteMusaca = Arrays.asList("Cartofi taiati felii","Carne tocata inabusita cu boia,sare si piper","2 oua batute","Smantana de gatit");

        CarteDeRetete.put("Supa de Pui",ingredienteSupaPui);
        CarteDeRetete.put("Clatite",ingredienteClatite);
        CarteDeRetete.put("Musaca",ingredienteMusaca);

        System.out.println("Retetele din Cartea de Bucate a Bunicii!");
        System.out.println();

        for (String key : CarteDeRetete.keySet()) {
            System.out.println("Mancarea este: " + key);
            System.out.println("Ingredientele sunt: " + CarteDeRetete.get(key));
            System.out.println("-");
        }
        System.out.println("Acestea sunt retetele din cartea noastra de bucate.");
    }
}
