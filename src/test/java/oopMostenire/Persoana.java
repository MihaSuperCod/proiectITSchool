package oopMostenire;

public class Persoana {

    //OOP=progaramare orientata pe obiecte
    //Cele patru principii de baza sunt:mostenire, abstractizare, incapsulare si polimorfism
    //Mostenirea reprezinta conceptul prin care o clasa copil mosteneste o clasa parinte
    //Prin mostenire clasa copil preia toate atributele si metodele clasei parinte
    //In momentul in care o clasa copil mosteneste o clasa parinte, constructorul clasei copil trebuie sa apeleze constructorul din clasa parinte
    //Acest lucru se realizeaza folosind keyword-ul "super"
    //Mostenirea se declara la nivel de clasa folosind keyword-ul "extends"
    //In Java o clasa poate mosteni doar o singura alta clasa (mostenire unica)

    //Polimosrfismul este conceptul prin care o metoda poate avea implementari dierite;
    //Polimorfism este de doua feluri - Static (overload)
    //                                 -Dinamic (override)

    //Dinamic- Intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite;
    //Polimorfismul dinamic se regaseste doar atunci unde exista mostenire;



    private String nume;
    private String prenume;
    private int varsta;
    private String adresa;

    public Persoana(String nume, String prenume, int varsta, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este " + nume);
        System.out.println("Prenumele persoanei este " + prenume);
        System.out.println("Varsta persoanei este " + varsta);
        System.out.println("Adresa persoanei este " + adresa);
    }

    //Polimorfismul dinamic

    public void mananca(){
        System.out.println("Persoana mananca atunci cand ii este foame");
    }



    //Getter- ne da valoarea proprietatii;
    //Setter- modfica valoarea proprietatii;
    //Recomandarea ar fi intotdeauna sa pornim cu rivate pentru a proteja datele, apoi expunem doar ce e nevoie si cat e nevoie;
    //Getters facem tot timpul pentru a putea sa citim valorile;
    //Setters- trebuie sa ne gandim daca face sens sa fie modificate;


    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
