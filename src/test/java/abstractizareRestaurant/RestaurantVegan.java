package abstractizareRestaurant;

public class RestaurantVegan extends Restaurant implements Vegan{

    public RestaurantVegan(String nume, String adresa, String program) {
        super(nume, adresa, program);
    }

    @Override
    public void ingredienteVegane() {
        System.out.println("Toate ingredientele sunt Vegane.");
    }

    @Override
    public void chelnerVegan() {
        System.out.println("Toti chelnerii au experienta pentru restaurantele Vegane.");
    }

    @Override
    public void bucatarVegan() {
        System.out.println("Toti bucatarii au experienta pentru restaurantele Vegane.");
    }
}
