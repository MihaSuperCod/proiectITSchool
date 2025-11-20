package ExercitiiAbstractizare;

public class RestaurantMixt extends Restaurant implements RestaurantMixtInterface {

    private String specificMancare;
    private String feluriMancare;
    private String meniu;

    public RestaurantMixt(String nume, String adresa, double rating, boolean deschis,
                          String specificMancare, String feluriMancare, String meniu) {
        super(nume, adresa, "Mixt", rating, deschis);
        this.specificMancare = specificMancare;
        this.feluriMancare = feluriMancare;
        this.meniu = meniu;
    }

    @Override
    public void servesteMancareVegana() {
        System.out.println("Servim mâncare VEGANĂ în restaurantul mixt.");
        System.out.println("Feluri vegane disponibile: " + feluriMancare);
    }

    @Override
    public void meniuVegan() {
        System.out.println("Meniu Vegan (Mixt): " + meniu);
    }

    @Override
    public void servesteMancareNonVegana() {
        System.out.println("Servim mâncare NON-VEGANĂ în restaurantul mixt.");
        System.out.println("Feluri non-vegane disponibile: " + feluriMancare);
    }

    @Override
    public void meniuNonVegan() {
        System.out.println("Meniu Non-Vegan (Mixt): " + meniu);
    }
}