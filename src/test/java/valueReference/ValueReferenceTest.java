package valueReference;

import org.testng.annotations.Test;

public class ValueReferenceTest {

    // Variabilele pot sa fie primitive si non primitive
    // Primitiva inseamna un tip de data predefinit care poate doar sa primeasca o valoare specifica
    // Exemple primitive: int, double, float, char, boolean, byte
    // Exemple de non primitive: String, orice instantiere care se face cu "new"
    // Wrapper class este o noua implementare care este construita pe implementarea veche
    // Exemple wrapper class: Integer, Double, Float, Character, Boolean

    public Integer varsta = 10;
    public String nume = "Andrei";
    public StringBuilder prenume = new StringBuilder("Alex");

    @Test
    public void testMethod(){

        System.out.println("Valoarea initiala este: "+varsta);
        calcul(varsta);
        System.out.println("Valoarea initiala este: "+varsta);

        System.out.println();
        System.out.println("Valoarea initiala este: "+nume);
        concatenare(nume);
        System.out.println("Valoarea initiala este: "+nume);

        System.out.println();
        System.out.println("Valoarea initiala este: "+prenume);
        concatenare(prenume);
        System.out.println("Valoarea initiala este: "+prenume);

        double a = 12.34;
        System.out.println(Integer.valueOf((int)a));

    }

    public void calcul(Integer value){
        value = value + 5;
        System.out.println("Valoarea noua este: "+value);
    }

    public void concatenare(String value){
        value = value + " Savu";
        System.out.println("Valoarea noua este: "+value);
    }

    public void concatenare(StringBuilder value){
        value.append(" Dorha");
        System.out.println("Valoarea noua este: "+value);
    }
}
