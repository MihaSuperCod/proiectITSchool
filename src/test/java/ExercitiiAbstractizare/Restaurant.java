package ExercitiiAbstractizare;

public class Restaurant {
    private String nume;
    private String adresa;
    private String tip;
    private double rating;
    private boolean deschis;

    public Restaurant(String nume, String adresa, String tip, double rating, boolean deschis) {
        this.nume = nume;
        this.adresa = adresa;
        this.tip = tip;
        this.rating = rating;
        this.deschis = deschis;
    }

    public Restaurant() {

    }

    public void infoRestaurant(){
        System.out.println("Numele restaurantului este " + nume);
        System.out.println("Adresa restaurantului este " + adresa);
        System.out.println("Tipul restaurantului este " + tip);
        System.out.println("Ratingul restaurantului este " + rating);
        System.out.println("Este restaurantul deschis? " + deschis);

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isDeschis() {
        return deschis;
    }

    public void setDeschis(boolean deschis) {
        this.deschis = deschis;

    }

}
