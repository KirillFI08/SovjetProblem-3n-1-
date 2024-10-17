public class Slowmoschnecke extends Rennschnecke implements Kriechbar {


    public Slowmoschnecke(String name, double vMax){
        super(name, vMax);
    }

    public void krieche(int turbo){
        if(int counter; counter<10){
        setvMax(getvMax()/2);
        super.krieche();
        setvMax(getvMax()*2);
        int counter;
        counter++;
        }else{
            setvMax(getvMax()*turbo*100);
            super.krieche();
            setvMax(getvMax()/turbo/100);
            counter=0;
        }

        

    }


    
}
