package oopMostenire;

public class AngajatSportivStudent extends Persoana implements AngajatInterface, SportivInterface, StudentInterface{

    private String firma;
    private double salariu;
    private String contract;
    private int zileLibere;
    private String sport;
    private boolean sportEchipa;
    private int experienta;
    private String facultate;
    private String domeniu;
    private int anul;
    private boolean restante;

    public AngajatSportivStudent(String nume, String prenume, int varsta, String adresa, String firma, double salariu, String contract, int zileLibere, String sport, boolean sportEchipa, int experienta, String facultate, String domeniu, int anul, boolean restante) {
        super(nume, prenume, varsta, adresa);
        this.firma = firma;
        this.salariu = salariu;
        this.contract = contract;
        this.zileLibere = zileLibere;
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anul = anul;
        this.restante = restante;
    }

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void respectaRegulamentulIntern() {

    }

    @Override
    public void mergeLaAntrenamente() {

    }

    @Override
    public void mergeLaCompetitii() {

    }

    @Override
    public void respectaRegim() {

    }

    @Override
    public void mergiLaCursuri() {

    }

    @Override
    public void trebuieSaStudieze() {

    }

    @Override
    public void saNuAibaRestante() {

    }

//    Facem o clasa generala: Restaurant - declaram niste proprietati generale
//    Incepem sa facem variantele specifice: doua clase (una restaurant vegan, una non vegan), ambele mostenesc clasa restaurant
//    Facem o interfata - RestaurantVeganInterface - defineste regulile pentru un restaurant vegan (doua metode abstracte 1 -ServesteMancareVegana 2- MeniuVegan)
//    La fel si pentru RestarantulNonVegan ( doua metode abstracte 1 -ServesteMancareNonVegana 2 - MeniuNonVegan)
//    Deschidem un nou restaurant mixt ( O alta clasa RestaurantMixt ) care mosteneste clasa Restaurant si care implementeaza ambele interfete
//
}