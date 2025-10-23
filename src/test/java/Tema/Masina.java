package Tema;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public int anFabricatie;
    public String culoare;
    public double capacitateMotor;
    public float consumMediu;
    public boolean esteElectrica;
    public char tipTransmisie;

    @Test
    public void metodaTest() {

        marca = "BMW";
        model = "320i";
        anFabricatie = 2021;
        culoare = "negru";
        capacitateMotor = 2.0;
        consumMediu = 6.4f;
        esteElectrica = false;
        tipTransmisie = 'A';

        System.out.println("Marca masinii este "+ marca);
        System.out.println("Modelul masinii este "+ model);
        System.out.println("Anul fabricatiei este "+ anFabricatie);
        System.out.println("Culoarea masinii este "+ culoare);
        System.out.println("Capacitatea motorului este "+ capacitateMotor);
        System.out.println("Consumul mediu este "+ consumMediu);
        System.out.println("Masina este electrica "+ esteElectrica);
        System.out.println("Tipul transmisiei este "+ tipTransmisie);
        System.out.println();

        prezentareMasina(marca, model, anFabricatie,culoare, capacitateMotor, consumMediu, esteElectrica,tipTransmisie);

        prezentareMasina("Tesla","3",2023,"alb", 0.0,0.0f,true,'A');
        prezentareMasina("Mazda","MX-5",2021,"rosu", 2.0,6.9f,false,'M');
        prezentareMasina("Volvo","V60",2020,"gri", 2.0, 6.5f,false,'A');

    }

    public void prezentareMasina (String marca, String model, int anFabricatie, String culoare, double capacitateMotor, float consumMediu, boolean esteElectrica, char tipTransmisie){

        System.out.println("Marca masinii este "+ marca);
        System.out.println("Modelul masinii este "+ model);
        System.out.println("Anul fabricatiei este "+ anFabricatie);
        System.out.println("Culoarea masinii este "+ culoare);
        System.out.println("Capacitatea motorului este "+ capacitateMotor);
        System.out.println("Consumul mediu este "+ consumMediu);
        System.out.println("Masina este electrica "+ esteElectrica);
        System.out.println("Tipul transmisiei este "+ tipTransmisie);
        System.out.println();

    }

}
