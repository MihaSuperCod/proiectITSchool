package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test

    public void metodaTest(){
        Angajat angajat = new Angajat("Popescu", "Andrei", 30, "Luptei 40","Emerson", 2500, "nedeterminat", 10 );
        angajat.infoAngajat();
        System.out.println();
        Sportiv sportiv = new Sportiv("Dumitru", "Sebastian", 34, "Viitorului 10", "fotbal", true, 6);
        sportiv.infoSportiv();
    }
}

