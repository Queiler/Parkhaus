class Parkplatz {
    private Fahrzeug fahrzeug;

    public boolean istBelegt() {
        return fahrzeug != null;
    }

    public void parken(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    public void verlassen() {
        this.fahrzeug = null;
    }

    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }
}