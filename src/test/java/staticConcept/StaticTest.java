package staticConcept;

import org.testng.annotations.Test;

public class StaticTest {
    //avem cerinta sa prezentam toti elevii de la scoala Liviu Rebreanu

    @Test
    public void testMethod(){
        Elev Marius = new Elev ("Popescu", "Marius", 18);
        Elev Iulia = new Elev ("Ionescu", "Iulia", 18);
        Elev Maria = new Elev ("Igescu", "Maria", 18);
        Elev Andra = new Elev ("Chirila", "Andra", 18);
        Elev Vlad = new Elev ("Mirescu", "Vlad", 18);

        Marius.prezentareElev();
        System.out.println();

        Iulia.prezentareElev();
        System.out.println();

        Maria.prezentareElev();
        System.out.println();

        Andra.prezentareElev();
        System.out.println();

        Vlad.prezentareElev();
        System.out.println();

        Vlad.calculEcuson();
        Elev.infoElev();
    }
}
