package oopMostenire;

public class Sportiv extends Persoana {

    private String sport;
    private boolean sportEchipa;
    private int experienta;

    public Sportiv(String nume, String prenume, int varsta, String adresa, String sport, boolean sportEchipa, int experienta) {
        super(nume, prenume, varsta, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
    }

   public void infoSportiv(){
        infoPersoana();
       System.out.println("Sportul este " + sport);
       System.out.println("Sportivul face parte dintr-o echipa? " + sportEchipa);
       System.out.println("Experienta sportivului este de " + experienta);
   }
   public void mananca(){
       System.out.println("Sportivul mananca intre antrenamente");
   }

   public void cautaSportiv(){
       System.out.println("Afisez toti sportivii inregistrati");
   }

   public void cautaSportiv(String sport){
       System.out.println("Afisez sportivii care joaca sportul " + sport);
   }

   public void cautaSportiv(String sport, int experienta){
       System.out.println("Afisez sportivii cu " + experienta + "ani" + " care practica sportul" + sport);
   }


    public String getSport() {
        return sport;
    }

    public boolean isSportEchipa() {
        return sportEchipa;
    }

    public int getExperienta() {
        return experienta;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setSportEchipa(boolean sportEchipa) {
        this.sportEchipa = sportEchipa;
    }

    public void setExperienta(int experienta) {
        this.experienta = experienta;
    }

    @Override
    public void mergeLaAntrenamente(){
        System.out.println("Sportivul trebuie sa mearga la antrenamente");
    }

    @Override
    public void participaLaCompetitii(){
        System.out.println("Sportivul participa la competitii");
    }

    @Override
    public void respectaRegim(){
        System.out.println("Sportivul trebuie sa respecte regimul");
    }
}
