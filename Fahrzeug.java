public class Fahrzeug {

    String name;
    double geschwindigkeit;
    double maxGeschwindigkeit;
    double strecke;

    public Fahrzeug(String name, double maxGeschwindigkeit){
        this.name = name;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public void beschleunigen(double beschl){
        double hypGeschwindigkeit = geschwindigkeit + beschl;
        if(hypGeschwindigkeit<maxGeschwindigkeit){
            geschwindigkeit = hypGeschwindigkeit;
        }
        else{
            geschwindigkeit = maxGeschwindigkeit;
        }
    }
    
    public double getGeschwindigkeit(){
        return geschwindigkeit;
    }

    public void bremsen(double brems){
        double hypGeschwindigkeit2 = geschwindigkeit - brems;
        if(hypGeschwindigkeit2 < 0){} else{
            geschwindigkeit = geschwindigkeit-brems;
        }
    }

    public String toString(){
        return "Fahrzeug "+name+": "+geschwindigkeit+"km/h "+ " Max.Geschwindigkeit: "+maxGeschwindigkeit;
    }
}
