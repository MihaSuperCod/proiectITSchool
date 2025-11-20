package ExercitiiAbstractizare;

public class RestaurantNonVegan extends Restaurant implements RestaurantNonVeganInterface {

    private String specificMancare;
    private String feluriMancare;
    private String meniu;

    // Constructor complet
    public RestaurantNonVegan(String nume, String adresa, double rating, boolean deschis, String specificMancare, String feluriMancare, String meniu) {
        super(nume, adresa, "Non-Vegan", rating, deschis);
        this.specificMancare = specificMancare;
        this.feluriMancare = feluriMancare;
        this.meniu = meniu;
    }

    // (optional) constructor simplificat
    public RestaurantNonVegan(String nume, String adresa, double rating, boolean deschis) {
        super(nume, adresa, "Non-Vegan", rating, deschis);
    }

    public String getSpecificMancare() {
        return specificMancare;
    }

    public void setSpecificMancare(String specificMancare) {
        this.specificMancare = specificMancare;
    }

    public String getFeluriMancare() {
        return feluriMancare;
    }

    public void setFeluriMancare(String feluriMancare) {
        this.feluriMancare = feluriMancare;
    }

    public String getMeniu() {
        return meniu;
    }

    public void setMeniu(String meniu) {
        this.meniu = meniu;
    }

    @Override
    public void servesteMancareNonVegana() {
        System.out.println("Servim preparate non-vegane: " + specificMancare);
    }

    @Override
    public void meniuNonVegan() {
        System.out.println("Meniu Non-Vegan: " + meniu);
    }
}
