package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {
    @Test
    public void metodaTest(){
        Angajat angajat = new Angajat("Popescu", "Andrei", 30, "Luptei 40", "Emerson", 2500, "Nedeterminat", 10);
        angajat.infoAngajat();
        System.out.println(angajat.getVarsta());
        angajat.setVarsta(26);
        System.out.println(angajat.getAdresa());
        angajat.getSalariu();
        System.out.println(angajat.getSalariu());
        angajat.mananca();
        System.out.println();
        angajat.afiseazaDetalii();
        angajat.afiseazaDetalii("Altex");
        angajat.afiseazaDetalii("Altex", true);

        Sportiv sportiv = new Sportiv("Dumitru", "Sebastian" ,34,"Viitorului 10", "Fotbal",true, 6);
        sportiv.infoSportiv();
        sportiv.mananca();
        sportiv.cautaSportiv("fotbal", 5);
        System.out.println();
        Student student = new Student("Robert", "Petrovici",35,"Electronicii 2","Ion Mincu Timisoara","IT",2025,false);
        student.infoStudent();
        student.mananca();

    }
}
