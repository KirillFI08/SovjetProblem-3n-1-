public class Slowmoschnecke extends Rennschnecke implements Kriechbar {

    private int counter = 0;  // Zählervariable zur Steuerung des Turbo-Einsatzes

    // Konstruktor für Slowmoschnecke, ruft den Konstruktor der Oberklasse auf
    public Slowmoschnecke(String name, double vMax){
        super(name, vMax);
    }

    // Methode für das Kriechen der Slowmoschnecke ohne Turbo-Parameter
    @Override
    public void krieche(){
        // Wenn der Zähler kleiner als 10 ist, schleicht die Schnecke
        if (counter < 10) {
            setvMax(getvMax() / 2);  // Geschwindigkeit wird halbiert
            super.krieche();  // Die Schnecke kriecht mit halber Geschwindigkeit
            setvMax(getvMax() * 2);  // Geschwindigkeit wird wieder verdoppelt
            counter++;  // Zähler wird um 1 erhöht
        } else {
            // Wenn der Zähler 10 erreicht, wird der Turbo aktiviert
            setvMax(getvMax() * 100);  // Geschwindigkeit wird stark erhöht
            super.krieche();  // Die Schnecke kriecht mit Turbo-Geschwindigkeit
            setvMax(getvMax() / 100);  // Geschwindigkeit wird auf den ursprünglichen Wert zurückgesetzt
            counter = 0;  // Zähler wird zurückgesetzt
        }
    }
}
