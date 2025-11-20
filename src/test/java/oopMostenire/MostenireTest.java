package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test

    public void metodaTest() {

        Angajat angajat = new Angajat("Chera", "Madalina", 30, "Timisoara", "PanByViolett", 5000, "Nedeterminat", 21);
        angajat.infoAngajat();

        System.out.println("angajat.getVarsta();");
        angajat.setVarsta(23);
        System.out.println("angajat.getVarsta();");
        angajat.mananca();
        angajat.afiseazaDetalii();
        angajat.afiseazaDetalii("Altex");
        angajat.afiseazaDetalii("Altex", true);

        angajat.ajungeLaTimpLaBirou();
        angajat.respectaRegulamentulIntern();
        angajat.munceste();

        Sportiv sportiv = new Sportiv("Popi", "Balanel", 25, "Columbia", "Fotbal", true, 10);
        sportiv.infoSportiv();
        sportiv.mananca();
        sportiv.cautaSportiv("fotbal", 3);

        sportiv.mergeLaAntrenamente();
        sportiv.respectaRegim();
        sportiv.mergeLaCompetitii();

        System.out.println();

        Student student = new Student("Cheza", "Bobita", 22, "Mangalia", "UPT", "Management", 2, false);
        student.infoStudent();
        student.mananca();

        student.mergiLaCursuri();
        student.saNuAibaRestante();
        student.trebuieSaStudieze();

        angajat.getSalariu();
        System.out.println("angajat.getSalariu()");
    }
}