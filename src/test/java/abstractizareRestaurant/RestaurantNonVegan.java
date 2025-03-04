package abstractizareRestaurant;

public class RestaurantNonVegan extends Restaurant implements NonVegan{

    public RestaurantNonVegan(String nume, String adresa, String program) {
        super(nume, adresa, program);
    }

    @Override
    public void ingredienteNonVegane() {
        System.out.println("Toate ingredientele sunt Non-Vegane.");
    }

    @Override
    public void tipCarne() {
        System.out.println("Avem o gama variata de tipuri de carne.");
    }

    @Override
    public void tipPeste() {
        System.out.println("Avem o gama variata de tipuri de peste.");
    }
}
