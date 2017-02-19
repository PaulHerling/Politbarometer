package domain; /**
 * Created by Paul der Bademeister on 05.02.2017.
 */

import enumration.Geschlecht;

import java.util.Date;

public class Politiker {

    private int id;
    private String vorname;
    private String nachname;
    private int partei_id;
    private Date geb_datum;
    private Geschlecht geschlecht;

    public int getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getPartei_id() {
        return partei_id;
    }

    public Date getGeb_datum() {
        return geb_datum;
    }

    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setPartei_id(int partei_id) {
        this.partei_id = partei_id;
    }

    public void setGeb_datum(Date geb_datum) {
        this.geb_datum = geb_datum;
    }

    public void setGeschlecht(Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
    }
}
