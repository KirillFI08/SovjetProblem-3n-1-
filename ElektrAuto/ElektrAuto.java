package ElektrAuto;

public class ElektrAuto {
    String name;
    double maxGeschwindigkeit;
    double akkuKapazität;
    double verbrauchPro100km;
    double maxAkkukapazität;

    public ElektrAuto(String name, double maxGeschwindigkeit, double akkuKapazität, double maxAkkukapazität, double verbrauchPro100km){
        this.name = name;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.akkuKapazität = akkuKapazität;
        this.verbrauchPro100km = verbrauchPro100km;
        this.maxAkkukapazität = maxAkkukapazität;
    }

    public void fahre(double strecke){
        if(akkuKapazität<=strecke){
            System.out.println("Akku leer; gefahrene Strecke: "+akkuKapazität);
            strecke = akkuKapazität;
            akkuKapazität = 0;
        } else{
            akkuKapazität -= strecke;
            System.out.println("gefahrene Strecke: "+strecke+"; Akku: "+akkuKapazität);
          
        }
    }

    public void ladeAkku(double kapazität){
        akkuKapazität += kapazität;
        System.out.println("geladen: "+kapazität+"; Akku: "+akkuKapazität);
    }

    public double getAkkuKapazität(){
        return akkuKapazität;
    }

    public String toString(){
        return "Auto: "+name+"; maximale Geschwindigkeit: "+maxGeschwindigkeit+"; Akkukapazität: "+akkuKapazität+"; Verbrauch pro 100km: "+verbrauchPro100km;
    }
}

