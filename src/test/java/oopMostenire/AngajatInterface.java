package oopMostenire;

public interface AngajatInterface {

//    Abstractizarea este conceptul prin care putem defini comportamentul unei clasa
//    Abstractizarea se poate face prin doua feluri Interfete si Clasa Abstracte
//    Interfetele contin doar metode abstracte (Metodele nu au body)
//    Toate metodele abstracte sunt publice
//    ntr-o interfata putem defini metode cu void sau return
//    Intr-o interfata nu putem avea Constructor - nu putem face un obiect
//    Interfata se implementeaza / O clasa se mosteneste
//    Clasa care implementeaza o interfata trebuie sa implementeze toate metodele din ea
//    O clasa poate implementa mai multe interfete
//    O interfata poate mosteni o alta interfata

    void ajungeLaTimpLaBirou();
    void munceste();
    void respectaRegulamentulIntern();
}


