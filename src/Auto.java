/* Auto erbt Nummernschild von Fahrzeuge */
public class Auto extends Fahrzeug {

    public Auto(String nummernschild) {
        super(nummernschild);
    }

    public void autoAusgabe(){
        System.out.println("Nummernschild: " + getNummernschild());
    }

}
