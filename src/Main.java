import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Parkhaus parkhaus = new Parkhaus(1, 10);

        while (true) {
            System.out.println("Menü:");
            System.out.println("1. Etage hinzufügen");
            System.out.println("2. Etage entfernen");
            System.out.println("3. Auto fährt rein");
            System.out.println("4. Auto fährt raus");
            System.out.println("5. Motorrad fährt rein");
            System.out.println("6. Motorrad fährt raus");
            System.out.println("7. Wo steht mein Fahrzeug");
            System.out.println("8. Wie viele Parkplätze sind noch frei?");
            System.out.println("9. Welche Fahrzeuge existieren?");
            System.out.println("10. Beenden");

            int option = scan1.nextInt();
            switch (option) {
                case 1:
                    parkhaus.etageHinzufuegen();
                    break;
                case 2:
                    parkhaus.etageEntfernen();
                    break;
                case 3:
                    parkhaus.autoFaehrtRein();
                    break;
                case 4:
                    parkhaus.autoFaehrtRaus();
                    break;
                case 5:
                    parkhaus.motorradFaehrtRein();
                    break;
                case 6:
                    parkhaus.motorradFaehrtRaus();
                    break;
                case 7:
                    parkhaus.woStehtDasFahrzeug();
                    break;
                case 8:
                    parkhaus.wieVieleParkplaetzeSindNochFrei();
                    break;
                // case 9:
                //    parkhaus.welcheFahrzeugeExistieren();
                //    break;
                case 10:
                    System.out.println("Programm wird beendet.");
                    System.exit(0);
                default:
                    System.out.println("Ungültige Eingabe.");

            }
        }

    }
/*
        System.out.println("Bitte geben sie das Nummernschild ein:");
        String nummernschild = scan1.nextLine();

        Auto einAuto = new Auto(nummernschild);
        Motorrad einMotorad = new Motorrad(nummernschild);

        System.out.println("Information über das Auto:");
        einAuto.autoAusgabe();

        System.out.println("Information über das Motorrad:");
        einMotorad.radAusgabe();
    }

 */
}