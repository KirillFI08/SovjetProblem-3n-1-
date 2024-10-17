public class Turboschnecke extends Rennschnecke implements Kriechbar {

    // Konstruktor für Turboschnecke, ruft den Konstruktor der Oberklasse auf
    public Turboschnecke(String name, double vMax) {
        super(name, vMax);
    }

    // Methode für das Kriechen der Turboschnecke, wobei ein Turbo-Faktor angewendet wird
    public void krieche(int turbo) {
        setvMax(getvMax() * turbo);  // Geschwindigkeit wird mit dem Turbo multipliziert
        super.krieche();  // Die Schnecke kriecht mit der erhöhten Geschwindigkeit
        setvMax(getvMax() / turbo);  // Geschwindigkeit wird auf den ursprünglichen Wert zurückgesetzt
    }
}
