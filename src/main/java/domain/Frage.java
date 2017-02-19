package domain;

/**
 * Created by Paul der Bademeister on 05.02.2017.
 */

//import java.util.ArrayList;       //Kein Plan ob ich das brauche...

//import java.util.Date


public class Frage {
    private int id;
    private String text;
    private String kategorie;
//    private Date erstellungsdatum;


    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }


}
