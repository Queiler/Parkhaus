import java.util.ArrayList;
class Parkhaus {
    private ArrayList<Etage> etagen;

    public Parkhaus() {
        etagen = new ArrayList<>();
    }

    public void etageHinzufuegen(int anzahlParkplaetze) {
        etagen.add(new Etage(anzahlParkplaetze));
    }

    public void etageEntfernen(int index) {
        if (index >= 0 && index < etagen.size()) {
            etagen.remove(index);
        }
    }

    public void autoEinfahren(Fahrzeug fahrzeug) {
        for (Etage etage : etagen) {
            if (etage.anzahlFreieParkplaetze() > 0) {
                Parkplatz parkplatz = etage.naechsterFreierParkplatz();
                parkplatz.parken(fahrzeug);
                System.out.println("Das Fahrzeug mit Nummernschild " + fahrzeug.getNummernschild() + " wurde auf Etage " + (etagen.indexOf(etage) + 1) + " auf Parkplatz " + (etage.parkplaetze.indexOf(parkplatz) + 1) + " geparkt.");
                return;
            }
        }
        System.out.println("Es sind keine freien Parkplätze verfügbar.");
    }

    public void autoAusfahren(String nummernschild) {
        for (Etage etage : etagen) {
            for (Parkplatz parkplatz : etage.parkplaetze) {
                if (parkplatz.istBelegt() && parkplatz.getFahrzeug().getNummernschild().equals(nummernschild)) {
                    parkplatz.verlassen();
                    System.out.println("Das Fahrzeug mit Nummernschild " + nummernschild + " wurde erfolgreich aus dem Parkhaus entfernt.");
                    return;
                }
            }
        }
        System.out.println("Das Fahrzeug mit Nummernschild " + nummernschild + " wurde nicht im Parkhaus gefunden.");
    }

    public void anzeigenFreieParkplaetze() {
        int gesamtFrei = 0;
        for (int i = 0; i < etagen.size(); i++) {
            Etage etage = etagen.get(i);
            int frei = etage.anzahlFreieParkplaetze();
            System.out.println("Auf Etage " + (i + 1) + " sind " + frei + " von " + etage.parkplaetze.size() + " Parkplätzen frei.");
            gesamtFrei += frei;
        }
        System.out.println("Insgesamt sind " + gesamtFrei + " Parkplätze frei.");
    }
}