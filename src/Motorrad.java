/* Motorrad erbt Nummernschild von Fahrzeuge */
public class Motorrad extends Fahrzeug{

    public Motorrad(String nummernschild) {
        super(nummernschild);
    }
    public void radAusgabe(){
        System.out.println("Nummernschild: " + getNummernschild());
    }

}
