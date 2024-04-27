import java.util.ArrayList;
class Etage {
    public ArrayList<Parkplatz> parkplaetze;

    public Etage(int anzahlParkplaetze) {
        parkplaetze = new ArrayList<>();
        for (int i = 0; i < anzahlParkplaetze; i++) {
            parkplaetze.add(new Parkplatz());
        }
    }

    public int anzahlFreieParkplaetze() {
        int frei = 0;
        for (Parkplatz parkplatz : parkplaetze) {
            if (!parkplatz.istBelegt()) {
                frei++;
            }
        }
        return frei;
    }

    public Parkplatz naechsterFreierParkplatz() {
        for (Parkplatz parkplatz : parkplaetze) {
            if (!parkplatz.istBelegt()) {
                return parkplatz;
            }
        }
        return null;
    }
}