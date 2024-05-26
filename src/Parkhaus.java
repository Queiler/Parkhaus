import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Parkhaus {
    private final ArrayList<Etage> etagen;
    private final Set<String> nummernschilder;

    public Parkhaus() {
        etagen = new ArrayList<>();
        nummernschilder = new HashSet<>();
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
        String nummernschild = fahrzeug.getNummernschild();
        if (nummernschilder.contains(nummernschild)) {
            System.err.println("Das Fahrzeug mit dem Nummernschild [" + nummernschild + "] ist bereits im Parkhaus.\n");
            return;
        }

        for (Etage etage : etagen) {
            if (etage.anzahlFreieParkplaetze() > 0) {
                Parkplatz parkplatz = etage.naechsterFreierParkplatz();
                parkplatz.parken(fahrzeug);
                nummernschilder.add(nummernschild);
                System.out.println("Das Fahrzeug (" + fahrzeug.getModell() + ") mit dem Nummernschild [" + nummernschild + "] wurde auf Etage " + (etagen.indexOf(etage) + 1) + " auf Parkplatz " + (etage.parkplaetze.indexOf(parkplatz) + 1) + " geparkt.\n");
                return;
            }
        }
        System.err.println("Es sind keine freien Parkplätze verfügbar.\n");
    }


    public void FahrzeugAusfahren(String nummernschild) {
        for (Etage etage : etagen) {
            for (Parkplatz parkplatz : etage.parkplaetze) {
                if (parkplatz.istBelegt() && parkplatz.getFahrzeug().getNummernschild().equals(nummernschild)) {
                    parkplatz.verlassen();
                    System.out.println("Das Fahrzeug mit dem Nummernschild [" + nummernschild + "] wurde erfolgreich aus dem Parkhaus entfernt.\n");
                    return;
                }
            }
        }
        System.err.println("Das Fahrzeug mit dem Nummernschild [" + nummernschild + "] wurde nicht im Parkhaus gefunden.\n");
    }

    public void anzeigenFreieParkplaetze() {
        int gesamtFrei = 0;
        for (int i = 0; i < etagen.size(); i++) {
            Etage etage = etagen.get(i);
            int frei = etage.anzahlFreieParkplaetze();
            System.out.println("Auf Etage " + (i + 1) + " sind " + frei + " von " + etage.parkplaetze.size() + " Parkplätzen frei.\n");
            gesamtFrei += frei;
        }
        System.out.println("Insgesamt sind " + gesamtFrei + " Parkplätze frei.\n");
    }

    public void sucheNachNummernschild(String nummernschild) {
        for (int i = 0; i < etagen.size(); i++) {
            Etage etage = etagen.get(i);
            for (int j = 0; j < etage.parkplaetze.size(); j++) {
                Parkplatz parkplatz = etage.parkplaetze.get(j);
                if (parkplatz.istBelegt() && parkplatz.getFahrzeug().getNummernschild().equals(nummernschild)) {
                    System.out.println("Das Fahrzeug mit dem Nummernschild [" + nummernschild + "] befindet sich auf Etage " + (i + 1) + ", Parkplatz " + (j + 1) + ".\n");
                    return;
                }
            }
        }
        System.err.println("Das Fahrzeug mit dem Nummernschild [" + nummernschild + "] wurde nicht im Parkhaus gefunden.\n");
    }
}