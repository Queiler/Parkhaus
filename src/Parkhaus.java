/* jedes Parkhaus hat eine eindeutige ID(Parkhausnummer) */
public class Parkhaus {
    private int anzahlEtagen;
    private int[] parkplatzBelegung;

    public Parkhaus(int anzahlEtagen, int parkplaetzeProEtage){
        this.anzahlEtagen = anzahlEtagen;
        parkplatzBelegung = new int[anzahlEtagen * parkplaetzeProEtage];
    }

    public void etageHinzufuegen() {
        anzahlEtagen++;
        int[] temp = new int[parkplatzBelegung.length + parkplatzBelegung.length / anzahlEtagen];
        System.arraycopy(parkplatzBelegung, 0, temp, 0, parkplatzBelegung.length);
        parkplatzBelegung = temp;
    }

    public void etageEntfernen() {
        if (anzahlEtagen > 1){
            anzahlEtagen--;
            int[] temp = new int[parkplatzBelegung.length - parkplatzBelegung.length / (anzahlEtagen + 1)];
            System.arraycopy(parkplatzBelegung, 0, temp, 0, temp.length);
            parkplatzBelegung = temp;
        }
        else {
            System.out.println("Das Parkhaus hat nur eine Etage und kann nicht weiter entfernt werden.");
        }
    }

    public void woStehtDasFahrzeug(){

    }
    public void wieVieleParkplaetzeSindNochFrei(){

    }
    public void autoFaehrtRein(){

    }
    public void autoFaehrtRaus(){

    }
    public void motorradFaehrtRein(){

    }
    public void motorradFaehrtRaus(){

    }
}
