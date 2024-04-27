import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parkhaus parkhaus = new Parkhaus();

        System.out.println("Willkommen im Parkhaus-Programm!");

        boolean running = true;
        while (running) {
            System.out.println("Menü:");
            System.out.println("1. Etage hinzufügen");
            System.out.println("2. Auto einfahren");
            System.out.println("3. Auto ausfahren");
            System.out.println("4. Anzeigen freie Parkplätze");
            System.out.println("5. Beenden");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Geben Sie die Anzahl der Parkplätze für die neue Etage ein:");
                    int anzahlParkplaetze = scanner.nextInt();
                    parkhaus.etageHinzufuegen(anzahlParkplaetze);
                    break;
                case 2:
                    System.out.println("Geben Sie das Nummernschild des einfahrenden Fahrzeugs ein:");
                    String nummernschildEinfahren = scanner.next();
                    parkhaus.autoEinfahren(new Fahrzeug(nummernschildEinfahren));
                    break;
                case 3:
                    System.out.println("Geben Sie das Nummernschild des ausfahrenden Fahrzeugs ein:");
                    String nummernschildAusfahren = scanner.next();
                    parkhaus.autoAusfahren(nummernschildAusfahren);
                    break;
                case 4:
                    parkhaus.anzeigenFreieParkplaetze();
                    break;
                case 5:
                    running = false;
                    System.out.println("Programm wird beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
        }
    }
}