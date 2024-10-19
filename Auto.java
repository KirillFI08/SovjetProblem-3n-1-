public class Auto extends Fahrzeug {
    double tankInhalt;
    double verbrauchPro100km;

    public Auto(String name, double maxGeschwindigkeit, double tankInhalt, double verbrauchPro100km) {
        super(name, maxGeschwindigkeit);
        this.tankInhalt = tankInhalt;
        this.verbrauchPro100km = verbrauchPro100km;
    }

    public void fahre(double strecke){
        double verbrauch = (verbrauchPro100km / 100) * strecke;  
        if(tankInhalt >= verbrauch){
            tankInhalt -= verbrauch;  
            System.out.println(name + " hat " + strecke + " km zurückgelegt.");
        } else {
            System.out.println("Nicht genug Treibstoff für diese Strecke.");
        }
    }

    public void tanken(double liter){
        tankInhalt += liter;  
        System.out.println(name + " hat " + liter + " Liter getankt. Neuer Tankinhalt: " + tankInhalt + " Liter.");
    }

    @Override
    public String toString(){
        return "Fahrzeug " + name + ": " + geschwindigkeit + " km/h, Max. Geschwindigkeit: " + maxGeschwindigkeit 
                + ", Tankinhalt: " + tankInhalt + " Liter, Verbrauch (pro 100 km): " + verbrauchPro100km + " Liter.";
    }
}

