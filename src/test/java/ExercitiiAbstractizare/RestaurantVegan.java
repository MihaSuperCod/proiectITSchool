package ExercitiiAbstractizare;

public class RestaurantVegan extends Restaurant implements RestaurantVeganInterface {

    private String specificMancare;
    private String feluriMancare;
    private String meniu;

    public RestaurantVegan(String nume, String adresa, double rating, boolean deschis,
                           String specificMancare, String feluriMancare, String meniu) {
        super(nume, adresa, "Vegan", rating, deschis);
        this.specificMancare = specificMancare;
        this.feluriMancare = feluriMancare;
        this.meniu = meniu;
    }

    @Override
    public void servesteMancareVegana() {
        System.out.println("Servim preparate vegane: " + specificMancare + " | Feluri: " + feluriMancare);
    }

    @Override
    public void meniuVegan() {
        System.out.println("Meniu Vegan: " + meniu);
    }
}
