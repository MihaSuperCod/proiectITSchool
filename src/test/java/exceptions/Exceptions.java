package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {

    //exceptie = eroare care apare in momentul in care programul ruleaza
    //execptiile trebuie tratate deoarece contin informatii din interior care pot sa fie exploatate
    //ca sa tratam o exceptie se foloseste stuctura try...catch..finally

    //exista doua tipuri de exceptii: unchecked si checked
    //Checked => exceptii care apar in momentul cand vrem sa folosim o anumita clasa
    //Unchecked => exceptii care ne iau prin surprindere

    //2 keyword specifice: throw si throws
    //throw => cuvant pe care il folosi  cand vrem sa facem trgger la o exceptie
    //throws => cuvant pe care il folosim ca sa adaugam exceptia la semantura metodei (Nu se aplica niciodata!!!)

    @Test
    public void testMethod() throws FileNotFoundException {
//        checkedExample();
//        uncheckedExample();
//        throwExample();
          throwsExample();
    }

    //checked
    public void checkedExample(){
        String path = "src/CustomerData.json";
        File file = new File(path);

        try {
            FileInputStream fileContent = new FileInputStream(file);
        } catch (FileNotFoundException e) {

        }
    }

    //unchecked
    public void uncheckedExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement miha = driver.findElement(By.xpath("Miha Moga"));
        miha.click();
    }

    //throw
    public void throwExample(){
        String path = "src/CustomerData.json";
        File file = new File(path);

        try {
            FileInputStream fileContent = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Nu accept aceasta problema");
        }
    }

    //throws
    public void throwsExample() throws FileNotFoundException {
        String path = "src/CustomerData.json";
        File file = new File(path);
        FileInputStream fileContent = new FileInputStream(file);
    }
}
