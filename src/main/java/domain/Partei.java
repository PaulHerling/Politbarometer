package domain;

/**
 * Created by Paul der Bademeister on 05.02.2017.
 */
public class Partei {

    private int id;
    private String Abkürzung;
    private String Name;
//    private Gesinnung gesinnung;


    public int getId() {
        return id;
    }

    public String getAbkürzung() {
        return Abkürzung;
    }

    public String getName() {
        return Name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAbkürzung(String abkürzung) {
        Abkürzung = abkürzung;
    }

    public void setName(String name) {
        Name = name;
    }
}
