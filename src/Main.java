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
            System.out.println("2. Fahrzeug rein fahren");
            System.out.println("3. Fahrzeug raus fahren");
            System.out.println("4. Anzeigen freie Parkplätze");
            System.out.println("5. Nach Nummernschild suchen");
            System.out.println("6. Beenden");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Geben Sie die Anzahl der Parkplätze für die neue Etage ein:");
                    int anzahlParkplaetze = scanner.nextInt();
                    parkhaus.etageHinzufuegen(anzahlParkplaetze);
                    break;
                case 2:
                    System.out.print("Geben Sie das Modell des Fahrzeugs ein: ");
                    String modell = scanner.nextLine();
                    System.out.print("Geben Sie das Nummernschild des Fahrzeugs ein: ");
                    String nummernschild = scanner.nextLine();
                    System.out.print("Wählen Sie den Fahrzeugtyp (1 für Auto, 2 für Motorrad): ");
                    int fahrzeugTypOption = scanner.nextInt();
                    scanner.nextLine();
                    String typ = fahrzeugTypOption == 1 ? "Auto" : "Motorrad";
                    Fahrzeug fahrzeug = new Fahrzeug(modell, nummernschild, typ);
                    parkhaus.autoEinfahren(fahrzeug);
                    break;
                case 3:
                    System.out.println("Geben Sie das Nummernschild des ausfahrenden Fahrzeugs ein:");
                    String nummernschildAusfahren = scanner.next();
                    parkhaus.FahrzeugAusfahren(nummernschildAusfahren);
                    break;
                case 4:
                    parkhaus.anzeigenFreieParkplaetze();
                    break;
                case 5:
                    System.out.print("Geben Sie das Nummernschild ein, nach dem Sie suchen möchten: ");
                    String nummernschildSuche = scanner.nextLine();
                    parkhaus.sucheNachNummernschild(nummernschildSuche);
                    break;
                case 6:
                    running = false;
                    System.out.println("Programm wird beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
        }
    }
}