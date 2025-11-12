package oopMostenire;

public interface AngajatInterface {
    //Abstractiarea- conceptul prin care putem defini comportamentul unei clase;
    //Se poate face prin doua feluri: interfete si clase abstracte
    //Interfetele contin doar metode abstracte (Metodele nu au "body")
    //Toate metodele abstracte sunt publice
    //Intr-o interfata putem defini metode cu void sau return;
    //Intr-o interfata nu putem avea constructor- nu putem face un obiect
    //Interfata imprelementeaza o interfata se implemeneateaza iar o clasa se mosteneste;
    //Clasa care implementeaza o interfata trebuie sa implementeze toate metodele din ea;
    //O clasa poate implemeneta mai multe interfeteO interfata poate mosteni o alta interfata;

    void ajungeLaTimpLaBirou();
    void munceste();
    void respectaRegulamentulIntern();



}
