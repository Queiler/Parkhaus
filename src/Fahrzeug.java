class Fahrzeug {
    private final String nummernschild;
    private final String modell;
    private final String typ;

    public Fahrzeug(String modell, String nummernschild, String typ) {
        this.nummernschild = nummernschild;
        this.modell = modell;
        this.typ = typ;
    }

    public String getNummernschild() {
        return nummernschild;
    }
    public String getModell() {
        return modell;
    }

    public String getTyp() {
        return typ;
    }
}