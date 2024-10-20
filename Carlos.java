public class Carlos extends Auto {
    public Carlos(String name, double maxGeschwindigkeit, double tankInhalt, double verbrauchPro100km){
    super(name, maxGeschwindigkeit, tankInhalt, verbrauchPro100km);
    this.name = "Carlos";
    this.maxGeschwindigkeit = 20;
    this.tankInhalt = 15;
    this.verbrauchPro100km = 6;
    }

    public static void main(String[] args){
        Carlos carlosAuto = new Carlos("Carlos", 20, 15, 6);
        System.out.println(carlosAuto.toString());
        carlosAuto.beschleunigen(5.0);
        System.out.println(carlosAuto.toString());
    }
}

