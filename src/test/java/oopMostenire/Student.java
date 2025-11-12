package oopMostenire;

import org.openqa.selenium.json.JsonOutput;

public class Student extends Persoana implements StudentInterface {

    private String facultate;
    private String domeniu;
    private int anul;
    private boolean restante;

    public Student(String nume, String prenume, int varsta, String adresa, String facultate, String domeniu, int anul, boolean restante) {
        super(nume, prenume, varsta, adresa);
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anul = anul;
        this.restante = restante;
    }
    public void infoStudent(){
        System.out.println("Facultatea la care studiaza este " + facultate );
        System.out.println("Domeniul in care activeaza este " + domeniu);
        System.out.println("In ce an este studentul? " + anul);
        System.out.println("Are restante studentul? " + restante);
    }
    public void mananca(){
        super.mananca();
        System.out.println("Studentul mananca intre cursuri");
    }

    public void cautaStudent(){
        System.out.println("Afisez toti studentii");
    }

    public void cautaStudent(String facultate, int anul){
        System.out.println("Afisez studentii de la facultate: " + facultate + anul);
    }
    public void cautaStudent(boolean restante){
        System.out.println("Afisez studentii cu restante " + restante);
    }

    @Override
    public void mergeLaCursuri(){
        System.out.println("Studentul trebuie sa mearga la cursuri");
    }

    @Override
    public void trebuieSaStudieze(){
        System.out.println("Studentul trebuie sa studieze");
    }

    @Override
    public void saNUAibaRestante(){
        System.out.println("Studentul trebuie sa nu aiba restante");
    }
}

