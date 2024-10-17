import java.util.Random;

public class Rennschnecke {

    public String name;
    public double vMax; 
    public double strecke; 


    public Rennschnecke(String name, double vMax) {
        this.name = name;
        this.vMax = vMax;
    }

  
    public void krieche() {
        Random random = new Random();
        this.strecke += vMax *(random.nextInt(100)+1)/100; 
    }

    public double getvMax() {
        return vMax;
    }

    public void setvMax(double vMax) {
        this.vMax = vMax;
    }

    @Override
    public String toString() {
        return "name: " + name + ", vMax=" + vMax +
                ", strecke=" + strecke;
    }

    public static void main(String[] args) {
        Rennschnecke s1 = new Rennschnecke("Carlo", 12);
        Turboschnecke t1 = new Turboschnecke("Turbomax", 14);
        Slowmoschnecke sl1 = new Slowmoschnecke("Bob", 4);

        for(int)

        s1.krieche();
        t1.krieche(2);
        sl1.krieche();

        System.out.println(s1);
        System.out.println(t1);
        System.out.println(sl1);

    }
}

