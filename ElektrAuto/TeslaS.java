package ElektrAuto;

public class TeslaS extends ElektrAuto {
    public TeslaS(String name, double maxGeschwindigkeit, double akkuKapazität, double maxAkkukapazität,
            double verbrauchPro100km) {
        super(name, maxGeschwindigkeit, akkuKapazität, maxAkkukapazität, verbrauchPro100km);
    }

    public static void main(String[] args) {
        ElektrAuto tesla = new ElektrAuto("Tesla Model S", 250, 100, 400, 15);
        System.out.println(tesla.toString()); // Sollte eine Übersicht über den Zustand des Autos geben
        tesla.fahre(50); // Sollte die Akkukapazität nach 50 km Fahrt ausgeben
        tesla.ladeAkku(300); // Sollte den Akku um 20 Einheiten aufladen
        tesla.fahre(100);
        System.out.println(tesla.toString());
    }
}
