/* Jedes Fahrzeug hat eine eindeutige ID (Numernschild) */
public class Fahrzeug {
    private String nummernschild;
    public Fahrzeug(String nummernschild) {
        this.nummernschild = nummernschild;
    }

    public String getNummernschild() {
        return nummernschild;
    }

    public void setNummernschild(String nummernschild) {
        this.nummernschild = nummernschild;
    }
}
