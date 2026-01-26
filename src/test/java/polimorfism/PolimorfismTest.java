package polimorfism;

import org.testng.annotations.Test;

public class PolimorfismTest {

    @Test
    public void testMethod(){
        Masina masina = new Masina("Audi", "A3", 2005);
        masina.pornesteAutomobil();
        masina.aplicareReducere();
        masina.aplicareReducere(30);
        masina.aplicareReducere("cupon de pensie");


        Trotineta trotineta = new Trotineta("asda", "asdad", 123);
        trotineta.pornesteAutomobil();
    }
}
