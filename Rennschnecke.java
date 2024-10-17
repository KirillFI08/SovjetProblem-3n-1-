import java.util.Random;

public class Rennschnecke {

    // Variablen für den Namen der Schnecke, die maximale Geschwindigkeit und die zurückgelegte Strecke
    public String name;
    public double vMax; 
    public double strecke; 

    // Konstruktor zur Initialisierung der Schnecke mit Namen und maximaler Geschwindigkeit
    public Rennschnecke(String name, double vMax) {
        this.name = name;
        this.vMax = vMax;
        this.strecke = 0;  // Initialisierung der Strecke auf 0
    }

    // Methode, die die Schnecke eine zufällige Strecke kriechen lässt
    public void krieche() {
        Random random = new Random(); 
        // Die Strecke wird um einen zufälligen Anteil der maximalen Geschwindigkeit erhöht
        this.strecke += vMax * (random.nextInt(100) + 1) / 100.0; 
    }

    // Getter-Methode für die maximale Geschwindigkeit
    public double getvMax() {
        return vMax;
    }

    // Setter-Methode für die maximale Geschwindigkeit
    public void setvMax(double vMax) {
        this.vMax = vMax;
    }

    // Überschreibung der toString-Methode für die Ausgabe der Schneckeninformationen
    @Override
    public String toString() {
        return "name: " + name + ", vMax=" + vMax +
                ", strecke=" + strecke;
    }

    // Hauptmethode zum Testen der Rennschnecke und ihrer Unterklassen

    public static void main(String[] args) {
        // Erstellen von Schnecken-Objekten
        Rennschnecke s1 = new Rennschnecke("Carlo", 12);
        Turboschnecke t1 = new Turboschnecke("Turbomax", 14);
        Slowmoschnecke sl1 = new Slowmoschnecke("Bob", 4);
    
        // Eine Schleife für die Simulation von genau 10 Kriechvorgängen
        for (int i = 0; i < 10; i++) {
            s1.krieche();  // Normales Kriechen für die normale Schnecke
            t1.krieche(2);  // Turboschnecke mit Turbo
            sl1.krieche();  // Slowmoschnecke kriecht, Turbo wird automatisch gesteuert
    
            // Ausgabe nach jedem Kriechvorgang
            System.out.println(s1);
            System.out.println(t1);
            System.out.println(sl1);
            System.out.println(" ");
        }
    }
}